package com.harish.mockito.test_doubles.dummy;

import com.harish.mockito.test_doubles.Dummy.Book;
import com.harish.mockito.test_doubles.Dummy.BookRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository {

    Map<String,Book> bookStore = new HashMap<>();
    @Override
    public void save(Book book) {
        bookStore.put(book.getBookId(),book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookStore.values();
    }
}
