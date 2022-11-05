package main.java.Moves.Damage.Special;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    static final String TEXT_OF_ATTACK = "use Charge Beam";
    static final Type TYPE = Type.ELECTRIC;
    static final Stat STAT = Stat.SPECIAL_ATTACK;
    static final double POWER = 50d, ACCURACY = 0.9d, CHANCE = 0.7d;
    public ChargeBeam() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected void applySelfEffects(Pokemon oppPokemon) {
        if (new Effect().chance(CHANCE).success())
            oppPokemon.setMod(STAT, 1);
    }

    @Override
    protected String describe() {
        return TEXT_OF_ATTACK;
    }
}
