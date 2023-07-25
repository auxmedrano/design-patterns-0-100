package dev.pablomedrano.designpatterns.observer.subjects;

import dev.pablomedrano.designpatterns.observer.observers.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
