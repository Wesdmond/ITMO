package main.java.Moves.Damage.Special;

import ru.ifmo.se.pokemon.*;

public class EarthPower extends SpecialMove {
    static final String TEXT_OF_ATTACK = "use Earth Power";
    static final Type TYPE = Type.GROUND;
    static final double POWER = 90d, ACCURACY = 1d, CHANCE = 0.1d;
    public EarthPower() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    public void applyOppEffects(Pokemon oppPokemon) {
        if (new Effect().chance(CHANCE).success())
            oppPokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return TEXT_OF_ATTACK;
    }
}
