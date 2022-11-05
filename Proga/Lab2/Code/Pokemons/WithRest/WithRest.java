package Pokemons.WithRest;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class WithRest extends Pokemon {
    private boolean lastMoveWasRest = false;

    public WithRest(String name, int level) {
        super(name, level);
    }

    public final void checkRest() {
        if (lastMoveWasRest == true) {
            restoreHP();
            lastMoveWasRest = false;
        }
    }

    public final void initRest(Effect howManhyRounds) {
        lastMoveWasRest = true;
        setCondition(howManhyRounds);
    }

    public final void restoreHP() {
        this.setMod(Stat.HP, -(int)Math.round(getStat(Stat.HP) - getHP()));
    }
}
