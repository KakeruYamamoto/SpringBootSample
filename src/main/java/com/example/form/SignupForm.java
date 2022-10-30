package com.example.form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {
	private String userId;
	private String password;
	private String userName;

	// Date型にバインドする際には、@DateTimeFromatアノテーションを使う。
	// バインドとは・・・画面の入力内容とJavaのクラスをマッピングすること
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date birthday;
	private Integer age;
	private Integer gender;

}
