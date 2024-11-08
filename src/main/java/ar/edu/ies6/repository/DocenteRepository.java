package ar.edu.ies6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.ies6.model.Docente;

@Repository

public interface DocenteRepository extends JpaRepository <Docente, String>{

	
	List<Docente> findByEstado(Boolean estado);
	
	
}

