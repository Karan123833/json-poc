package com.example.restapi.controller;

import com.example.restapi.service.JsonSchemaValidationService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonSchemaController {
    @Autowired
    private JsonSchemaValidationService service;

    @PostMapping("/validate")
    public ResponseEntity<String> validateEvent(@RequestBody JsonNode jsonNode) {
        String result = service.validateJson(jsonNode, "schema/person-schema.json");
        return ResponseEntity.ok(result);
    }
//
//    @PostMapping("/validate/person")
//    public ResponseEntity<String> validatePerson(@RequestBody JsonNode jsonNode) {
//        return ResponseEntity.ok(service.validateJson(jsonNode, "/schemas/person-schema.json"));
//    }
}
