/**
 * 
 */
package com.example.demo1.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vikasbhardwaj
 *
 */

@RestController
public class GreetingController {
	
     @GetMapping("/greeting")
	 public String getGreeting()
	 {
		 return "Hello from Spring Controller...";
	 }
	 
}
