package com.harish.mockito.test_doubles.stub;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracticeStubTest {

    @Test
    public void stubTest()
    {
        PracticeBookRepositoryStub practiceBookRepositoryStub = new PracticeBookRepositoryStub();

        PracticeBookService practicebookservice = new PracticeBookService(practiceBookRepositoryStub);

        List<Book> newBookswithdiscount = practicebookservice.getNewBookswithAppliedDiscount(10,5);

        assertEquals(2,newBookswithdiscount.size());

        assertEquals(450, newBookswithdiscount.get(0).getPrice());
        assertEquals(360, newBookswithdiscount.get(1 ).getPrice());

    }
}
