package com.example.Spring_inf.controller;

import com.example.Spring_inf.dto.Person;
import com.example.Spring_inf.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
   private PersonService personService;
    @PostMapping("/saveperson")
    public ResponseEntity<Person> saveperson(@RequestBody Person person){
        return new ResponseEntity<>(personService.saveperson(person).getBody(), HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity updateperson(@PathVariable int id, Person person){
        return new ResponseEntity(personService.updateperson(id,person).getBody(),HttpStatus.OK);
    }
    @GetMapping("/fetch")
    public ResponseEntity fetchperson(@RequestParam int id){
        return personService.fetchperson(id);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteperson(int id){
        return new ResponseEntity(personService.deleteperson(id),HttpStatus.OK);
    }



}
