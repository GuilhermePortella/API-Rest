package com.br.tudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.tudo.domain.Todo;

@Repository
public interface TudoRepository extends JpaRepository<Todo, Integer> {

}
