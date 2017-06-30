import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;

public class Main extends Application {


    /**
     * view javafx initialization
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/view.fxml"));
        primaryStage.setTitle("Warehouse in JavaFX");
        primaryStage.setScene(new Scene(root, 710, 640));
        primaryStage.setResizable(false);
        primaryStage.show();
        Controller controller = new Controller();

    }

    /**
     * Start application
     */
    public static void main(String[] args) throws IOException {
        launch(args);

    }
}

