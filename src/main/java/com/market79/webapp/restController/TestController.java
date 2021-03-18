package com.market79.webapp.restController;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.market79.webapp.dao.TestDAO;
import com.market79.webapp.dto.TestDTO;

@RestController
@MapperScan(basePackages = "com.market79.webapp.dao")
public class TestController {
	
	@Autowired
	private TestDAO testDAO;
	
	
	
	@RequestMapping("/")
	public String root() {
		return "test";
	}
	@RequestMapping("/getUser")
	public List<TestDTO> users() throws Exception {
		final TestDTO param = new TestDTO(null ,null, null);
		return testDAO.selectTest(param);
	}
	
}
