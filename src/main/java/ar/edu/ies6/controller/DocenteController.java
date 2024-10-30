package ar.edu.ies6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.model.Docente;
import ar.edu.ies6.service.IDocenteService;

@Controller
public class DocenteController {
    
    @Autowired
    Docente unDocente;
    
    @Autowired
    @Qualifier("servicioDocenteBD")
    IDocenteService docenteService;

    @GetMapping("/docente")
    public ModelAndView getIndexWithDocente() {
        ModelAndView transportador = new ModelAndView("formularioDocente");
        transportador.addObject("docente", unDocente);
        transportador.addObject("band", false);
        return transportador;
    }
    
    @GetMapping("/listadoDocentes")
    public ModelAndView getAllDocente() {
        ModelAndView transportador = new ModelAndView("listaDocentes");
        transportador.addObject("listadoDocentes", docenteService.listarTodosDocenteActivos());
        return transportador;
    }


    @PostMapping("/guardarNuevoDocente")
    public ModelAndView guardarDocente(Docente docente) {
        docenteService.guardarDocente(docente);
        ModelAndView transportador = new ModelAndView("listaDocentes");
        transportador.addObject("listadoDocentes", docenteService.listarTodosDocenteActivos());
        return transportador;
    }

    @GetMapping("/eliminarDocente/{dni}")
    public ModelAndView deleteDocente(@PathVariable(name="dni") String dni) {
        docenteService.eliminarDocente(dni);
        ModelAndView modelView = new ModelAndView("listaDocentes");
        //mostrar el nuevo listado
        modelView.addObject("listadoDocentes", docenteService.listarTodosDocenteActivos());
        return modelView;
    }
    
    //modificar
    @GetMapping("/modificarDocente/{dni}")
	public ModelAndView modificarDocente(@PathVariable(name="dni") String dni) {
    	// el parametro del constructor ModelAdView es una vista de html
      	 ModelAndView modelView = new ModelAndView("formularioDocente");
      	 
         modelView.addObject("docente", docenteService.consultarDocente(dni));
         modelView.addObject("band", true);
         
         
    	 return modelView;
    
}

}