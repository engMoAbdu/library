package com.library;

import com.library.document.AbstractDocument;
import com.library.document.Book;
import com.library.document.HistoricalScript;
import com.library.document.Magazine;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author moabdu
 * @version v0.1
 * @createdAt 2/9/23
 * @since 2023
 */
public class Library {

    private final List<AbstractDocument> documents;

    public Library() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(AbstractDocument document) {
        this.documents.add(document);
    }

    public List<AbstractDocument> getDocuments() {
        return Collections.unmodifiableList(documents);
    }

    public void applyDiscounts() {
        for (AbstractDocument document : documents) {
            document.applyDiscount();
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Quran", 10.0);
        Book book2 = new Book("Hadith", 15.0);
        Magazine magazine1 = new Magazine("National Geographic", 5.0);
        Magazine magazine2 = new Magazine("Time", 7.0);
        HistoricalScript script1 = new HistoricalScript("Egyptian History", 20.0);
        HistoricalScript script2 = new HistoricalScript("Great History", 25.0);

        library.addDocument(book1);
        library.addDocument(book2);
        library.addDocument(magazine1);
        library.addDocument(magazine2);
        library.addDocument(script1);
        library.addDocument(script2);

        System.out.println("Before discount: \n");

        for (AbstractDocument document : library.getDocuments()) {
            System.out.println(document.getTitle() + ": " + document.getPrice());
        }

        book1.setLastRentedAt(LocalDateTime.now().minus(49, ChronoUnit.HOURS));
        magazine1.setLastRentedAt(LocalDateTime.now().minus(49, ChronoUnit.HOURS));
        script1.setLastRentedAt(LocalDateTime.now().minus(49, ChronoUnit.HOURS));

        library.applyDiscounts();

        System.out.println("\n=================================================");

        System.out.println("\nAfter discount: \n");
        for (AbstractDocument document : library.getDocuments()) {
            System.out.println(document.getTitle() + ": " + document.getPrice());
        }
    }
}