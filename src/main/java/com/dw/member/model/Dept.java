package com.dw.member.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dw_dept")
public class Dept {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dept_id")
	private long id; // pk
	@Column
	private String dname;// 부서이름
}
