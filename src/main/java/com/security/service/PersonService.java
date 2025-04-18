package com.security.service;

import com.security.persistence.entity.Person;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    //@PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public Optional<Person> findById() {
        Optional<Person> personOptional = Optional.of(new Person(1L, "Santiago", "Perez", 10000.0));

        return personOptional;
    }

    //@PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public List<Person> findAll() {
        return List.of(
                new Person(1L, "Santiago", "Perez", 10000.0),
                new Person(2L, "Anyi", "Hoyos", 20000.0),
                new Person(3L, "Andrea", "Calle", 150000.0));
    }
}
