package ar.edu.ies6.service.imp;

import java.util.List;
import java.util.Optional;

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
		materia.setEstado(true);
		materiaRepository.save(materia);
		
		
	}

	@Override
	public void eliminarMateria(String codigo) {
		// TODO Auto-generated method stub
		
		 Optional<Materia> materiaEncontrado= materiaRepository.findById(codigo);
		 materiaEncontrado.get().setEstado(false);
		 materiaRepository.save(materiaEncontrado.get());
		 
	}

	@Override
	public void modificarMateria(Materia materiaModificado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Materia consultarMateria(String codigo) {
		// TODO Auto-generated method stub
		
		return materiaRepository.findById(codigo).get();
	}

	@Override
	public List<Materia> listarTodosMateria() {
		// TODO Auto-generated method stub
		return (List<Materia>) materiaRepository.findAll();
	}

	@Override
	public List<Materia> listarTodoMateriasActivos() {
		// TODO Auto-generated method stub
		return (List<Materia>) materiaRepository.findByEstado(true);
	}
	
		


}


