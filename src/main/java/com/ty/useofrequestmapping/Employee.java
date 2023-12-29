package com.ty.useofrequestmapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/com/ty")
public class Employee {
	

	
	@GetMapping("/save")
	public String saveEmployee(String name)
	{
		
		return "saved";
	}
	
	@GetMapping("/getall")
	public String getAllEmployee()
	{
		return "GetallEmployees";
	}

	
	@GetMapping("/update")
	public String updateEMployee()
	{
		return "Upadted";
	}
	
	@GetMapping("/delete")
	public String deleteEMployee(String name)
	{
		return "DeleteEmployee";
	}
	
}
