package com.viter.demoDsList.repositories;

import com.viter.demoDsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
