package ar.edu.ies6.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    private IDocenteService docenteService;

    @GetMapping("/docente")
    public ModelAndView getDocente() {
        ModelAndView mv = new ModelAndView("formularioDocente");
        mv.addObject("docente", new Docente());
        return mv;
    }

    @PostMapping("/guardarNuevoDocente")
    public String guardarDocente(Docente docente) {
        docenteService.guardarDocente(docente);
        return "redirect:/listaDocentes"; 
    }

    @GetMapping("/listaDocentes")
    public ModelAndView listarDocentes() {
        ModelAndView mv = new ModelAndView("listaDocentes");
        mv.addObject("listadoDocentes", docenteService.listarTodosDocentes());
        return mv;
    }

    @GetMapping("/eliminarDocente/{dni}")
    public String eliminarDocente(@PathVariable String dni) {
        docenteService.eliminarDocente(dni);
        return "redirect:/listaDocentes";
    }
}
