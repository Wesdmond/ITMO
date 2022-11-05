package main.java.Moves.Damage.Special;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    static final String TEXT_OF_ATTACK = "use Sludge Bomb";
    static final Type TYPE = Type.POISON;
    static final double POWER = 90d, ACCURACY = 1d, CHANCE = 0.3d;
    public SludgeBomb() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    public void applyOppEffects(Pokemon oppPokemon) {
        if (new Effect().chance(CHANCE).success())
            Effect.poison(oppPokemon);
    }

    @Override
    protected String describe() {
        return TEXT_OF_ATTACK;
    }
}
