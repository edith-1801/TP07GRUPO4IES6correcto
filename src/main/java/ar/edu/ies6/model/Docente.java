package ar.edu.ies6.model;

import org.springframework.stereotype.Component;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Docente {

    @Id
    private String dni;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String materia;

    @Column
    private String legajo;

    @Column
    private Boolean estado = true; 
    //@OneToMany
    //private List<Materia> materias;

    public Docente() {}

    public Docente(String dni, String nombre, String apellido, String materia, String legajo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.legajo = legajo;
        this.estado = true;
    }

  
    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
}

