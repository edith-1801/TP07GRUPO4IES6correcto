package ar.edu.ies6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.model.Alumno;
import ar.edu.ies6.service.imp.AlumnoServiceImp;

@Controller
public class IndexController {
	
	
	//SpringBoot Springframework
	
	@GetMapping ("/index")
	public String getIndex() {
		//codigo
		
		return "index";
	}
	
	@GetMapping ("/alumno")
	public ModelAndView getIndexWithAlumno() {
		//codigo
		Alumno unAlumno =new Alumno();
		
		//unAlumno.setApellido("Martinez");
		//unAlumno.setNombre("Edith");
		//unAlumno.setDni("37305495");
		
		
		ModelAndView transportador = new ModelAndView("index");
		transportador.addObject("alumno", unAlumno);
		
		return transportador;
	}
	@PostMapping ("/guardarAlumno")	
	public ModelAndView guardarAlumno(Alumno alumno) {	
	
	
		AlumnoServiceImp alumnoService = new AlumnoServiceImp();
		alumnoService.guardarAlumno(alumno);
		
	ModelAndView transportador = new ModelAndView("avisoExito");
	//transportador.addObject("alumno", unAlumno);
	return transportador;
		
		
		
		
		

	}
	

}
