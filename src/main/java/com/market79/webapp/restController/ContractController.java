package com.market79.webapp.restController;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.market79.webapp.dao.ContractDAO;
import com.market79.webapp.dto.ContractDTO;
import com.market79.webapp.util.Util;

@RestController
@MapperScan(basePackages = "com.market79.webapp.dao")
public class ContractController {
	//DB필드와 map파라미터명의 일치
		@Autowired
		private ContractDAO contractDAO;
		@Autowired
		private Util util;
		
		@GetMapping("/contract/all")
		public List<ContractDTO> getClient1(@RequestParam HashMap<String, String> map) throws Exception {
			ContractDTO dto = new ContractDTO();
			util.setDtoParameter(dto, map);		
			return contractDAO.getContract(dto);
		}
}
