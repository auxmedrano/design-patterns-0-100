package dev.pablomedrano.designpatterns.observer.observers;

import dev.pablomedrano.designpatterns.observer.subjects.Youtube;

public class TabletObserver implements Observer {

    private Youtube youtubeChannel;
    private int count;

    public TabletObserver(Youtube youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
        youtubeChannel.registerObserver(this);
    }

    public void update(String notification) {
        count++;
        System.out.println("Tablet Youtube: " + notification);
        System.out.println("Tablet count:" + count);
    }

}

