package sudyar;

import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove{
    public Waterfall(){
        super(Type.WATER, 80, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        final double rand = Math.random();
        if (rand < 0.2) {
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "противник в страхе";
    }
}
