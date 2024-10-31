package ar.edu.ies6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.ies6.model.Materia;
@Service
public interface IMateriaService {
	//crud
		//metodos
		public void guardarMateria(Materia materia);
		public void eliminarMateria(String codigo);
		public void modificarMateria(Materia materiaModificado);
		public Materia consultarMateria(String codigo);
		public List<Materia> listarTodosMateria();
		public List<Materia> listarTodoMateriasActivos ();
		


}
