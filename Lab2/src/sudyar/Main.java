package sudyar;

import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new TapuFini("Красотка", 1);
        Pokemon p2 = new Riolu("Синий", 1);
        Pokemon p3 = new Lucario("Злой", 1);
        Pokemon p4 = new Lotad("Шапочка", 1);
        Pokemon p5 = new Lombre("Противный", 1);
        Pokemon p6 = new Ludicolo("Весельчак", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();

    }
}
