package com.simbasket.game;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
	private List<Game> games = new ArrayList<>();

	public List<Game> getSchedule() {
		return games;
	}

	public void addGame(Game game) {
		games.add(game);
	}
}
