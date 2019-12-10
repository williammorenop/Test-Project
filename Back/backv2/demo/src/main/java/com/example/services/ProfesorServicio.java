package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.*;

@RestController
@CrossOrigin(origins = "*")
public class ProfesorServicio {
	@Autowired
	ProfesorRepositorio sampleRepo;
	
	@GetMapping ("employees")
	Iterable<Profesor> all(){
		return sampleRepo.findAll();
	}

}
