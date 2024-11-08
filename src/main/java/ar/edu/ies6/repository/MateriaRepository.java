package ar.edu.ies6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.ies6.model.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia,String> {
	//jpaRepository
	List<Materia> findByEstado (boolean estado);

}
