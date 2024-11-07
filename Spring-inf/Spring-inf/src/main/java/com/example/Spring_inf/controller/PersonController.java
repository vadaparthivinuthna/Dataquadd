package com.example.Spring_inf.controller;

import com.example.Spring_inf.dto.Person;
import com.example.Spring_inf.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
   private PersonService personService;
    @PostMapping("/save")
    public ResponseEntity<Person> saveperson(@RequestBody Person person){
        return new ResponseEntity<>(personService.saveperson(person).getBody(), HttpStatus.CREATED);
    }
}
