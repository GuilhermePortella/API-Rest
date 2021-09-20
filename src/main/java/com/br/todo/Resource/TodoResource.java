/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.todo.Resource;

import com.br.todo.domain.Todo;
import com.br.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Guilherme
 */

@RestController
@RequestMapping(value = "/todos")
public class TodoResource {
    
    @Autowired
    private TodoService service;
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Todo> findById(@PathVariable Integer id){
        Todo obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    
}
