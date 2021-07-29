package com.rubypaper.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.service.GetSetService;

@RestController
public class InitController {
	@Autowired
	GetSetService getSetService;
	
	@GetMapping("/initSessionSave")
	public String initSessionSave(HttpSession httpSession) {
		httpSession.setAttribute("hellp", "eric");
		return "session saved";
	}
	
	@GetMapping("/initGetSet")
	public String init() {
		// GetSetService 내용 수행
		getSetService.test();
		
		return "initGetSet";
	}

}
