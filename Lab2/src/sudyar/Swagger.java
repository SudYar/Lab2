package sudyar;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{
    public Swagger(){
        super(Type.NORMAL, 0, 0.85);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ATTACK, 2);
        Effect.confuse(pokemon);
    }
    @Override
    protected String describe(){
        return "атака противника увеличилась +2, противнику это скружило голову";
    }
}
