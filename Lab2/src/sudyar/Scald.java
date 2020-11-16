package sudyar;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove{
    public Scald() {
        super(Type.WATER, 80, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        final double rand = Math.random();
        if (rand < 0.3) {
            Effect.burn(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "противник горит";
    }
}
