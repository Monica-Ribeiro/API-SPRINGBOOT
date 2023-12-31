package com.example.lojasgamesback.service;
import com.example.lojasgamesback.model.Jogo;
import com.example.lojasgamesback.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {
    @Autowired
    private JogoRepository jogoRepository;

    public List<Jogo> getAll(){
        return jogoRepository.findAll();
    }

    public Jogo save(Jogo jogo){
        return  jogoRepository.save(jogo);
    }
}
