package com.in28minutes.learnSpringFramework;

public class GameRunner {

    GamingConsole game;

    public void run() {
        System.out.print("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
    public GameRunner(GamingConsole game){
        this.game = game;
    }
}
