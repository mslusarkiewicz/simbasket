package com.simbasket.game;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/new")
    public String createNewGame(@RequestParam String leagueName) {
        return gameService.createNewGame(leagueName);
    }

    @GetMapping("/load")
    public String loadGame(@RequestParam String gameName) {
        return gameService.loadGame(gameName);
    }

    @PostMapping("/save")
    public String saveGame(@RequestParam String gameName, @RequestParam String state) {
        return gameService.saveGame(gameName, state);
    }

    @PostMapping("/quit")
    public String quitGame() {
        return gameService.quitGame();
    }
}

