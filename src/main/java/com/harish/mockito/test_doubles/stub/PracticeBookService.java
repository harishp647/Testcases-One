package com.harish.mockito.test_doubles.stub;

import java.util.List;

public class PracticeBookService {

    private PracticeBookRepository practiceBookRepository;

    public PracticeBookService(PracticeBookRepository practiceBookRepository) {
        this.practiceBookRepository = practiceBookRepository;
    }

   public List<Book> getNewBookswithAppliedDiscount(int discountPrice, int days)
    {
        List<Book> newbooks = practiceBookRepository.getAllBooks(days);

        //500 -> 500%10 -> 50 -> 500 -50 =  450 ->

        for(Book book : newbooks)
        {
            int price = book.getPrice();
            int newPrice = price - (price*discountPrice)/100;
            book.setPrice(newPrice);
        }
        return newbooks;
    }

}
