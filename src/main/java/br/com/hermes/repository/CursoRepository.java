package br.com.hermes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.hermes.entity.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Long>{

}
