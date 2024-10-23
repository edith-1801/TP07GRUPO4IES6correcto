package ar.edu.ies6.model;

import org.springframework.stereotype.Component;

@Component
public class Docente {
    private String dni;
    private String nombre;
    private String apellido;
    private String materia;
    private String legajo;

    public Docente() {}

    public Docente(String dni, String nombre, String apellido, String materia, String legajo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.legajo = legajo;
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
