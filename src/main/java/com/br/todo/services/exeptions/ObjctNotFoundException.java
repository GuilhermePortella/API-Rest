/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.todo.services.exeptions;

/**
 *
 * @author Guilherme
 */
public class ObjctNotFoundException extends RuntimeException{
    
    private static final long serialVersionUID = 1L;
    
    public ObjctNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
    
    public ObjctNotFoundException(String message){
        super(message);
    }
    
    
}
