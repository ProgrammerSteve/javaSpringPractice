package com.springdatapractice.jpa.controllers;

import com.springdatapractice.jpa.models.Author;
import com.springdatapractice.jpa.services.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/getAuthorsByFirstName/{first-name}")
    public List<Author> getAuthorsByFirstName(
            @PathVariable("first-name") String firstName
    ){
        return authorService.findAllByFirstName(firstName);
    }
}
