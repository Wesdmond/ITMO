package main.java.Pokemons;

import main.java.Moves.Damage.Special.ChargeBeam;
import main.java.Moves.Damage.Special.Extrasensory;
import main.java.Moves.Damage.Special.Thunderbolt;
import main.java.Moves.Status.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Raikou extends Pokemon {
    static final Type TYPE = Type.ELECTRIC;
    static final double HP = 90d, ATTACK = 85d, DEFENSE = 75d, SPECIAL_ATTACK = 115d, SPECIAL_DEFENSE = 100d,
                        SPEED = 115d;
    public Raikou(String name, int level) {
        super(name, level);
        this.setType(TYPE);
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
        this.setMove(new Thunderbolt(), new ThunderWave(), new ChargeBeam(), new Extrasensory());
    }
}
