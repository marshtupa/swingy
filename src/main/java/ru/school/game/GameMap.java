package ru.school.game;

import ru.school.heroes.Hero;
import ru.school.utils.Coordinates;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GameMap {
    private final int size;
    Map<Coordinates, Hero> grid = new HashMap<>();
    ArrayList<Hero> heroes;
    Coordinates coordinates;

    public GameMap(Hero hero) {
        size = (hero.getLevel() - 1) * 5 + 10 - 1;
        heroes = new ArrayList<>(size * size);
        heroes.toString();
        coordinates = new Coordinates();
        registerHero(hero);
    }

    private void registerHero(Hero hero) {
        if (size % 2 == 1) {
            coordinates.setX((size + 1) / 2);
            coordinates.setY((size + 1) / 2);
        }
        else {
            coordinates.setX(size / 2);
            coordinates.setY(size / 2);
        }
        heroes.add(size * coordinates.getY() - size - coordinates.getX(), hero);
        grid.put(coordinates, hero);
    }

    public void printMap() {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (heroes.get(size * y - size - x) == null)
                    System.out.print(". ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }

    }

    private void calculateSize() {

    }

    public void isVillains() {

    }

    public int getSize() {
        return size;
    }
}
