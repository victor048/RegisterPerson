package com.example.RegisterPerson.repository;

import com.example.RegisterPerson.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
