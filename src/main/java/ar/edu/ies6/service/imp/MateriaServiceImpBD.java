package ar.edu.ies6.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.ies6.model.Materia;
import ar.edu.ies6.repository.MateriaRepository;
import ar.edu.ies6.service.IMateriaService;
@Service
@Qualifier ("servicioMateriaBD")
public class MateriaServiceImpBD implements IMateriaService {
	@Autowired
   MateriaRepository materiaRepository;
	
	public void guardarMateria(Materia materia) {
		// TODO Auto-generated method stub
		//guardar en la BD
		materiaRepository.save(materia);
		
		
	}

	@Override
	public void eliminarMateria(String codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarMateria(Materia materiaModificado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Materia consultarMateria(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Materia> listarTodosMateria() {
		// TODO Auto-generated method stub
		return (List<Materia>) materiaRepository.findAll();
	}
	
		


}


