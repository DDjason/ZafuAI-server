package com.zafu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zafu.model.Person;

@Controller
public class UserController {
	@RequestMapping("login")
	public @ResponseBody Person login() {
		String name = "jason";
		Person person = new Person();
		person.setAge(23);
		person.setName("jason");
		return person;
	}
}
