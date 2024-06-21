package com.gaming.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaming.domain.model.Console;

@Repository
public interface ConsoleRepository extends JpaRepository<Console, Long> {

}
