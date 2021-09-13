package com.br.tudo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.tudo.domain.Todo;
import com.br.tudo.repositories.TudoRepository;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

	@Autowired
	private TudoRepository tudoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}
	
	@Override
	public void run(String ... args)throws Exception{
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Todo t1 = new Todo(null, "Estudar", "Estudar Spring boot 2 e angular 11", LocalDateTime.parse("25/03/2022 10:40", formatter), false);
		
		tudoRepository.saveAll(Arrays.asList(t1));
	}

}
