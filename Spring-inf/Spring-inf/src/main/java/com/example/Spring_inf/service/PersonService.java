package com.example.Spring_inf.service;

import com.example.Spring_inf.dao.Persondao;
import com.example.Spring_inf.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private Persondao persondao;

    public ResponseEntity<Person> saveperson(Person person){
        Person prs = persondao.saveperson(person);
        return new ResponseEntity<>(prs, HttpStatus.OK);
    }
}
