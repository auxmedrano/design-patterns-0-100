package dev.pablomedrano.designpatterns.observer;

import dev.pablomedrano.designpatterns.observer.observers.LaptopObserver;
import dev.pablomedrano.designpatterns.observer.observers.MobileObserver;
import dev.pablomedrano.designpatterns.observer.observers.TabletObserver;
import dev.pablomedrano.designpatterns.observer.subjects.Netflix;
import dev.pablomedrano.designpatterns.observer.subjects.Youtube;

public class ObserverSimulator {

    public static void main(String[] args) {
        Youtube youtubeChannel = new Youtube();
        Netflix netflix = new Netflix();

        MobileObserver mobileObserver = new MobileObserver(youtubeChannel);
        TabletObserver tabletObserver = new TabletObserver(youtubeChannel);
        LaptopObserver laptopObserver = new LaptopObserver(netflix);

        youtubeChannel.sendNotification("Drozz ha subido un nuevo video: Top 7 lenguajes de programacion");
        youtubeChannel.removeObserver(mobileObserver);

        System.out.println("==================================================");
        youtubeChannel.sendNotification("Drozz ha subido un nuevo video: La Leyenda del Do While");

        System.out.println("********************************************************");
        netflix.sendNotification("Nueva Pelicula Disponible: El Diario de Tux");

    }
}
