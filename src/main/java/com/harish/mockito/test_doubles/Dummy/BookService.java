package com.harish.mockito.test_doubles.Dummy;

public class BookService {
    private BookRepository bookRepository;
    private EmailService emailservice;

    public BookService(BookRepository bookRepository, EmailService emailservice) {
        this.bookRepository = bookRepository;
        this.emailservice = emailservice;
    }

    public void addBook(Book book)
    {
        bookRepository.save(book);
    }

    public int findNumberOfBooks()
    {
        return bookRepository.findAll().size();
    }
}
