package com.market79.webapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.market79.webapp.dto.ContractDTO;

@Mapper
public interface ContractDAO {
	List<ContractDTO> getContract(ContractDTO param) throws Exception;    //계약 리스트
	int createContract(ContractDTO param) throws Exception;     //계약 입력
	int updateContract(ContractDTO param) throws Exception;  //계약 수정
	
}
