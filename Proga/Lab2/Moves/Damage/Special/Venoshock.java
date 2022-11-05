package main.java.Moves.Damage.Special;

import Pokemons.WithRest.WithRest;
import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
    static final String TEXT_OF_ATTACK = "use Venoshock";
    static final Type TYPE = Type.POISON;
    static final double POWER = 65d, ACCURACY = 1d;
    public Venoshock() {
        super(TYPE, POWER, ACCURACY);
    }


    @Override
    protected void applyOppDamage(Pokemon var1, double var2) {
        int multiplier = 1;
        if (var1.getCondition() == Status.POISON)
            multiplier = 2;
        var1.setMod(Stat.HP, multiplier * (int)Math.round(var2));
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
