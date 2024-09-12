package com.example.RegisterPerson.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "gender")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_gender")
    private Long idGender;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    public Gender() {}

    public Gender(String name) {
        this.name = name;
    }
}
