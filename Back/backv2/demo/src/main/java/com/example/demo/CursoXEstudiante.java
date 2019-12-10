package com.example.demo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "CursoXEstudiante")
@NamedQueries({
    @NamedQuery(name = "CursoXEstudiante.findAll", query = "SELECT c FROM CursoXEstudiante c")
    , @NamedQuery(name = "CursoXEstudiante.findById", query = "SELECT c FROM CursoXEstudiante c WHERE c.id = :id")})
public class CursoXEstudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @JoinColumn(name = "id_curso", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Curso idCurso;
    @JoinColumn(name = "id_estudiante", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Estudiante idEstudiante;

    public CursoXEstudiante() {
    }

    public CursoXEstudiante(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }

    public Estudiante getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Estudiante idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CursoXEstudiante)) {
            return false;
        }
        CursoXEstudiante other = (CursoXEstudiante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.CursoXEstudiante[ id=" + id + " ]";
    }
    
}

