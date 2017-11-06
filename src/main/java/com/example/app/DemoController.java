package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Person;
import com.example.domain.PersonRepository;

@Controller
public class DemoController {
	@Autowired
	PersonRepository personRepository;
	
	@ResponseBody
	@GetMapping("/demo")
	Person test() {
		return personRepository.findOne(1);
	}
	
	@ResponseBody
	@GetMapping("/")
	String version() {
		return "1.2.2";
	}
}
