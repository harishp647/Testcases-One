package com.harish.mockito.test_doubles.spy;

public class BookRepositorySpy implements BookRepository{

    int saveCalled = 0;
    Book lastSavedBook = null;
    @Override
    public void save(Book book) {
        saveCalled++;
        lastSavedBook = book;
    }

    public int timesCalled()
    {
        return saveCalled;
    }

    public boolean lastSavedBook(Book book)
    {
        return lastSavedBook.equals(book);
    }
}
