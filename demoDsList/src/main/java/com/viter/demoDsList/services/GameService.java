package com.viter.demoDsList.services;

import com.viter.demoDsList.dto.GameMinDTO;
import com.viter.demoDsList.entities.Game;
import com.viter.demoDsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll(){
        List<Game> result = repository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
