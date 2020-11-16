package sudyar;

import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove {
    public Bubble(){
        super(Type.WATER, 40, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        final double rand = Math.random();
        if (rand < 0.1) {
            pokemon.setMod(Stat.SPEED, -1);
        }
    }

    @Override
    protected String describe() {
        return "скорость противника уменьшена";
    }
}
