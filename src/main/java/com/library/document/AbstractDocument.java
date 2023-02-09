package com.library.document;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author moabdu
 * @version v0.1
 * @createdAt 2/9/23
 * @since 2023
 */

@Getter
@Setter
public abstract class AbstractDocument {

    public abstract void applyDiscount();

    public abstract boolean isDiscountEligible();

    private String title;
    private double price;
    private LocalDateTime lastRentedAt;

    public AbstractDocument(String title, double price) {
        this.title = title;
        this.price = price;
    }
}
