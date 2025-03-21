package com.simbasket.game;

public class Player {
    private String name;
    private String position;

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getPlayerDetails() {
        return "Name: " + name + ", Position: " + position;
    }
}