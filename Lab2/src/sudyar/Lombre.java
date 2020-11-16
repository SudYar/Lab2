package sudyar;

import ru.ifmo.se.pokemon.*;

public class Lombre extends Lotad{
    public Lombre(String name, int level){
        super(name, level);
        setStats(60, 50, 50, 60, 70, 50);
        setType(Type.WATER, Type.GRASS);
        setMove(new EnergyBall(), new Scald(), new Bubble());
    }
}