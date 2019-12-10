package com.test.testSql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CursoService {

	@Autowired
	CursoRepository sampleRepo;

	@GetMapping("/employees")
	Iterable<Curso> all() {
		return sampleRepo.findAll();
	}
}
