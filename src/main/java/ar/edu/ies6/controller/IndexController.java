package ar.edu.ies6.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.model.Alumno;
import ar.edu.ies6.service.IAlumnoService;

@Controller
public class IndexController {
	
	@Autowired
	Alumno unAlumno;
	
	
	@Autowired
	@Qualifier("servicioAlumnoBD")
	IAlumnoService alumnoService;
	
	
	//SpringBoot Springframework
	
	// Método para la vista de bienvenida
    @GetMapping("/inicio")
    public String mostrarPaginaInicial() {
        return "inicio"; // Nombre de la nueva plantilla para la bienvenida
    }
	
	@GetMapping ("/index")
	public String getIndex() {
		//codigo
		
		return "index";
	}
	
	@GetMapping ("/alumno")
	public ModelAndView getIndexWithAlumno() {
	
		
		ModelAndView transportador = new ModelAndView("index");
		transportador.addObject("alumno",unAlumno);
		transportador.addObject("band", false);
		
		return transportador;
	}
	
	@GetMapping ("/listadoAlumnos")
	public ModelAndView getAllAlumno() {
		ModelAndView transportador = new ModelAndView("listaAlumnos");
		transportador.addObject("listadoAlumnos",alumnoService.listarTodosAlumnosActivos());
		return transportador;
		
	}
	
	
	@PostMapping ("/guardarNuevoAlumno")	
	public ModelAndView guardarAlumno(Alumno alumno) {	
		System.out.println("DNI: " + alumno.getDni());
	    System.out.println("Nombre: " + alumno.getNombre());
	    System.out.println("Apellido: " + alumno.getApellido());
	    
	
	    
	    alumnoService.guardarAlumno(alumno);
	    
		  ModelAndView transportador = new ModelAndView("listaAlumnos");
		    transportador.addObject("listadoAlumnos", alumnoService.listarTodosAlumnosActivos());
		    return transportador;
	}
		
	public class AlmacenAlumnos {
	    public static List<Alumno> alumnos = new ArrayList<>();

	   // static {
	     //   alumnos.add(new Alumno("12345678", "Juan", "Perez"));
	       // alumnos.add(new Alumno("87654321", "Maria", "Gomez"));
	}
	// metoto eliminar alumno
	
	@GetMapping("/eliminarAlumno/{dni}")
	public ModelAndView deleteAlumno(@PathVariable(name="dni")String dni){ 
	alumnoService.eliminarAlumno(dni);
	
	//mostrar nuevo listado
	ModelAndView modelView = new ModelAndView("listaAlumnos");
    modelView.addObject("listadoAlumnos", alumnoService.listarTodosAlumnosActivos());
    return modelView;
    
	
	}
	
	//modificar
	@GetMapping("/modificarAlumno/{dni}")
	public ModelAndView mofificarAlumno (@PathVariable(name="dni")String dni) {
		//el parametro del constructor de ModelAndView es una html
		ModelAndView modelView = new ModelAndView("index");
	    modelView.addObject("alumno", alumnoService.consultarAlumno(dni));
	    modelView.addObject("band", true);
	   
	    return modelView;
	}
}

		
		
		
		

	
	


