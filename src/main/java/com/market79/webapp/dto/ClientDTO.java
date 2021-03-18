package com.market79.webapp.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientDTO {
	private String seq;
	private String name;
	private String email;
	private String phone;
	private String field;
	private String contact_type;
	private String process_status;
	private String black_yn;
	private String meet_date;
	private String memo;
	private String insert_date;
	private String update_date;
	//paging처리
	private int page;
	private int count;
}
