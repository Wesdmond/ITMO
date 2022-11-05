package main.java.Pokemons.WithRest;

import main.java.Moves.Damage.Special.GigaDrain;

public class Gloom extends Oddish {

    static final double HP = 60d, ATTACK = 65d, DEFENSE = 70d, SPECIAL_ATTACK = 85d, SPECIAL_DEFENSE = 75d,
            SPEED = 40d;

    public Gloom(String name, int level) {
        super(name, level);
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
        this.addMove(new GigaDrain());
    }


}
