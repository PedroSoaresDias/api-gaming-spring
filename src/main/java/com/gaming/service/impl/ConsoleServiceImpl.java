package com.gaming.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaming.domain.model.Console;
import com.gaming.domain.repository.ConsoleRepository;
import com.gaming.service.ConsoleService;

@Service
public class ConsoleServiceImpl implements ConsoleService {

    @Autowired
    private ConsoleRepository consoleRepository;
    
    @Override
    public Iterable<Console> buscarTodos() {
        return consoleRepository.findAll();
    }
    
    @Override
    public Console obterPorId(Long id) {
        Optional<Console> console = consoleRepository.findById(id);
        return console.orElse(null);
    }
    
    @Override
    public void inserir(Console console) {
        consoleRepository.save(console);
    }
    
    @Override
    public void atualizar(Long id, Console console) {
        Optional<Console> consoleDb = consoleRepository.findById(id);

        if (consoleDb.isPresent()) {
            Console consoleExistente = consoleDb.get();
            consoleExistente.setNome(console.getNome());
            consoleExistente.setAnoLancamento(console.getAnoLancamento());
            consoleExistente.setModelos(console.getModelos());

            consoleRepository.save(consoleExistente);
        }
    }

    @Override
    public void deletar(Long id) {
        consoleRepository.deleteById(id);
    }
}
