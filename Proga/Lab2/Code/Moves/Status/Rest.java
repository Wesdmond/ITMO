package main.java.Moves.Status;

import Pokemons.WithRest.WithRest;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    static final String TEXT_OF_ATTACK = "use Rest";
    static final Type TYPE = Type.PSYCHIC;
    static final double POWER = 0d, ACCURACY = 1d;
    public Rest() {
        super(TYPE, POWER, ACCURACY);
    }

    public void applySelfEffects(Pokemon selfPokemon) {
        Effect effect = new Effect().condition(Status.SLEEP).turns(2).attack(0);
        if (selfPokemon instanceof WithRest) {
            ((WithRest) selfPokemon).checkRest();
            ((WithRest) selfPokemon).initRest(effect);
        }
    }

    @Override
    protected String describe() {
        return TEXT_OF_ATTACK;
    }
}
