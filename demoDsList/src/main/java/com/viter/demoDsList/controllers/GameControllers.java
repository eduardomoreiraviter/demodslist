package com.viter.demoDsList.controllers;

import com.viter.demoDsList.dto.GameMinDTO;
import com.viter.demoDsList.entities.Game;
import com.viter.demoDsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameControllers  {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDTO> findAll(){
       List<GameMinDTO> result = service.findAll();
       return result;
    }
}
