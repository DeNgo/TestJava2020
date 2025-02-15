package com.imatia.price_service.service;

import com.imatia.price_service.model.Price;
import com.imatia.price_service.repository.PriceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PriceService {

    private final PriceRepository priceRepository;

    public PriceService(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public Optional<Price> getApplicablePrice(Integer brandId, Long productId, LocalDateTime applicationDate) {
        List<Price> prices = priceRepository.findApplicablePrices(brandId, productId, applicationDate);
        return prices.stream().findFirst();
    }
}
