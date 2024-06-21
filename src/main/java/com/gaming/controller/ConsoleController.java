package com.gaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaming.domain.model.Console;
import com.gaming.service.ConsoleService;

@RestController
@RequestMapping("/console")
public class ConsoleController {
    @Autowired
    private ConsoleService consoleService;

    @GetMapping
    public ResponseEntity<Iterable<Console>> findAll() {
        return ResponseEntity.ok(consoleService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Console> findById(@PathVariable Long id) {
        return ResponseEntity.ok(consoleService.obterPorId(id));
    }

    @PostMapping
    public ResponseEntity<Console> inserir(@RequestBody Console console) {
        consoleService.inserir(console);
        return ResponseEntity.ok(console);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Console> atualizar(@PathVariable Long id, @RequestBody Console console) {
        consoleService.atualizar(id, console);
        return ResponseEntity.ok(console);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Console> deletar(@PathVariable Long id) {
        consoleService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
