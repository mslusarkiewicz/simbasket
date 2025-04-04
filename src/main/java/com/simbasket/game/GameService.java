package com.simbasket.game;

import org.springframework.stereotype.Service;

import java.io.*;

@Service
class GameService {
    private static final String SAVE_DIR = "saves/";

    public GameService() {
        File directory = new File(SAVE_DIR);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public String createNewGame(String leagueName) {
        Game game = new Game(leagueName, "Initial State");
        saveGameToFile(game);
        return "New game created for league: " + leagueName;
    }

    public String loadGame(String gameName) {
        Game game = loadGameFromFile(gameName);
        return (game != null) ? "Game " + gameName + " loaded. State: " + game.getState() : "Game not found.";
    }

    public String saveGame(String gameName, String state) {
        Game game = loadGameFromFile(gameName);
        if (game != null) {
            game.setState(state);
            saveGameToFile(game);
            return "Game " + gameName + " saved.";
        } else {
            return "Game not found.";
        }
    }

    public String quitGame() {
        return "Game exited.";
    }

    private void saveGameToFile(Game game) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_DIR + game.getName() + ".dat"))) {
            oos.writeObject(game);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Game loadGameFromFile(String gameName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SAVE_DIR + gameName + ".dat"))) {
            return (Game) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }
}