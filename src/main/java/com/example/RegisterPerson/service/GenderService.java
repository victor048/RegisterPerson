package com.example.RegisterPerson.service;

import com.example.RegisterPerson.model.Gender;
import com.example.RegisterPerson.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderService {

    private final GenderRepository genderRepository;

    @Autowired
    public GenderService(GenderRepository genderRepository) {
        this.genderRepository = genderRepository;
        initializeGenders();
    }

    private void initializeGenders() {
        if (genderRepository.count() == 0) {
            genderRepository.save(new Gender("Male"));
            genderRepository.save(new Gender("Female"));
        }
    }

    public List<Gender> findAll() {
        return genderRepository.findAll();
    }

    public Gender findById(Long id) {
        return genderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Gender not found with id: " + id));
    }

    public Gender save(Gender gender) {
        return genderRepository.save(gender);
    }

    public void deleteById(Long id) {
        genderRepository.deleteById(id);
    }
}
