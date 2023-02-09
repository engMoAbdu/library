package com.library.document;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author moabdu
 * @version v0.1
 * @createdAt 2/9/23
 * @since 2023
 */
public class Book extends AbstractDocument {
    public Book(String title, double price) {
        super(title, price);
    }

    @Override
    public void applyDiscount() {
        if (isDiscountEligible()) {
            setPrice(getPrice() * 0.8);
        }
    }

    @Override
    public boolean isDiscountEligible() {
        LocalDateTime now = LocalDateTime.now();
        return getLastRentedAt() == null ||
                now.minus(48, ChronoUnit.HOURS).isAfter(getLastRentedAt());
    }
}
