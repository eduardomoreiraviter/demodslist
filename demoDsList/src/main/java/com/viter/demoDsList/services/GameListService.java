package com.viter.demoDsList.services;


import com.viter.demoDsList.dto.GameListDTO;
import com.viter.demoDsList.entities.GameList;
import com.viter.demoDsList.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository listRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList > result = listRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
