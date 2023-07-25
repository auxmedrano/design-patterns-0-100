package dev.pablomedrano.designpatterns.strategy.after.ducks;

import dev.pablomedrano.designpatterns.strategy.after.behaviors.FlyBehavior;
import dev.pablomedrano.designpatterns.strategy.after.behaviors.QuackBehavior;

public abstract class sDuck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public sDuck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All Ducks float, even decoys!");
    }

    public void display() {
    }


}
