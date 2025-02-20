package com.imatia.price_service.controller;

import com.imatia.price_service.dto.PriceDTO;
import com.imatia.price_service.service.PriceService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/api/prices")
public class PriceController {

    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping
    public ResponseEntity<?> getPrice(
            @RequestParam("applicationDate")
            @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss") LocalDateTime applicationDate,
            @RequestParam("productId") Long productId,
            @RequestParam("brandId") Integer brandId) {

        Optional<PriceDTO> priceDTOOpt = priceService.getApplicablePriceDTO(brandId, productId, applicationDate);
        return priceDTOOpt
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
