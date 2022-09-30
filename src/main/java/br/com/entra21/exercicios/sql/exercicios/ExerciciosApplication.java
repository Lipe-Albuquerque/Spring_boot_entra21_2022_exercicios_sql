package br.com.entra21.exercicios.sql.exercicios;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.entra21.exercicios.sql.exercicios.model.Exemplo;
import br.com.entra21.exercicios.sql.exercicios.repository.ExemploRepository;

@SpringBootApplication
public class ExerciciosApplication implements CommandLineRunner{

	@Autowired
	private ExemploRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(ExerciciosApplication.class, args);
	}

	public void run(String... args) throws Exception {
			Exemplo ex1 =  new Exemplo(null,"Filipe", "Albuquerque", 20, true);
			Exemplo ex2 =  new Exemplo(null,"Oliota", "Rumbem", 20, true);
			Exemplo ex3 =  new Exemplo(null,"Carlos", "Ritcher", 20, true);
			Exemplo ex4 =  new Exemplo(null,"Ariana", "Silva", 20, true);
			Exemplo ex5 =  new Exemplo(null,"Emerson", "Seiler", 20, true);
			Exemplo ex6 =  new Exemplo(null,"Filipe", "Albuquerque", 20, true);
			
			repository.saveAll(Arrays.asList(ex1,ex2,ex3,ex4,ex5,ex6));
	}

	
	
}
