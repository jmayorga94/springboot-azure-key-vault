package com.azure.keyvaultdemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class keys {

	@Value("${testconnection}")
	private String testConnection = "defaultValue\n";
	  
	@GetMapping("get")
    public String get() {
        return testConnection;
    }
}
