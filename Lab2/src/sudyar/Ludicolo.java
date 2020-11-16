package sudyar;

import ru.ifmo.se.pokemon.Type;

public class Ludicolo extends Lombre{
    public Ludicolo(String name, int level){
        super(name, level);
        setStats(80, 70, 70, 90, 100, 70);
        setType(Type.WATER, Type.GRASS);
        setMove(new EnergyBall(), new Scald(), new Bubble(), new Waterfall());
    }
}
