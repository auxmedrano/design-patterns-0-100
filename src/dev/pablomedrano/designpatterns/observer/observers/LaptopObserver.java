package dev.pablomedrano.designpatterns.observer.observers;

import dev.pablomedrano.designpatterns.observer.subjects.Netflix;
import dev.pablomedrano.designpatterns.observer.subjects.Youtube;

public class LaptopObserver implements Observer {
    private Netflix netflix;
    private int count;

    public LaptopObserver(Netflix netflix) {
        this.netflix = netflix;
        netflix.registerObserver(this);
    }

    public void update(String notification) {
        count++;
        System.out.println("Laptop Netflix: " + notification);
    }


}
