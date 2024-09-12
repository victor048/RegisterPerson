package com.example.RegisterPerson.controller;

import com.example.RegisterPerson.model.Person;
import com.example.RegisterPerson.service.PersonService;
import com.example.RegisterPerson.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private GenderService genderService;

    @GetMapping("/new")
    public String showPersonForm(Model model) {
        model.addAttribute("person", new Person());
        model.addAttribute("genders", genderService.findAll());
        return "person-form";
    }

    @PostMapping
    public String savePerson(@ModelAttribute Person person) {
        System.out.println("Saving person: " + person);
        System.out.println("Person Birthday: " + person.getBirthday());

        if (person.getBirthday() == null) {
            System.out.println("Birthday is null.");
            return "redirect:/persons/new";
        }

        personService.save(person);
        return "redirect:/persons";
    }

    @GetMapping("/{id}")
    public String editPerson(@PathVariable("id") Long id, Model model) {
        model.addAttribute("person", personService.findById(id).orElseThrow(() -> new RuntimeException("Person not found")));
        model.addAttribute("genders", genderService.findAll());
        return "person-form";
    }

    @GetMapping
    public String listPersons(Model model) {
        model.addAttribute("persons", personService.findAll());
        return "person-list";
    }

    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable("id") Long id) {
        personService.deleteById(id);
        return "redirect:/persons";
    }
}
