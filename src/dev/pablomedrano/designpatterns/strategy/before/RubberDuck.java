package dev.pablomedrano.designpatterns.strategy.before;

public class RubberDuck extends Duck{

    @Override
    public void quack(){
        System.out.println("squeak! squeak!");
    }
    @Override
    public  void fly(){
        System.out.println("Rubber ducks don't fly!");
    }

}
