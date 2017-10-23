package br.com.hermes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hermes.entity.Instituicao;
import br.com.hermes.repository.InstituicaoRepository;

@Service
public class InstituicaoService {
	
	@Autowired
	InstituicaoRepository repository;
	
	public Instituicao salvar(Instituicao instituicao){
		return repository.save(instituicao);
	}

}
