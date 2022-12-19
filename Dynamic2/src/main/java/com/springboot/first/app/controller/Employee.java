package com.springboot.first.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.first.app.Entity.Pojo;
import com.springboot.first.app.repo.Repository;

@Controller
public class Employee
{
	
	@Autowired 
	Repository repo;
	
	@RequestMapping("/home")
	public String homepage()
	{
		return "home.jsp";
	}
	@PostMapping("/postdata")
	@ResponseBody
	public String postdata(Pojo p)
	{
		repo.save(p);	
		return "data added successfully";
	}
	@GetMapping("/getdata")
	@ResponseBody
	public List<Pojo> getdata()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/deletedata")
	@ResponseBody
	public String deletedata(@RequestParam("id")int id)
	{
		repo.deleteById(id);
		return "deleted successfully";
	}
	
	@RequestMapping("/putdata")
	@ResponseBody
	public String updatedata(@RequestParam("id")int id,@RequestParam("name")String name,@RequestParam("department")String department,@RequestParam("salary")int salary)
	{
		Pojo obj=repo.findById(id);
		obj.setId(id);
		obj.setName(name);
		obj.setDepartment(department);
		obj.setSalary(salary);
		repo.save(obj);
		return "updated successfully";
	}
}


	


