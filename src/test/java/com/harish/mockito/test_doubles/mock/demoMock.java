package com.harish.mockito.test_doubles.mock;


import com.harish.mockito.test_doubles.mock.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class demoMock {

    @Test
    public void demoMockTest()
    {
        BookRepositoryMock bookRepositoryMock = new BookRepositoryMock() ;
        BookService bookService = new BookService(bookRepositoryMock);

        Book book1 = new Book("1234","Mockito In Action",500, LocalDate.now());
        Book book2 = new Book("1235","JUnit5 In Action",400,LocalDate.now());

        bookService.addBook(book1); // return
        bookService.addBook(book2); // svae was called

        bookRepositoryMock.verify(book2,1);

    }
}
