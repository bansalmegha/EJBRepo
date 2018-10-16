package com.javahonk.ejb.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;

import com.javahonk.ejb.dto.EmployeeDTO;

@Remote
public interface EmployeeService {
	List getALLEmployees();

}
