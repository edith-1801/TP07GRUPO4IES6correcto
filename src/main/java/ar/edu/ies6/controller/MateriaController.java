package ar.edu.ies6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.ies6.model.Materia;
import ar.edu.ies6.repository.DocenteRepository;
import ar.edu.ies6.service.IMateriaService;


@Controller
public class MateriaController {
	@Autowired
	Materia unMateria;
	
	@Autowired
	@Qualifier ("servicioMateriaBD")
	IMateriaService materiaService;
@Autowired
DocenteRepository docenteRepository;
	
	@GetMapping ("/materias")
	public  ModelAndView getWithMaterias() {
		//codigo
		//transporte hacia la vista
		ModelAndView transportador = new ModelAndView("formMateria");
		transportador.addObject ("materia", unMateria);
		transportador.addObject ("band", false);
		transportador.addObject ("docentes", docenteRepository.findAll());
	
		return transportador;
	
	}
	@PostMapping ("/guardarMateria")
public  ModelAndView guardarMateria(Materia materia) {

//MateriaServiceImp materiaService = new MateriaServiceImp ();
materiaService.guardarMateria(materia);

ModelAndView transportador = new ModelAndView("listaMateria");
transportador.addObject ("listadoMateria", materiaService.listarTodoMateriasActivos());
 return transportador;
}
	@GetMapping ("/listadoMateria")
	public  ModelAndView getAllMateria() {
		//codigo
		//transporte hacia la vista
		ModelAndView transportador = new ModelAndView("ListaMateria");
		transportador.addObject ("listadoMateria", materiaService.listarTodoMateriasActivos());
		
		return transportador;
	}
	
	
	
	//eliminar
	@GetMapping ("/eliminarMateria/{codigo}")
	public  ModelAndView deleteMateria (@PathVariable(name="codigo") String codigo) {
		materiaService.eliminarMateria(codigo);
		//mostrar el nuevo listado
		 ModelAndView modelView = new  ModelAndView ("listaMateria");
		 modelView.addObject ("listadoMateria", materiaService.listarTodoMateriasActivos());
				 return modelView;
		
	}

	//modificar
	@GetMapping ("/modificarMateria/{codigo}")
	public  ModelAndView modificarMateria (@PathVariable(name="codigo") String codigo) {
		//el parametro del connstructor ModelAndView es una vista html ,tambien se puede a gregar objectos al modelandview
		ModelAndView modelView = new  ModelAndView ("formMateria");
		
	modelView.addObject("materia",materiaService.consultarMateria(codigo));
	modelView.addObject("band",true);
		
		
		
		 return modelView;
}
}
	
