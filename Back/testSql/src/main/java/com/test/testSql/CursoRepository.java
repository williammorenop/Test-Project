package com.test.testSql;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface CursoRepository extends CrudRepository<Curso, Integer>{

}
