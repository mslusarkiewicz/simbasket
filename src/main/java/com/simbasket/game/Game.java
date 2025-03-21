package com.simbasket.game;

import java.util.Date;

public class Game {
	private Date date;
	private String location;

	public Game(Date date, String location) {
		this.date = date;
		this.location = location;
	}

	public String getGameDetails() {
		return "Date: " + date + ", Location: " + location;
	}
}
