package com.gaming.service;

import com.gaming.domain.model.Console;

public interface ConsoleService {
    Iterable<Console> buscarTodos();

    Console obterPorId(Long id);

    void inserir(Console console);

    void atualizar(Long id, Console console);

    void deletar(Long id);
}
