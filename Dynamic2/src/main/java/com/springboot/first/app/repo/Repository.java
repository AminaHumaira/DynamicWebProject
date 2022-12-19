package com.springboot.first.app.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.first.app.Entity.Pojo;



public interface Repository extends JpaRepository<Pojo,Integer> 
{

	Pojo findById(int id);
	

}
