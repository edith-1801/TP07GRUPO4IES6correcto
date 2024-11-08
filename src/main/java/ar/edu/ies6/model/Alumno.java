package ar.edu.ies6.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Component
@Entity
public class Alumno {
	@Id
	private String dni;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private Boolean estado;
	@ManyToMany (mappedBy="alumnos")
	private List<Materia> materias;

	
	public Alumno() {}
	
	 // Constructor con parámetros
    public Alumno(String dni, String nombre, String apellido, Boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado= estado;
    }
	
	 
	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	 public boolean isEstado() {
	        return estado;
	    }

	    public void setEstado(boolean estado) {
	        this.estado = estado;
	    }

		public List<Materia> getMaterias() {
			return materias;
		}

		public void setMaterias(List<Materia> materias) {
			this.materias = materias;
		}
	
	
		
	

}
