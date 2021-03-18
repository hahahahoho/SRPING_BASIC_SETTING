package com.market79.webapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.market79.webapp.dto.TestDTO;

@Mapper
public interface TestDAO {
	List<TestDTO> selectTest(TestDTO param) throws Exception;
}
