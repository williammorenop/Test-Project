package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.*;

@RestController
@CrossOrigin(origins = "*")
public class CursoServicio {
	
	@Autowired
	CursoRepositorio sampleRepo;
	
	@GetMapping ("/employees4")
	Iterable<Curso> all(){
		System.out.println("1");
		return sampleRepo.findAll();
	}
			
	
}
