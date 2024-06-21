package com.gaming.service;

import com.gaming.domain.model.Jogo;

public interface JogoService {
    Iterable<Jogo> buscarTodos();

    Jogo obterPorId(Long id);

    void inserir(Jogo jogo);

    void atualizar(Long id, Jogo jogo);

    void deletar(Long id);
}
