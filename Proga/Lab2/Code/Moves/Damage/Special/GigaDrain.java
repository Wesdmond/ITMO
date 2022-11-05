package main.java.Moves.Damage.Special;

import Pokemons.WithRest.WithRest;
import ru.ifmo.se.pokemon.*;

public class GigaDrain extends SpecialMove {
    static final String TEXT_OF_ATTACK = "use Giga Drain";
    static final Type TYPE = Type.GRASS;
    static final double POWER = 75d, ACCURACY = 1d;
    public GigaDrain() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected void applyOppDamage(Pokemon var1, double var2) {
        var1.setMod(Stat.HP, (int)Math.round(var2));
    }

    @Override
    protected void applySelfDamage(Pokemon var1, double var2) {
        var1.setMod(Stat.HP, -(int)Math.round(var2)/2);
    }

    @Override
    public void applySelfEffects(Pokemon selfPokemon) {
        if (selfPokemon instanceof WithRest)
            ((WithRest) selfPokemon).checkRest();
    }

    @Override
    protected String describe() {
        return TEXT_OF_ATTACK;
    }
}
