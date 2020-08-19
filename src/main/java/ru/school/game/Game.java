package ru.school.game;
import java.util.Scanner;

public class Game {
    private GameMap map;
    private Player player;

    public void init() {
        Scanner in = new Scanner(System.in);
        System.out.println("Type Player name!");
        player = new Player(in.nextLine());
        player.createHero();
        map = new GameMap(player.hero);
        map.printMap();
    }

    public void start() {

    }

    public void finish() {

    }
}
