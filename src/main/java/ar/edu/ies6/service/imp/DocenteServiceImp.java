package ar.edu.ies6.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ar.edu.ies6.model.Docente;
import ar.edu.ies6.service.IDocenteService;
import ar.edu.ies6.util.AlmacenDocentes;

@Service
@Qualifier ("servicioDocenteArrayList")
public class DocenteServiceImp implements IDocenteService {
    
    @Override
    public void guardarDocente(Docente docente) {
        AlmacenDocentes.docentes.add(docente);
    }

    @Override
    public void eliminarDocente(String dni) {
       
    }

    @Override
    public void modificarDocente(Docente docenteModificado) {
        
    }

    @Override
    public Docente consultarDocente(String dni) {
       
        return null;
    }

    @Override
    public List<Docente> listarTodosDocentes() {
        return AlmacenDocentes.docentes;
    }

	@Override
	public List<Docente> listarTodosDocenteActivos() {
		// TODO Auto-generated method stub
		return null;
	}
}

