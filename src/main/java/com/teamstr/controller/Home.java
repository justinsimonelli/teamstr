package com.teamstr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teamstr.model.User;
import com.teamstr.repo.UserRepository;

@Controller
public class Home {
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/")
    String home() {
		userRepo.deleteAll();
		
		userRepo.save(new User("mark"));
		
		
		userRepo.save(new User("matt"));
		
		System.out.println("-------------------------------");
		System.out.println("Contains: " + userRepo.count());
		for (User user : userRepo.findAll()) {
			System.out.println(user);
		}
		
        return "index";
    }

}
