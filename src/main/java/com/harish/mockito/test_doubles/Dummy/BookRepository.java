package com.harish.mockito.test_doubles.Dummy;

import java.util.Collection;

public interface BookRepository {

   void save(Book book);
   Collection<Book> findAll();
}
