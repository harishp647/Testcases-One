package com.harish.mockito.test_doubles.stub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PracticeBookRepositoryStub implements PracticeBookRepository{
    @Override
    public List<Book> getAllBooks(int days) {

        List<Book> newbooks = new ArrayList<>();
        Book book1 = new Book("1234","Mockito In Action",500, LocalDate.now());
        Book book2 = new Book("1235","JUnit5 In Action",400,LocalDate.now());
        newbooks.add(book1);
        newbooks.add(book2);

        return newbooks;
    }
}
