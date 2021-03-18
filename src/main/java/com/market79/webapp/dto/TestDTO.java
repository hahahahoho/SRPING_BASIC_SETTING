package com.market79.webapp.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class TestDTO {
	private String no;
	private String email;
	private Date insert_date;
}
