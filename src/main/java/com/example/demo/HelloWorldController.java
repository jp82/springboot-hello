package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
import org.springframework.web.bind.annotation.GetMapping;

@RestController  
public class HelloWorldController   
{  
//@RequestMapping("/")
@GetMapping("/")
public String hello()   
{  
	return "{\"Status\":\"Ok\"}";  
}  
}  