package ar.edu.ies6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.ies6.model.Materia;
import ar.edu.ies6.service.IMateriaService;


@Controller
public class MateriaController {
	@Autowired
	Materia unMateria;
	
	@Autowired
	@Qualifier ("servicioMateriaBD")
	IMateriaService materiaService;

	
	@GetMapping ("/materias")
	public  ModelAndView getWithMaterias() {
		//codigo
		//transporte hacia la vista
		ModelAndView transportador = new ModelAndView("formMateria");
		transportador.addObject ("materia", unMateria);
		
		return transportador;
	}
	@PostMapping ("/guardarMateria")
public  ModelAndView guardarMateria(Materia materia) {

//MateriaServiceImp materiaService = new MateriaServiceImp ();
materiaService.guardarMateria(materia);

ModelAndView transportador = new ModelAndView("listaMateria");
transportador.addObject ("listadoMateria", materiaService.listarTodosMateria());
 return transportador;
}

}
	
