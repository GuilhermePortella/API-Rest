/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.tudo.services;

import com.br.tudo.domain.Todo;
import com.br.tudo.repositories.TudoRepository;
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
    private TudoRepository tudoRepository;

    public void instanciaBaseDeDados() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Todo t1 = new Todo(null, "Estudar", "Estudar Spring boot 2 e angular 11", LocalDateTime.parse("25/03/2022 10:40", formatter), false);
        Todo t2 = new Todo(null, "Pequeno teste", "linha feita e criada sem comandos diretos", LocalDateTime.parse("19/09/2021 21:54", formatter), true);

        tudoRepository.saveAll(Arrays.asList(t1, t2));
    }

}
