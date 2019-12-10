package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.*;

@RestController
@CrossOrigin(origins = "*")
public class CursoXEstudianteServicio {
	@Autowired
	CursoXEstudianteRepositorio sampleRepo;
	
	@GetMapping ("/employees3")
	Iterable<CursoXEstudiante> all(){
		return sampleRepo.findAll();
	}

}
