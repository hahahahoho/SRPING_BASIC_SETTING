package com.market79.webapp.restController;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.market79.webapp.dao.ClientDAO;
import com.market79.webapp.dto.ClientDTO;
import com.market79.webapp.util.Util;


@RestController
@MapperScan(basePackages = "com.market79.webapp.dao")
public class ClientController {
	//DB필드와 map파라미터명의 일치
	@Autowired
	private ClientDAO clientDAO;
	@Autowired
	private Util util;
		
	
	//전체 고객 목록 조회
	//map parameter : name(이름), insert_date(날짜), process_status(진행상태), black_yn(블랙리스트)
	@GetMapping("/client/all")
	public List<ClientDTO> getClient1(@RequestParam HashMap<String, String> map) throws Exception {
		ClientDTO dto = new ClientDTO();
		util.setDtoParameter(dto, map);		
		return clientDAO.getClient(dto);
	}
	//고객 목록 조회(페이징)
	//map parameter : name(이름), insert_date(날짜), process_status(진행상태), black_yn(블랙리스트)
	//url parameter : page(페이지번호)
	//defalut count : 10
	@GetMapping("/client/page/{page}")
	public List<ClientDTO> getClient2(@RequestParam HashMap<String, String> map, @PathVariable String page) throws Exception {	
		ClientDTO dto = new ClientDTO();
		util.setDtoParameter(dto, map);
		dto.setPage((Integer.parseInt(page)*10)-10);
		return clientDAO.getClient(dto);
	}
	//고객 목록 조회(페이징, 카운트)
	//map parameter : name(이름), insert_date(날짜), process_status(진행상태), black_yn(블랙리스트)
	//url parameter : page(페이지번호), count(리스트갯수)
	@GetMapping("/client/page/{page}/count/{count}")
	public List<ClientDTO> getClient3(@RequestParam HashMap<String, String> map, @PathVariable String page, @PathVariable String count) throws Exception {	
		ClientDTO dto = new ClientDTO();
		util.setDtoParameter(dto, map);
		dto.setPage((Integer.parseInt(page)*10)-10);
		dto.setCount(Integer.parseInt(count));
		return clientDAO.getClient(dto);
	}
	
	//고객 저장
	//map parameter : name(이름), email(이메일), phone(핸드폰), field(분야), contact_type(연락방법), process_status(진행사항)
	//map parameter : black_yn(블랙리스트여부), meet_date(미팅확정일자), memo(메모) 
	@PostMapping("/client")
	public int createClient(@RequestParam HashMap<String, String> map) throws Exception {
		ClientDTO dto = new ClientDTO();
		util.setDtoParameter(dto, map);
		return clientDAO.createClient(dto);
	}
	
	//고객 수정
	//map parameter : name(이름), email(이메일), phone(핸드폰), field(분야), contact_type(연락방법), process_status(진행사항)
	//map parameter : black_yn(블랙리스트여부), meet_date(미팅확정일자), memo(메모)
	@PutMapping("/client")
	public int updateClient(@RequestParam HashMap<String, String> map)throws Exception {
		ClientDTO dto = new ClientDTO();
		util.setDtoParameter(dto, map);
		return clientDAO.updateClient(dto);
	}
}
