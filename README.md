# Library Document Management System

This is a Java project that models a library document management system. The system manages three types of documents:
books, magazines, and historical scripts. The business rule for each document type is defined as follows:

    Books: If the library doesn't rent out any book to anyone in the last 48 hours, all books go on 20% discount for a month
    Magazines: If the library doesn't rent out any magazine to anyone in the last 48 hours, all magazines go on 20% discount for a month
    Historical Scripts: If the library doesn't rent out any historical scripts to anyone in the last 48 hours, all historical scripts go on 20% discount for a month

## Classes

The project consists of the following classes:

    Document: This is the abstract base class that defines the common properties and methods of all the different types of documents in the library.
    Book, Magazine, and HistoricalScript: These are concrete classes that inherit from the Document class and implement the business rule specific to each document type.
    Library: This is the main class that holds a collection of Document objects and provides methods to add a document, get all the documents, 
    and apply discounts to all the eligible documents.

## How to Use

The implementation of the Library class in the main method demonstrates the use of the other classes. In this
implementation, we create some Book, Magazine, and HistoricalScript objects and add them to the library. We then set the
lastRentedAt property for some of the documents to simulate the scenario where these documents haven't been rented out
in the last 48 hours. Finally, we call the applyDiscounts method to apply discounts to the eligible documents and print
out the title and price of all the documents before and after the discount.
How to Compile and Run

To compile the project, open a terminal window, navigate to the project directory, and run the following command:

```bash
  javac *.java
```

To run the project, use the following command:

```bash
  java Library
```

## Author

This project was developed by _**Mohammed Abdu**_.