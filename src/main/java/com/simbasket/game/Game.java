package com.simbasket.game;

import java.io.Serializable;
import java.util.Date;

class Game implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String state;

	public Game() {}
	public Game(String name, String state) {
		this.name = name;
		this.state = state;
	}
	public String getName() { return name; }
	public String getState() { return state; }
	public void setState(String state) { this.state = state; }
}
