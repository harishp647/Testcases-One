package com.harish.mockito.test_doubles.fake;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracticeFakeTest {


    @Test
    public void testBook()
    {

        BookRepository bookRepository = new FakeBookRepository();
        BookService bookService = new BookService(bookRepository);

        bookService.addBook(new Book("647","HarryPotter",500, LocalDate.now()));

        bookService.addBook(new Book("1234","Mockito In Action",250,LocalDate.now()));
        bookService.addBook(new Book("1235","JUnit5 In Action",200,LocalDate.now()));

        assertEquals(3,bookService.findNumberOfBooks());

    }
}
