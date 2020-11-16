package sudyar;

import ru.ifmo.se.pokemon.*;


public class SmartStrike extends PhysicalMove{
    public SmartStrike(){
        super(Type.STEEL, 70, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        super.applySelfEffects(pokemon);

        accuracy = 1;
    }
    @Override
    protected String describe(){
        return "покемон никогда не промахнётся";
    }
}
