package dev.pablomedrano.designpatterns.strategy.after;

import dev.pablomedrano.designpatterns.strategy.after.behaviors.FlyRocketPowered;
import dev.pablomedrano.designpatterns.strategy.after.ducks.sDuck;
import dev.pablomedrano.designpatterns.strategy.after.ducks.sMallarDuck;
import dev.pablomedrano.designpatterns.strategy.after.ducks.sRubberDuck;

public class StrategySimulator {

    public static void main(String[] args) {

        sDuck mallard = new sMallarDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();

        System.out.println("========================================");

        sDuck rubber = new sRubberDuck();
        rubber.performFly();
        rubber.performQuack();
        rubber.display();
        rubber.setFlyBehavior(new FlyRocketPowered());
        rubber.performFly();

    }
}
