package main.java.Moves.Status;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    static final String TEXT_OF_ATTACK = "use Thunder Wave";
    static final Type TYPE = Type.ELECTRIC;
    static final double POWER = 0d, ACCURACY = 0.9d;
    public ThunderWave() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected void applyOppEffects(Pokemon oppPokemon) {
        Effect.paralyze(oppPokemon);
    }

    @Override
    protected String describe() {
        return TEXT_OF_ATTACK;
    }
}
