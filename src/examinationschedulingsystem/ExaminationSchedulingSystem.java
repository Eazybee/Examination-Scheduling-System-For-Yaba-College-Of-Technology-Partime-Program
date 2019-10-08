
package examinationschedulingsystem;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author EazyBee
 */
public class ExaminationSchedulingSystem extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root =  FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
        Scene scene = new Scene(root);
       
        
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Examination Scheduling System For Part Time Students");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
