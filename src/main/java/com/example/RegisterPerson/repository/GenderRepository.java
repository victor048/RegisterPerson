package com.example.RegisterPerson.repository;

import com.example.RegisterPerson.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender, Long> {
}
