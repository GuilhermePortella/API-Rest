/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.todo.services;

import com.br.todo.domain.Todo;
import com.br.todo.repositories.TodoRepository;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Guilherme
 */
@Service
public class DBService {

    @Autowired
    private TodoRepository todoRepository;

    public void instanciaBaseDeDados() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Todo t1 = new Todo(null, "Estudar", "Estudar Spring boot 2 e angular 11", LocalDateTime.parse("25/03/2022 10:40", formatter), false);
        Todo t2 = new Todo(null, "Pequeno teste 1", "linha feita e criada sem comandos diretos", LocalDateTime.parse("19/09/2021 21:54", formatter), true);
        Todo t3 = new Todo(null, "Pequeno teste 2", "Sem dor sem ganho", LocalDateTime.parse("20/09/2021 18:20", formatter), false);
        Todo t4 = new Todo(null, "Pequeno teste 3", "Estudar mais", LocalDateTime.parse("20/09/2021 18:21", formatter), true);

        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
    }

}
