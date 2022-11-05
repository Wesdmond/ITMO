package main.java.Moves.Damage.Special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


public class Thunderbolt extends SpecialMove {
    static final String TEXT_OF_ATTACK = "use Thunderbolt";
    static final Type TYPE = Type.ELECTRIC;
    static final double POWER = 90d, ACCURACY = 1d, CHANCE = 0.1d;
    public Thunderbolt() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected void applyOppEffects(Pokemon oppPokemon) {
        if (new Effect().chance(CHANCE).success())
            Effect.paralyze(oppPokemon);
    }

    @Override
    protected String describe() {
        return TEXT_OF_ATTACK;
    }
}
