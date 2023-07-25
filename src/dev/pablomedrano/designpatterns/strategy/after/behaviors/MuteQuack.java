package dev.pablomedrano.designpatterns.strategy.after.behaviors;

public class MuteQuack implements QuackBehavior {


    public void quack() {
        System.out.println("<< Silence >>");
    }
}
