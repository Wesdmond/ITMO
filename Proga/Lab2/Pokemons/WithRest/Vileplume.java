package main.java.Pokemons.WithRest;

import main.java.Moves.Damage.Special.EnergyBall;

public class Vileplume extends Gloom {
    static final double HP = 75d, ATTACK = 80d, DEFENSE = 85d, SPECIAL_ATTACK = 110d, SPECIAL_DEFENSE = 90d,
            SPEED = 50d;

    public Vileplume(String name, int level) {
        super(name, level);
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
        this.addMove(new EnergyBall());
    }
}
