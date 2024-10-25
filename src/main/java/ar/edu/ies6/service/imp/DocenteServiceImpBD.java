package ar.edu.ies6.service.imp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.ies6.model.Docente;
import ar.edu.ies6.repository.DocenteRepository;
import ar.edu.ies6.service.IDocenteService;

@Service
@Qualifier("servicioDocenteBD")
public class DocenteServiceImpBD implements IDocenteService {

    @Autowired
    DocenteRepository docenteRepository;

    @Override
    public void guardarDocente(Docente docente) {
        docenteRepository.save(docente);
    }

    @Override
    public void eliminarDocente(String dni) {
        docenteRepository.deleteById(dni);
    }

    @Override
    public void modificarDocente(Docente docenteModificado) {
        docenteRepository.save(docenteModificado);
    }

    @Override
    public Docente consultarDocente(String dni) {
        return docenteRepository.findById(dni).orElse(null);
    }

    @Override
    public List<Docente> listarTodosDocentes() {
        return (List<Docente>) docenteRepository.findAll();
    }
}

