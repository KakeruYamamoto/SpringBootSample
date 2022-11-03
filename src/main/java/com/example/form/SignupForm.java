package com.example.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {

	@NotBlank
	@Email
	private String userId;

	@NotBlank
	@Length(min = 4, max = 100)
	@Pattern(regexp = "^[a-zA-Z0-9]+$")
	private String password;

	@NotBlank
	private String userName;

	// Date型にバインドする際には、@DateTimeFromatアノテーションを使う。
	// バインドとは・・・画面の入力内容とJavaのクラスをマッピングすること
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	@NotNull
	private Date birthday;

	@Min(20)
	@Max(100)
	private Integer age;

	@NotNull
	private Integer gender;

	/**
	 * バリデーション用アノテーションメモ
	 * '@NotBlank  
	 * 		⇒Nullでないことをチェックする
	 * '@Email
	 * 		⇒文字列がメールアドレス形式か動かをチェックする
	 * '@Length(min = 4, max = 100)
	 * 		⇒文字列の長さが、指定した範囲内であるかをチェックする。
	 * '@Pattern(regexp = "^[a-zA-Z0-9]+$")
	 * 		⇒指定した正規表現に一致するかチェックする（今回は半角英数字を指定）
	 * '@Min(20)
	 * 		⇒指定した値以上であることをチェックする
	 * '@Max(100)
	 * 		⇒指定した値以下であることを確認する
	 * 
	 * 
	 */

}
