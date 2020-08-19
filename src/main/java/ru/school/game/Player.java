package ru.school.game;

import ru.school.heroes.Elf;
import ru.school.heroes.Hero;

import java.util.Scanner;

public class Player {
    Hero hero;
    String name;

    public Player(String name) {
        this.name = name;
    }

    public void createHero() {
        // here we should use factory for hero creation
        hero = new Elf();
        Scanner in = new Scanner(System.in);
        System.out.println("Let's create a hero!\nName: ");
        hero.setName(in.nextLine());
        System.out.println("🐙 Hero created!");
    }

    public void selectPreviousHero() {

    }
}
