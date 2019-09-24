package com.infy.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.infy.account.entity.Employee;
import com.infy.account.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;

	@RequestMapping(value = "/employee/{EMP_ID}", method = RequestMethod.GET)
	public Employee getDetails(@PathVariable Integer employeeId) {
		return accountService.getEmpDetails(employeeId);

	}
}
