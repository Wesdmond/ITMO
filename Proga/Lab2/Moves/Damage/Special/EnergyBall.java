package main.java.Moves.Damage.Special;

import Pokemons.WithRest.WithRest;
import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    static final String TEXT_OF_ATTACK = "use Energy Ball";
    static final Type TYPE = Type.GRASS;
    static final double POWER = 90d, ACCURACY = 1d, CHANCE = 0.1d;
    public EnergyBall() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    public void applyOppEffects(Pokemon oppPokemon) {
        if (new Effect().chance(CHANCE).success())
            oppPokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
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
