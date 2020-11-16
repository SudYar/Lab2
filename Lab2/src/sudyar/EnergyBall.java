package sudyar;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove{
    public EnergyBall(){
        super(Type.GRASS, 90, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        final double rand = Math.random();
        if (rand < 0.1) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "особая защита противника уменьшена";
    }
}
