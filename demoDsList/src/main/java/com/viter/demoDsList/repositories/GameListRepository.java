package com.viter.demoDsList.repositories;

import com.viter.demoDsList.entities.Game;
import com.viter.demoDsList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
