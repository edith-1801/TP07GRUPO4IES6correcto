package ar.edu.ies6.service.imp;

import java.util.List;
import java.util.Optional;

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
        docente.setEstado (true);
        docenteRepository.save(docente);
    }

    @Override
    public void eliminarDocente(String dni) {
    Optional<Docente> docenteEncontrado =	docenteRepository.findById(dni);
    docenteEncontrado.get().setEstado(false);
    docenteRepository.save(docenteEncontrado.get());
      
    }

    @Override
    public void modificarDocente(Docente docenteModificado) {
    
    }

    @Override
    public Docente consultarDocente(String dni) {
        return docenteRepository.findById(dni).get();
    }

    @Override
    public List<Docente> listarTodosDocentes() {
        return (List<Docente>) docenteRepository.findAll();
    }

	@Override
	public List<Docente> listarTodosDocenteActivos() {
		// TODO Auto-generated method stub
		return (List<Docente>) docenteRepository.findByEstado(true);
	}
}

