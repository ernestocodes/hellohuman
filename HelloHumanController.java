package com.ernesto.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class HelloHumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value = "firstname", required = false) String searchQuery,
			@RequestParam(value = "lastname", required = false) String searchQuery2) {
		if (searchQuery == null) {
			return "Hello Human.";
		} else {
			return "Hello " + searchQuery + " " + searchQuery2;
		}
	}
}