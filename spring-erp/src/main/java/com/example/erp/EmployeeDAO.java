package com.example.erp;

import java.util.List;

public interface EmployeeDAO {
	
	// 검색조건과 일치하는 전체데이터행의 갯수 조회
	int getRowCount(SearchForm searchForm);
	
	// 검색조건과 일치하는 데이터 조회하기
	List<Employee> getEmployees(SearchForm searchForm);
}