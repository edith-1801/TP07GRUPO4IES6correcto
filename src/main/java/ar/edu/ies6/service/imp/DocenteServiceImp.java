package ar.edu.ies6.service.imp;

import java.util.List;
import org.springframework.stereotype.Service;
import ar.edu.ies6.model.Docente;
import ar.edu.ies6.service.IDocenteService;
import ar.edu.ies6.util.AlmacenDocentes;

@Service
public class DocenteServiceImp implements IDocenteService {
    
    @Override
    public void guardarDocente(Docente docente) {
        AlmacenDocentes.docentes.add(docente);
    }

    @Override
    public void eliminarDocente(String dni) {
        // Implementar lógica de eliminación
    }

    @Override
    public void modificarDocente(Docente docenteModificado) {
        // Implementar lógica de modificación
    }

    @Override
    public Docente consultarDocente(String dni) {
        // Implementar lógica de consulta
        return null;
    }

    @Override
    public List<Docente> listarTodosDocentes() {
        return AlmacenDocentes.docentes;
    }
}

