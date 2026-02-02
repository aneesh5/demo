package com.example.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class DemoLambdaHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        return "Welcome: " + input;
    }
}


