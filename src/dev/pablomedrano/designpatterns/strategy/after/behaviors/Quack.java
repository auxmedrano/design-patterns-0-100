package dev.pablomedrano.designpatterns.strategy.after.behaviors;

public class Quack implements  QuackBehavior{

    public void quack() {
        System.out.println("Quack!");
    }
}
