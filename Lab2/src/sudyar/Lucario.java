package sudyar;

import ru.ifmo.se.pokemon.*;
public class Lucario extends Riolu {
    public Lucario(String name, int level){
        super(name, level);
        setStats(70, 110, 70, 115, 70, 90);
        setType(Type.FIGHTING, Type.STEEL);
        setMove(new Swagger(), new QuickAttack(), new LowSweep(), new FlashCannon());
    }
}
