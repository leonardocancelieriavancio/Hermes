package br.com.hermes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.hermes.entity.Instituicao;

@Repository
public interface InstituicaoRepository extends CrudRepository<Instituicao, Long>{

}
