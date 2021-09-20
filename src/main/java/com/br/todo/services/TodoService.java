/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.todo.services;

import com.br.todo.domain.Todo;
import com.br.todo.repositories.TodoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Guilherme
 */

@Service
public class TodoService {
    
    @Autowired
    private TodoRepository repository;
    
    public Todo findById(Integer id){
        Optional<Todo> obj = repository.findById(id);
        return obj.orElse(null);
    }
    
}
