package org.spring.api;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	public String Greet(){
		return "Hello";
	}
}
