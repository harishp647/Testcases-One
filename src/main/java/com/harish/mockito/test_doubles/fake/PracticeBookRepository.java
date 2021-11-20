package com.harish.mockito.test_doubles.fake;

import java.util.Collection;

public interface PracticeBookRepository {

    void save(PracticeBook practicebook);
    Collection<PracticeBook> findAll();
}
