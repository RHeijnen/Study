package Snippets.ConcurrentTaskFX;

import javafx.concurrent.Task;

/**
 * Created by Indi on 6/29/2016.
 */
public class NamelessObject {

    public NamelessObject() {
    }

    public Task<Void> doRun() throws InterruptedException {
        return new Task<Void>() {
            @Override
            public Void call() throws InterruptedException {
                System.out.println("doing");
                return null;
            }
        };
    }
}