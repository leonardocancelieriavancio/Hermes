package br.com.hermes.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hermes.entity.Curso;
import br.com.hermes.repository.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	CursoRepository repository;
	
	public Curso salvar(Curso curso){
		return repository.save(curso);
	}
	
	public void excluir(Curso curso){
		repository.delete(curso);
	}
	
	public Curso buscarPorId(Long id){
		return repository.findOne(id);
	}
	
	public List<Curso> buscarTodos(){
		return toList(repository.findAll());
	}
	
	private <T> List<T> toList(Iterable<T> iterable) {
	    return StreamSupport.stream(iterable.spliterator(), false)
	                        .collect(Collectors.toList());
	}
	
}
