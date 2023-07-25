package dev.pablomedrano.designpatterns.strategy.after.ducks;

import dev.pablomedrano.designpatterns.strategy.after.behaviors.FlyNoWay;
import dev.pablomedrano.designpatterns.strategy.after.behaviors.Squeak;

public class sRubberDuck extends sDuck {

    public sRubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a Rubber Duck");
    }

}
