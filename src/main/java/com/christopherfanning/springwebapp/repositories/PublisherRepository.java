package com.christopherfanning.springwebapp.repositories;

import com.christopherfanning.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
