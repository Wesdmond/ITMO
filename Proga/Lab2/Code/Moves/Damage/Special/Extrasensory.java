package main.java.Moves.Damage.Special;

import ru.ifmo.se.pokemon.*;

public class Extrasensory extends SpecialMove {
    static final String TEXT_OF_ATTACK = "use Extrasensory";
    static final Type TYPE = Type.PSYCHIC;
    static final double POWER = 80d, ACCURACY = 1d, CHANCE = 0.1d;
    public Extrasensory() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    public void applyOppEffects(Pokemon oppPokemon) {
        if (new Effect().chance(CHANCE).success())
            Effect.flinch(oppPokemon);
    }

    @Override
    protected String describe() {
        return TEXT_OF_ATTACK;
    }
}
