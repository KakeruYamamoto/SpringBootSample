package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@Autowired
	private HelloService service;

	@GetMapping("/hello")
	public String getHello() {
		//hello.htmlに画面遷移
		return "hello";
	}

	@PostMapping("/hello")
	public String postRequest(@RequestParam("text1") String str, Model moedel) {

		///画面から受け取った文字列をModelに登録
		moedel.addAttribute("sample", str);

		///response.htmlに画面遷移
		return "hello/response";
	}

	@PostMapping("hello/db")
	public String postDbRequest(@RequestParam("text2") String id, Model mode) {

		//1件検索
		Employee employee = service.getEmployee(id);

		//検索結果をModelに登録
		mode.addAttribute("employee", employee);

		//db.thmlに画面遷移
		return "hello/db";

	}
}