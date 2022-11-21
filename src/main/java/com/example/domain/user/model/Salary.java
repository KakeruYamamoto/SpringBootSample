package com.example.domain.user.model;

import lombok.Data;

/**
 * 給与テーブルのエンティティクラス
 */
@Data
public class Salary {

	private String userId;
	private String yearMonth;
	private Integer salary;
}
