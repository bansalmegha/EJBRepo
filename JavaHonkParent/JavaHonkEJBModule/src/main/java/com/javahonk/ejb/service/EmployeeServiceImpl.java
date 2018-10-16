package com.javahonk.ejb.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.javahonk.ejb.dto.EmployeeDTO;


/**
 * Session Bean implementation class EmployeeServiceImpl
 */
@Stateless
@LocalBean
public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public List getALLEmployees() {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setFirstName("AA");
		dto.setLastName("BB");
		dto.setEmail("mb@emsw.de");
		dto.setPhoneNumber("678");
		List<EmployeeDTO> employeeList = new ArrayList<>();
		employeeList.add(dto);
		return employeeList;
	}



}
