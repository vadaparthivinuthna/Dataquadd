package com.example.Spring_inf.dao;

import com.example.Spring_inf.dto.Person;
import com.example.Spring_inf.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Persondao {

    @Autowired
    private PersonRepo personRepo;

    public Person saveperson(Person person){
        return personRepo.save(person);
    }
}
