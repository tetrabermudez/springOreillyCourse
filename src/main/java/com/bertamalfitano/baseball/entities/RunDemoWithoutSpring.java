package com.bertamalfitano.baseball.entities;

public class RunDemoWithoutSpring {
    public static void main(String[] args) {
        Team redSox = new RedSox();
        Team cubs = new Cubs();
        Game game1 = new BaseballGame(redSox, cubs);
        System.out.println(game1.playGame());
    }
}
