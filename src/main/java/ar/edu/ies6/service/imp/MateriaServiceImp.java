package ar.edu.ies6.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.ies6.model.Materia;
import ar.edu.ies6.service.IMateriaService;
import ar.edu.ies6.util.AlmacenMaterias;

@Service
public class MateriaServiceImp implements IMateriaService {

	@Override
	public void guardarMateria(Materia materia) {
		// TODO Auto-generated method stub
		AlmacenMaterias.materia.add(materia);
		System.out.println(AlmacenMaterias.materia.get(0).getCodigo());
	
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
		return AlmacenMaterias.materia;
	}
}
	