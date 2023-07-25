package dev.pablomedrano.designpatterns.observer.subjects;

import dev.pablomedrano.designpatterns.observer.observers.Observer;
import java.util.ArrayList;
import java.util.List;

public class Youtube  implements Subject{

    private List<Observer> observers;
    private String notification;

    public Youtube(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(notification);
        }
    }

    public void sendNotification(String notification){
        this.notification = notification;
        notifyObservers();
    }

}
