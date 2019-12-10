package com.test.testSql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "Curso")
public class Curso {
	@Id
    @Column(name = "id")
    Integer id;
 
    @Column(name = "nombrec")
    String nombrec;
 
    @Column(name = "cantidad")
    Integer cantidad;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombrec() {
		return nombrec;
	}

	public void setNombrec(String nombrec) {
		this.nombrec = nombrec;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
    
    
}




 
    
 
