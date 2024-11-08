package ar.edu.ies6.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

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
	   @Column
	    private boolean estado;
	   @ManyToOne
	   @JoinColumn(name = "docente_id")
	   private Docente docente;

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

		public boolean isEstado() {
			return estado;
		}

		public void setEstado(boolean estado) {
			this.estado = estado;
		}

		public Docente getDocente() {
			return docente;
		}

		public void setDocente(Docente docente) {
			this.docente = docente;
		}
		
		

 }

		
	