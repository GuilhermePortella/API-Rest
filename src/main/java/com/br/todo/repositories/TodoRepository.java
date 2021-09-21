package com.br.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.todo.domain.Todo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    
    @Query("SELECT obj FROM Todo obj WHERE obj.finalizado = false ORDER BY obj.dataParaFianalizar")
    List<Todo> findAllOpen();
    
    @Query("SELECT obj FROM Todo obj WHERE obj.finalizado = true ORDER BY obj.dataParaFianalizar")
    List<Todo> findAllClose();

}
