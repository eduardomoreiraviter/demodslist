package com.viter.demoDsList.controllers;

import com.viter.demoDsList.dto.GameListDTO;
import com.viter.demoDsList.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListControllers {

    @Autowired
    private GameListService listService;

    @GetMapping
    public List<GameListDTO> findAll(){
       List<GameListDTO> result = listService.findAll();
       return result;
    }
}
