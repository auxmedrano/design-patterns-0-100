package dev.pablomedrano.designpatterns.strategy.before;

public class DecoyDuck extends Duck{

    @Override
    public void fly(){

    }

    @Override
    public void quack(){

    }

    @Override
    public void swim(){

    }

    public void  display(){
        System.out.println("Show Decoy Duck!");
    }



}
