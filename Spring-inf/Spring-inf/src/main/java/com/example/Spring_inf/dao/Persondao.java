package com.example.Spring_inf.dao;

import com.example.Spring_inf.dto.Person;
import com.example.Spring_inf.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class Persondao {

    @Autowired
    private PersonRepo personRepo;

    public Person saveperson(Person person){
        return personRepo.save(person);
    }

    public Optional<Person> updateperson(int id){
        return personRepo.findById(id);
    }
    public Optional<Person> fetchperson(int id){
        return personRepo.findById(id);
    }
    public Optional<Person> deleteperson(int id){
        return personRepo.findById(id);
    }
}