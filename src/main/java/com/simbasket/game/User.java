package com.simbasket.game;

import java.util.List;

public class User {
	public void viewSchedule(Schedule schedule) {
		schedule.getSchedule();
	}

	public void viewTeams(List<Team> teams) {
		for (Team team : teams) {
			System.out.println(team.getTeamDetails());
		}
	}

	public void viewTrades(List<Trade> trades) {
		for (Trade trade : trades) {
			trade.executeTrade();
		}
	}

	public void viewStandings(Standings standings) {
		standings.getRankings();
	}
}
