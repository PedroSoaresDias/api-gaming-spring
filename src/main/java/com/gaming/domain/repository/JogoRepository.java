package com.gaming.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaming.domain.model.Jogo;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long> {

}
