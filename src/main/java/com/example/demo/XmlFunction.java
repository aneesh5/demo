package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class XmlFunction {

    @Bean
    public Function<String, String> processXml() {
        return input -> "Processed XML: " + input;
    }
}

