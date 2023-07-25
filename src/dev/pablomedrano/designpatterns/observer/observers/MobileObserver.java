package dev.pablomedrano.designpatterns.observer.observers;

import dev.pablomedrano.designpatterns.observer.subjects.Youtube;

public class MobileObserver implements Observer {

    private Youtube youtubeChannel;
    private int count;

    public MobileObserver(Youtube youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
        youtubeChannel.registerObserver(this);
    }

    public void update(String notification) {
        count++;
        System.out.println("Mobile Youtube: " + notification);
    }


}
