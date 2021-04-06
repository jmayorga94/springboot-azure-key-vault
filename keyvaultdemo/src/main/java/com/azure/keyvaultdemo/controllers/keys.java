package com.azure.keyvaultdemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class keys {

	@GetMapping("get")
    public String get() {
        return testConnection;
    }
	
	@GetMapping("get-con")
    public String getCon() {
        return connectionString2;
    }
	
	  @Value("${testconnection}")
	  private String testConnection = "defaultValue\n";
	  
	  @Value("${connectionString2}")
	  private String connectionString2 = "defaultValue\n";

}
