package com.globalin.biz.employee.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalin.biz.employee.EmployeeService;
import com.globalin.biz.employee.EmployeeVO;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO EmployeeDAO;
	
	public void setEmployeeDAO(EmployeeDAO EmployeeDAO) {
		this.EmployeeDAO = EmployeeDAO;
	}

	@Override
	public EmployeeVO getEmployee(EmployeeVO vo) {
		return EmployeeDAO.getUser(vo);
	}

}
