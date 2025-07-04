//package com.example.restapi.controller;
//
//import com.example.model.Person;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.validation.Valid;
//
//@RestController
//@RequestMapping("/api/person")
//public class PersonController {
//
//    @PostMapping
//    public ResponseEntity<String> processPerson(@Valid @RequestBody Person person) {
//        StringBuilder response = new StringBuilder();
//        response.append("Person Details:\n");
//        response.append("First Name: ").append(person.getFirstName()).append("\n");
//        response.append("Last Name: ").append(person.getLastName()).append("\n");
//        response.append("Age: ").append(person.getAge()).append("\n");
//        response.append("Email: ").append(person.getEmail()).append("\n");
//        response.append("Gender: ").append(person.getGender());
//
//        return ResponseEntity.ok(response.toString());
//    }
//}