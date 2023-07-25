package dev.pablomedrano.designpatterns.strategy.after.behaviors;

public class Squeak implements QuackBehavior{

    public void quack() {
        System.out.println("Squeak");
    }
}
