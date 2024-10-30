package ar.edu.ies6.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity

	public class Materia {
	
		//atributos
	   @Id
	   private String codigo;
	   @Column
        private String nombre;
	   @Column
	    private String año;
	   @Column
	    private String carrera;
	   
	    public Materia() {
			// TODO Auto-generated constructor stub
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCodigo() {
			return codigo;
		}
		

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getAño() {
			return año;
		}

		public void setAño(String string) {
			this.año = string;
		}

		public String getCarrera() {
			return carrera;
		}

		public void setCarrera(String carrera) {
			this.carrera = carrera;
		}

 }

		
	