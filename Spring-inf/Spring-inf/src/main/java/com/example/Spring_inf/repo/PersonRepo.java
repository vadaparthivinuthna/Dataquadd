package com.example.Spring_inf.repo;

import com.example.Spring_inf.dto.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer> {
}
