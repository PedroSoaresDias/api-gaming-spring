package com.gaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaming.domain.model.Jogo;
import com.gaming.service.JogoService;

@RestController
@RequestMapping("/games")
public class JogoController {
    @Autowired
    private JogoService jogoService;

    @GetMapping
    public ResponseEntity<Iterable<Jogo>> findAll() {
        return ResponseEntity.ok(jogoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jogo> findById(@PathVariable Long id) {
        return ResponseEntity.ok(jogoService.obterPorId(id));
    }

    @PostMapping
    public ResponseEntity<Jogo> inserir(@RequestBody Jogo jogo) {
        jogoService.inserir(jogo);
        return ResponseEntity.ok(jogo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Jogo> atualizar(@PathVariable Long id, @RequestBody Jogo jogo) {
        jogoService.atualizar(id, jogo);
        return ResponseEntity.ok(jogo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Jogo> deletar(@PathVariable Long id) {
        jogoService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
