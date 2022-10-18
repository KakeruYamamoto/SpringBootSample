package com.example.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UserApplicationService {

	//** 性別のMapを生成す */
	@GetMapping("/login")
	public String getLogin() {
		return "login/login";
	}

}
