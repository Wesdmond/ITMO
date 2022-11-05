package main.java.Moves.Status;

import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove {
    static final String TEXT_OF_ATTACK = "use Sand Attack";
    static final Type TYPE = Type.GROUND;
    static final double POWER = 0d, ACCURACY = 1d;
    public SandAttack() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    public void applyOppEffects(Pokemon oppPokemon) {
        oppPokemon.setMod(Stat.ACCURACY, -1);
    }

    @Override
    protected String describe() {
        return TEXT_OF_ATTACK;
    }
}
