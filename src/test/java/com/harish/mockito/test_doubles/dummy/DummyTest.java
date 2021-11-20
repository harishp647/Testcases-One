package com.harish.mockito.test_doubles.dummy;

import com.harish.mockito.test_doubles.Dummy.Book;
import com.harish.mockito.test_doubles.Dummy.BookRepository;
import com.harish.mockito.test_doubles.Dummy.BookService;
import com.harish.mockito.test_doubles.Dummy.EmailService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {



    @Test
    public void bookTest()
    {
        BookRepository bookRepository = new FakeBookRepository();
        EmailService emailService = new DummyEmailService();

        BookService bookService = new BookService(bookRepository,emailService);

        bookService.addBook(new Book("777","Action",40, LocalDate.now()));
        bookService.addBook(new Book("7","Actn",400, LocalDate.now()));

        assertEquals(2,bookService.findNumberOfBooks());
    }
}
