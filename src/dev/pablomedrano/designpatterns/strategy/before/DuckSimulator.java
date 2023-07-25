package dev.pablomedrano.designpatterns.strategy.before;

public class DuckSimulator {

    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck  decoyDuck = new DecoyDuck();

        mallarDuck.quack();
        mallarDuck.fly();
        mallarDuck.swim();

        System.out.println("=============================================");
        rubberDuck.quack();
        rubberDuck.fly();
        rubberDuck.swim();

        System.out.println("=============================================");
        decoyDuck.quack();
        decoyDuck.fly();
        decoyDuck.swim();
        decoyDuck.display();


    }
}
