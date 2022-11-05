package main.java.Pokemons;

import main.java.Moves.Damage.Special.EarthPower;
import main.java.Moves.Damage.Special.EnergyBall;
import main.java.Moves.Status.SandAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sandygast extends Pokemon {
    static final Type[] TYPE = {Type.GHOST, Type.GROUND};
    static final double HP = 55d, ATTACK = 55d, DEFENSE = 80d, SPECIAL_ATTACK = 70d, SPECIAL_DEFENSE = 45d,
            SPEED = 15d;
    public Sandygast(String name, int level) {
        super(name, level);
        this.setType(TYPE);
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
        this.setMove(new SandAttack(), new EnergyBall(), new EarthPower());
    }
}
