package com.simbasket.game;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getTeamDetails() {
        return "Team: " + name + ", Players: " + players.size();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}