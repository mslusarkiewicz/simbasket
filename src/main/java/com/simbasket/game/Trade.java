package com.simbasket.game;

public class Trade {
    private Team fromTeam;
    private Team toTeam;
    private Player player;

    public Trade(Team fromTeam, Team toTeam, Player player) {
        this.fromTeam = fromTeam;
        this.toTeam = toTeam;
        this.player = player;
    }

    public void executeTrade() {
        fromTeam.addPlayer(player);
        System.out.println("Player " + player.getPlayerDetails() + " traded from " + fromTeam.getTeamDetails() + " to " + toTeam.getTeamDetails());
    }
}