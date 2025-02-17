package ExtraOpgaven11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("ExtraOpgaven11/QuizPage1.fxml"));
        primaryStage.setTitle("Epic Quiz");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}
