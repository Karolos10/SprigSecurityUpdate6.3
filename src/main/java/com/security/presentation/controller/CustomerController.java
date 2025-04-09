package com.security.presentation.controller;

import com.security.configuration.annotation.IsEmployee;
import com.security.persistence.entity.Person;
import com.security.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authorization.method.AuthorizeReturnObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final PersonService personService;

    @GetMapping("/admin")
    //@PreAuthorize("hasRole('ADMIN')")
    //@IsEmployee({"ADMIN"})
    public String sayHelloAdmin() {
        return "Hello World Admin";
    }

    @GetMapping("/user")
    //@PreAuthorize("hasRole('USER')")
    //@IsEmployee({"USER"})
    public String sayHelloUser() {
        return "Hello World User";
    }

    @GetMapping("/invited")
    //@PreAuthorize("hasRole('INVITED')")
    //@IsEmployee({"INVITED"})
    public String sayHelloInvited() {
        return "Hello World Invited";
    }

    @GetMapping("/find")
    @AuthorizeReturnObject
    public Person findById(){
        return this.personService.findById().orElseThrow();
    }

    @GetMapping("/findAll")
    @AuthorizeReturnObject
    public List<Person> findAll(){
        return personService.findAll();
    }

    @GetMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password){
        return "";
    }
}
