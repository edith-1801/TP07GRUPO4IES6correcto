package ar.edu.ies6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MateriaController {
	@GetMapping ("/materias")
	public String getMaterias() {
		//codigo
		return "formMateria";
	}
	

}

