package com.example.HouseRules.service;

import java.util.List;

public interface GameService {
    Game add(Game game);
    void add(List<Game> allGames);
    Game getById(int id);
    List<Game> getAll();
    void update(Game game);
    String delete(int id);
}
