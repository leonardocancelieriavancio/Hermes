package br.com.hermes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


// Classe utilizada para inicializar a aplicação Spring Boot
@SpringBootApplication// O Spring mapeia as classes que estão em pacotes abaixo do pacote da classe com essa anotação
@EnableAutoConfiguration
public class HermesApplication {

	// Método principal que é executado ao executar o jar da aplicação
	public static void main(String[] args) {
		//Inicia a aplicação Spring Boot
		SpringApplication.run(HermesApplication.class, args);
	}
	
}
