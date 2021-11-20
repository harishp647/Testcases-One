package com.harish.mockito.test_doubles.fake;

public class PracticeBookService {

    private PracticeBookRepository practiceBookRepository;

    public PracticeBookService(PracticeBookRepository practiceBookRepository) {
        this.practiceBookRepository = practiceBookRepository;
    }

    public PracticeBook addBook(PracticeBook practicebook)
    {
        practiceBookRepository.save(practicebook);
        return practicebook;
    }

    public int findAllBooks()
    {
       return practiceBookRepository.findAll().size();
    }
}
