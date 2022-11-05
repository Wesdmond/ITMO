package main.java.Pokemons.WithRest;

import main.java.Moves.Damage.Special.Venoshock;
import main.java.Moves.Status.Rest;
import ru.ifmo.se.pokemon.Type;

public class Oddish extends Pokemons.WithRest.WithRest {
    static final Type[] TYPE = {Type.GRASS, Type.POISON};
    static final double HP = 45d, ATTACK = 50d, DEFENSE = 55d, SPECIAL_ATTACK = 75d, SPECIAL_DEFENSE = 65d,
            SPEED = 30d;
    public Oddish(String name, int level) {
        super(name, level);
        this.setType(TYPE);
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
        this.setMove(new Rest(), new Venoshock());
    }
}
