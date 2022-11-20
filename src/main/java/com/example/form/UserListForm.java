package com.example.form;

import lombok.Data;

/**
 * 画面から入力されたユーザー検索条件を持つためのクラス
 * 
 *
 */
@Data
public class UserListForm {

	private String userId;
	private String userName;

}
