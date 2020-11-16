package sudyar;

import ru.ifmo.se.pokemon.*;

public class TapuFini extends Pokemon{
    public TapuFini(String name, int level){
        super(name, level);
        setStats(70, 75, 115, 95, 130, 85);
        setType(Type.WATER, Type.FAIRY);
        setMove(new SmartStrike(), new Facade());
    }
}
