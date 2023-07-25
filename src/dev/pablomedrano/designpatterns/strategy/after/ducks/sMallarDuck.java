package dev.pablomedrano.designpatterns.strategy.after.ducks;

import dev.pablomedrano.designpatterns.strategy.after.behaviors.FlyWithWings;
import dev.pablomedrano.designpatterns.strategy.after.behaviors.Quack;

public class sMallarDuck extends sDuck{

    public sMallarDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
