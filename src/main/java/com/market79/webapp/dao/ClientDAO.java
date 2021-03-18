package com.market79.webapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.market79.webapp.dto.ClientDTO;

@Mapper
public interface ClientDAO {
	List<ClientDTO> getClient(ClientDTO param) throws Exception;    //고객 리스트
	int createClient(ClientDTO param) throws Exception;     //고객 입력
	int updateClient(ClientDTO param) throws Exception;  //고객 수정
}
