package com.gaming.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaming.domain.model.Jogo;
import com.gaming.domain.repository.JogoRepository;
import com.gaming.service.JogoService;

@Service
public class JogoServiceImpl implements JogoService {
    @Autowired
    private JogoRepository jogoRepository;

    @Override
    public Iterable<Jogo> buscarTodos() {
        return jogoRepository.findAll();
    }

    @Override
    public Jogo obterPorId(Long id) {
        Optional<Jogo> jogo = jogoRepository.findById(id);
        return jogo.orElse(null);
    }

    @Override
    public void inserir(Jogo jogo) {
        jogoRepository.save(jogo);
    }

    @Override
    public void atualizar(Long id, Jogo jogo) {
        Optional<Jogo> jogoDB = jogoRepository.findById(id);

        if (jogoDB.isPresent()) {
            Jogo jogoExistente = jogoDB.get();
            jogoExistente.setNome(jogo.getNome());
            jogoExistente.setEditor(jogo.getEditor());

            jogoExistente.setDesenvolvedores(jogo.getDesenvolvedores());
            jogoExistente.setGenero(jogo.getGenero());
            jogoExistente.setPlataformas(jogo.getPlataformas());

            jogoRepository.save(jogoExistente);
        }
    }

    @Override
    public void deletar(Long id) {
        jogoRepository.deleteById(id);
    }

}
