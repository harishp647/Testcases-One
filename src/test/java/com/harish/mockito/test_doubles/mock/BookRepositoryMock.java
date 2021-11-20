package com.harish.mockito.test_doubles.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookRepositoryMock implements BookRepository {

    int saveCalled = 0;
    Book lastSavedBook = null;
    @Override
    public void save(Book book) {
        saveCalled++;
        lastSavedBook = book;
    }

    public int saveCalled()
    {
        return saveCalled;
    }

//    public boolean lastSavedBook(Book book)
//    {
//        return  lastSavedBook.equals(book);
//    }

    public void verify(Book book,int timesCalled)
    {
        assertEquals(timesCalled,saveCalled);
        assertEquals(book,lastSavedBook);
    }
}
