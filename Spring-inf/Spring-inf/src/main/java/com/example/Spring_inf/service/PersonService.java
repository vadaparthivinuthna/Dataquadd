package com.example.Spring_inf.service;

import com.example.Spring_inf.dao.Persondao;
import com.example.Spring_inf.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private Persondao persondao;

    public ResponseEntity<Person> saveperson(Person person){
        Person prs = persondao.saveperson(person);
        return new ResponseEntity<>(prs, HttpStatus.OK);
    }

    public ResponseEntity  updateperson(int id ,Person person){
        Optional<Person> db = persondao.updateperson(id);
        if(db.isPresent()){
           return new ResponseEntity<Person>(db.get(),HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("the id is not found",HttpStatus.NOT_FOUND);
        }
    }
}
