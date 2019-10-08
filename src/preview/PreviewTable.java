package preview;

import controller.ControllerPreview;
import examinationschedulingsystem.Day;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.print.PageLayout;
import javafx.print.PageOrientation;
import javafx.print.Paper;
import javafx.print.Printer;
import javafx.print.PrinterAttributes;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;


public class PreviewTable{
    private Stage primaryStage;
    private  Scene scene;
    private Button btnReturn;
    ObservableList<TableColumn> list;
    ArrayList<Day> dayList;
    
    public PreviewTable(Stage primaryStage, Scene scene, ArrayList dayList){
        this.primaryStage=primaryStage;
        this.scene =scene;
        this.dayList=dayList;
        
    }
    
    
    public void start() throws Exception {
       
        
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("/fxml/Preview.fxml"));
        ControllerPreview controller = new ControllerPreview();
        
        fXMLLoader.setController(controller); 
        Scene scen = new Scene(fXMLLoader.load());
        controller=fXMLLoader.getController();
        controller.setDayList(dayList,primaryStage,scene);
        
        
        scen.getStylesheets().add(getClass().getResource("/stylesheet/StyleSheet.css").toExternalForm());
        
        primaryStage.setTitle("Print Preview");
        primaryStage.setScene(scen);
        primaryStage.show();
    }

    public static void printNode(final Node node) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Printer printer = Printer.getDefaultPrinter();
        PageLayout pageLayout = printer.createPageLayout(Paper.A4, PageOrientation.LANDSCAPE, Printer.MarginType.HARDWARE_MINIMUM);
        PrinterAttributes attr = printer.getPrinterAttributes();
        PrinterJob job = PrinterJob.createPrinterJob();
        double scaleX = pageLayout.getPrintableWidth() / node.getBoundsInParent().getWidth();
        double scaleY = pageLayout.getPrintableHeight() / node.getBoundsInParent().getHeight();
        Scale scale = new Scale(scaleX, scaleY);
        node.getTransforms().add(scale);

        if(job != null && job.showPrintDialog(node.getScene().getWindow())) {
          boolean success = job.printPage(pageLayout, node);
          if (success) {
            job.endJob();

          }
        }
        node.getTransforms().remove(scale);
  }
    
    
    
}
