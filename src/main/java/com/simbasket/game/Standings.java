package com.simbasket.game;

public class Standings {
    private List<Team> teams;

    public Standings(List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getRankings() {
        return teams;
    }
}