package Snippets.ConcurrentTaskFX;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        NamelessObject ob1 = new NamelessObject();
        Task<Void> DoTask = ob1.doRun();
        DoTask.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent t)
            {
                System.out.println("done");
                //http://stackoverflow.com/questions/15217442/javafx-waiting-for-task-to-finish
            }
        });
        new Thread(DoTask).start();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
