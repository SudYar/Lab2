package sudyar;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {
    public LowSweep(){
        super(Type.FIGHTING, 65, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        pokemon.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "противник стал медленее";
    }
}
