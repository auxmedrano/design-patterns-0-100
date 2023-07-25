package dev.pablomedrano.designpatterns.strategy.after.ducks;

import dev.pablomedrano.designpatterns.strategy.after.behaviors.FlyNoWay;
import dev.pablomedrano.designpatterns.strategy.after.behaviors.MuteQuack;

public class sDecoyDuck extends sDuck {

    public sDecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I'm a Decoy duck");
    }

}
