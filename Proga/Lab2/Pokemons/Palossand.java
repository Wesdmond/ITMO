package main.java.Pokemons;


import main.java.Moves.Damage.Special.SludgeBomb;

public class Palossand extends Sandygast {
    static final double HP = 85d, ATTACK = 75d, DEFENSE = 110d, SPECIAL_ATTACK = 100d, SPECIAL_DEFENSE = 75d,
                        SPEED = 35d;
    public Palossand(String name, int level) {
        super(name, level);
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
        this.addMove(new SludgeBomb());
    }
}
