package com.harish.mockito.test_doubles.spy;

import com.harish.mockito.test_doubles.spy.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class demoSpy {

    @Test
    public void SpyTest()
    {
        BookRepositorySpy bookRepositorySpy = new BookRepositorySpy();
        BookService bookService = new BookService(bookRepositorySpy);

        Book book1 = new Book("1234","Mockito In Action",500, LocalDate.now());
        Book book2 = new Book("1235","JUnit5 In Action",400,LocalDate.now());

        bookService.addBook(book1);
        bookService.addBook(book2);

    //    assertEquals(2,bookRepositorySpy.timesCalled());
    //    assertTrue(bookRepositorySpy.lastSavedBook(book2));
        assertEquals(1,bookRepositorySpy.timesCalled());
        assertTrue(bookRepositorySpy.lastSavedBook(book1));



    }
}
