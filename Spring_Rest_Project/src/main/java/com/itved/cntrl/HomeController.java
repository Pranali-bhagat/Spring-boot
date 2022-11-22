package com.itved.cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itved.entity.Employee;
import com.itved.service.EmpService;

@RestController

public class HomeController {

	@Autowired
	private EmpService service;
	
	
	@GetMapping("/employee/id/{id}")
	public Employee getEmpById(@PathVariable int id) {
		Employee e = service.getById(id);
		return e;
	}
	
	@GetMapping("/all")
	public List<Employee> allEmployee() {
		return service.findAllRecords();
	}
	
	@PostMapping("/add")
	public String addRecord(@RequestBody Employee e ) {
		service.add(e);
		return "ok";
	}
	
	@PutMapping("/update")
	public String updateRecord(@RequestBody Employee e) {
		service.update(e);
		return "OK";
}
}
