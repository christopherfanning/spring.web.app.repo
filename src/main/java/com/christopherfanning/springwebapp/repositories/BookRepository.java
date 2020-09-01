package com.christopherfanning.springwebapp.repositories;

import com.christopherfanning.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
