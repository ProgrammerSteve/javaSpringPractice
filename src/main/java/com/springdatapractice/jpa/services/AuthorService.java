package com.springdatapractice.jpa.services;

import com.springdatapractice.jpa.models.Author;
import com.springdatapractice.jpa.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public List<Author> findAllByFirstName(String name){
        return repository.findAllByFirstName(name);
    }


}
