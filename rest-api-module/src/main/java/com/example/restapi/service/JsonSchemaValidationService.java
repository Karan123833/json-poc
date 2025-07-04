package com.example.restapi.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SchemaValidatorsConfig;
import com.networknt.schema.ValidationMessage;
import com.sun.codemodel.JForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Set;

@Service
public class JsonSchemaValidationService {

//    @Autowired
//    private JsonSchema jsonSchema;
//
//    public String validateJson(JsonNode jsonNode) {
//        Set<ValidationMessage> errors = jsonSchema.validate(jsonNode);
//
//        if (errors.isEmpty()) {
//            return "Valid JSON";
//        } else {
//            return "Invalid JSON: " + errors;
//        }
//    }
    @Autowired
    private JsonSchemaFactory jsonSchemaFactory;

    public String validateJson(JsonNode jsonNode, String schemaName) {
        try {
            SchemaValidatorsConfig config = SchemaValidatorsConfig.builder()
                .errorMessageKeyword("errorMessage")
                .build();

            String schemaPath = schemaName;
            JsonSchema schema = jsonSchemaFactory.getSchema(
                    getClass().getClassLoader().getResourceAsStream(schemaPath), config);
//            InputStream schemaStream = getClass().getClassLoader().getResourceAsStream(schemaName);
//            if (schemaStream == null) {
//                return "Schema not found: " + schemaName;
//            }

            JsonSchema schema1 = jsonSchemaFactory.getSchema(schema.getSchemaNode(), config);
            Set<ValidationMessage> errors = schema1.validate(jsonNode);

            if (errors.isEmpty()) {
                return "Valid JSON";
            } else {
                for (ValidationMessage error : errors) {
                    System.out.println(error);
                }
                return "Invalid JSON: " + errors;
            }
        } catch (Exception e) {
            return "Schema validation error: " + e.getMessage();
        }
    }
}
