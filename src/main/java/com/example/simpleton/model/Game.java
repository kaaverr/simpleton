package com.example.simpleton.model;

import java.util.List;

public class Game {
    List<Battle> battles;

    public List<Battle> getBattles() {
        return battles;
    }

    public Game() {
    }

    public Game(List<Battle> battles) {
        this.battles = battles;
    }

    @Override
    public String toString() {
        return "Game{" +
                "battles=" + battles +
                '}';
    }
}
