package com.imatia.price_service.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PriceDTO {
    private Long productId;
    private Integer brandId;
    private Integer priceList;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal price;

    public PriceDTO(Long productId, Integer brandId, Integer priceList, LocalDateTime startDate, LocalDateTime endDate, BigDecimal price) {
        this.productId = productId;
        this.brandId = brandId;
        this.priceList = priceList;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public Integer getPriceList() {
        return priceList;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
