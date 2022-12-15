package com.dw.member.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//테이블이름은 소문자로
@Entity
@Table(name = "dw_member")
@Getter
@Setter
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id; // pk
	@Column(length = 30)
	private String name;// 멤버이름
	@Column
	private int age; // 나이
	@Column(length = 40)
	private String userId;
	@Column
	private String userPassword;

	// @JoinColumn => member테이블에 dept_id라는 컬럼(FK)생성
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Dept dept;
}
