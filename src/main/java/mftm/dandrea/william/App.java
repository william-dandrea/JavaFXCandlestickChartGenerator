package mftm.dandrea.william;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        //scene = new Scene(loadFXML("primary"), 640, 480);
        //stage.setScene(scene);

        stage.setScene(new Scene(createContent(), 300,300, Color.WHITE));
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }


    private Parent createContent() {
        Rectangle box = new Rectangle(100, 50, Color.GREY);
        transform(box);
        return new Pane(box);
    }

    private void transform(Rectangle box) {

        box.setTranslateX(100);
        box.setTranslateY(200);

    }



}
