package com.example.restapi.config;

import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
//    private static final String SCHEMA_VALIDATION_FILE = "/validation.json";
//
//    @Bean
//    public JsonSchema jsonSchema() {
//        SchemaValidatorsConfig config = SchemaValidatorsConfig.builder()
//                .errorMessageKeyword("errorMessage")
//                .build();
//
//        JsonSchemaFactory factory = JsonSchemaFactory.builder(JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7))
//                .jsonMapper(new ObjectMapper()) // optional if you're customizing mapping
//                .build();
//
//        return factory.getSchema(getClass().getResourceAsStream(SCHEMA_VALIDATION_FILE), config);
//    }
@Bean
public JsonSchemaFactory jsonSchemaFactory() {

    return JsonSchemaFactory.builder(JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7))
            .build();
}
}
