package com.simbasket.game;

import java.io.Serializable;

class Player implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;

    public Player() {}
    public Player(String name) { this.name = name; }
    public Long getId() { return id; }
    public String getName() { return name; }
}
