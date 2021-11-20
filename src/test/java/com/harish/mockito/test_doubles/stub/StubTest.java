package com.harish.mockito.test_doubles.stub;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StubTest {


    @Test
    public void booksWithDiscountTest()
    {
        BookRepository bookRepository = new StubBookRepository();
        BookService bookService = new BookService(bookRepository);

       List<Book> newBooksWithDiscount = bookService.getNewBooksWithAppliedDiscount(10,5);
        bookService.getNewBooksWithAppliedDiscount(5,5);

        assertEquals(2,newBooksWithDiscount.size());
        assertEquals(200,newBooksWithDiscount.get(1).getPrice());

    }
}
