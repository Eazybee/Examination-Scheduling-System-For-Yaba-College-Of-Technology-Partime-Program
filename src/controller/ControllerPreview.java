
package controller;

import examinationschedulingsystem.Day;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.print.PageLayout;
import javafx.print.PageOrientation;
import javafx.print.Paper;
import javafx.print.Printer;
import javafx.print.PrinterAttributes;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import preview.LinkClass;
import preview.Populate;
        

public class ControllerPreview implements Initializable{
  private Stage primaryStage;
  private Scene scene; 
    
   
    @Override
     public void initialize(URL url, ResourceBundle resources){
        level.setCellValueFactory(new PropertyValueFactory<>("level"));
        level.getStyleClass().add("vt");
        
        
        day1M.setCellValueFactory(new PropertyValueFactory<>("D1M"));
        day1A.setCellValueFactory(new PropertyValueFactory<>("D1A"));
        day1E.setCellValueFactory(new PropertyValueFactory<>("D1E"));
        
        day2M.setCellValueFactory(new PropertyValueFactory<>("D2M"));
        day2A.setCellValueFactory(new PropertyValueFactory<>("D2A"));
        day2E.setCellValueFactory(new PropertyValueFactory<>("D2E"));
        
        day3M.setCellValueFactory(new PropertyValueFactory<>("D3M"));
        day3A.setCellValueFactory(new PropertyValueFactory<>("D3A"));
        day3E.setCellValueFactory(new PropertyValueFactory<>("D3E"));
        
        day4M.setCellValueFactory(new PropertyValueFactory<>("D4M"));
        day4A.setCellValueFactory(new PropertyValueFactory<>("D4A"));
        day4E.setCellValueFactory(new PropertyValueFactory<>("D4E"));
        
        day5M.setCellValueFactory(new PropertyValueFactory<>("D5M"));
        day5A.setCellValueFactory(new PropertyValueFactory<>("D5A"));
        day5E.setCellValueFactory(new PropertyValueFactory<>("D5E"));
        
        day6M.setCellValueFactory(new PropertyValueFactory<>("D6M"));
        day6A.setCellValueFactory(new PropertyValueFactory<>("D6A"));
        day6E.setCellValueFactory(new PropertyValueFactory<>("D6E"));
        
        day7M.setCellValueFactory(new PropertyValueFactory<>("D7M"));
        day7A.setCellValueFactory(new PropertyValueFactory<>("D7A"));
        day7E.setCellValueFactory(new PropertyValueFactory<>("D7E"));
        
        day7M.setCellValueFactory(new PropertyValueFactory<>("D7M"));
        day7A.setCellValueFactory(new PropertyValueFactory<>("D7A"));
        day7E.setCellValueFactory(new PropertyValueFactory<>("D7E"));
        
        day8M.setCellValueFactory(new PropertyValueFactory<>("D8M"));
        day8A.setCellValueFactory(new PropertyValueFactory<>("D8A"));
        day8E.setCellValueFactory(new PropertyValueFactory<>("D8E"));
        
        
         
        btnReturn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene);
                primaryStage.setResizable(false);
                primaryStage.setTitle("Examination Scheduling System For Part Time Students");
                primaryStage.show();
            }
        });
        
        btnPrint.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    printNode(ancPane);
                } catch (NoSuchMethodException ex) {
                    Logger.getLogger(ControllerPreview.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ControllerPreview.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ControllerPreview.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvocationTargetException ex) {
                    Logger.getLogger(ControllerPreview.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
     }
     
     public  void setDayList(ArrayList<Day> dayList, Stage primaryStage, Scene scene){
         this.primaryStage=primaryStage;
         this.scene=scene;
         date1.setText(dayList.get(0).getDate());
         date2.setText(dayList.get(1).getDate());
         date3.setText(dayList.get(2).getDate());
         date4.setText(dayList.get(3).getDate());
         date5.setText(dayList.get(4).getDate());
         date6.setText(dayList.get(5).getDate());
         date7.setText(dayList.get(6).getDate());
         date8.setText(dayList.get(7).getDate());
         
         tableView.setItems(new LinkClass(dayList).getLink());
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
     
    
     
     
    
      //------------------------//
     //--------TableCoulm------//
    //------------------------//
       
       
       @FXML
       private TableView<Populate> tableView;
       @FXML
       private TableColumn<Populate , String> level;
       
       @FXML
       private TableColumn<Populate , String> date1;
       @FXML
       private TableColumn<Populate , String> day1M;
       @FXML
       private TableColumn<Populate , String> day1A;
       @FXML
       private TableColumn<Populate , String> day1E;
       
       
       @FXML
       private TableColumn<Populate , String> date2;
       @FXML
       private TableColumn<Populate , String> day2M;
       @FXML
       private TableColumn<Populate , String> day2A;
       @FXML
       private TableColumn<Populate , String> day2E;
       
       @FXML
       private TableColumn<Populate , String> date3;
       @FXML
       private TableColumn<Populate , String> day3M;
       @FXML
       private TableColumn<Populate , String> day3A;
       @FXML
       private TableColumn<Populate , String> day3E;
       
       @FXML
       private TableColumn<Populate , String> date4;
       @FXML
       private TableColumn<Populate , String> day4M;
       @FXML
       private TableColumn<Populate , String> day4A;
       @FXML
       private TableColumn<Populate , String> day4E;
       
       @FXML
       private TableColumn<Populate , String> date5;
       @FXML
       private TableColumn<Populate , String> day5M;
       @FXML
       private TableColumn<Populate , String> day5A;
       @FXML
       private TableColumn<Populate , String> day5E;
       
       @FXML
       private TableColumn<Populate , String> date6;
       @FXML
       private TableColumn<Populate , String> day6M;
       @FXML
       private TableColumn<Populate , String> day6A;
       @FXML
       private TableColumn<Populate , String> day6E;
       
       @FXML
       private TableColumn<Populate , String> date7;
       @FXML
       private TableColumn<Populate , String> day7M;
       @FXML
       private TableColumn<Populate , String> day7A;
       @FXML
       private TableColumn<Populate , String> day7E;
       
       @FXML
       private TableColumn<Populate , String> date8;
       @FXML
       private TableColumn<Populate , String> day8M;
       @FXML
       private TableColumn<Populate , String> day8A;
       @FXML
       private TableColumn<Populate , String> day8E;
       
       @FXML
       private Button btnPrint;
       @FXML
       private Button btnReturn;
       
       @FXML
       private AnchorPane ancPane;
    
}
