package main.java;

import main.java.Pokemons.Palossand;
import main.java.Pokemons.Raikou;
import main.java.Pokemons.Sandygast;
import main.java.Pokemons.WithRest.Gloom;
import main.java.Pokemons.WithRest.Oddish;
import main.java.Pokemons.WithRest.Vileplume;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] arts) {
        Battle battle = new Battle();
        Pokemon a1 = new Oddish("Odi", 1);
        Pokemon a2 = new Gloom("Gloo", 1);
        Pokemon a3 = new Vileplume("Vile", 1);
        Pokemon f1 = new Sandygast("Sandik", 1);
        Pokemon f2 = new Palossand("Pal", 1);
        Pokemon f3 = new Raikou("Rai", 1);

        battle.addAlly(a1);
        battle.addAlly(a2);
        battle.addAlly(a3);
        battle.addFoe(f1);
        battle.addFoe(f2);
        battle.addFoe(f3);
        battle.go();
    }
}
