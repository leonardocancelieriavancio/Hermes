package br.com.hermes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.hermes.entity.Curso;
import br.com.hermes.entity.Instituicao;
import br.com.hermes.service.CursoService;
import br.com.hermes.service.InstituicaoService;

@Component
public class TesteCrud implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	InstituicaoService instituicaoService;
	
	@Autowired
	CursoService cursoService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		executarTeste();
	}
	
	private void executarTeste(){
		//Cria instituição
		Instituicao instituicao = new Instituicao("IFPR", "Rua José Felipe Tequinha, 1400", "Jardim das Nações", "Paranvaí", "PR", "(44) 3482-0110", "exemplo@ifpr.edu.br", "paranavai.ifpr.edu.br");
		instituicaoService.salvar(instituicao);

		//Cria curso1
		Curso curso1 = new Curso("TADS", 3, instituicao);
		cursoService.salvar(curso1);
		
		//Cria curso2
		Curso curso2 = new Curso("Licenciatura em Química", 4, instituicao);
		cursoService.salvar(curso2);
		
		//Altera curso1
		curso1.setNome("Tecnologia em Análise e Desenvolvimento de Sistemas");
		cursoService.salvar(curso1);
		
		//Busca todos os cursos e exibe o nome
		for(Curso c : cursoService.buscarTodos()){
			System.out.println(c.getNome());
		}
		
		//Exclui curso2
		cursoService.excluir(curso2);
		
	}

	
}
