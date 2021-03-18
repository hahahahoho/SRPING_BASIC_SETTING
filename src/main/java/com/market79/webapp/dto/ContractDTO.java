package com.market79.webapp.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ContractDTO {
	private int no;
	private String contractor_name;
	private String company_name;
	private String product_name;
	private String phone;
	private String address;
	private String email;
	private char oem;
	private char odm;
	private char contents;
	private char sale;
	private Date insert_date;
	private Date finish_status;
	
	//paging처리
	private int page;
	private int count;
}
