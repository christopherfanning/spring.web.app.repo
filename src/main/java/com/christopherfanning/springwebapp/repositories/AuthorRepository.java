package com.christopherfanning.springwebapp.repositories;

import com.christopherfanning.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
