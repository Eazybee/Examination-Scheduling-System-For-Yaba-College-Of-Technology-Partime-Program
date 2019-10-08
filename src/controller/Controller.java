
package controller;

import examinationschedulingsystem.Course;
import examinationschedulingsystem.Date_;
import examinationschedulingsystem.Day;
import examinationschedulingsystem.Department;
import examinationschedulingsystem.List;
import examinationschedulingsystem.Time_;
import static java.awt.image.ImageObserver.WIDTH;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import preview.PreviewTable;
        

public class Controller implements Initializable{
    int i=0;
    Boolean test=Boolean.FALSE;
    ObservableList<Course> ob=null;
    Scene scene;
    
    ArrayList<ChoiceBox> choiceBoxNd1 = new ArrayList<>();
    ArrayList<ChoiceBox> choiceBoxNd2 = new ArrayList<>();
    ArrayList<ChoiceBox> choiceBoxNd3 = new ArrayList<>();
    ArrayList<ChoiceBox> choiceBoxHNd1 = new ArrayList<>();
    ArrayList<ChoiceBox> choiceBoxHNd2 = new ArrayList<>();
    ArrayList<ChoiceBox> choiceBoxHNd3 = new ArrayList<>();
    
    
    ArrayList<ChoiceBox> choiceBoxM = new ArrayList<>();
    ArrayList<TextField> textFeildM = new ArrayList<>();
    
    ArrayList<ChoiceBox> choiceBoxA = new ArrayList<>();
    ArrayList<TextField> textFeildA = new ArrayList<>();
    
    ArrayList<ChoiceBox> choiceBoxE = new ArrayList<>();
    ArrayList<TextField> textFeildE = new ArrayList<>();
    
    
    
    Department departmentComputer1;
    Department departmentComputer2;
    Department departmentFood1;
    Department departmentFood2;
    Department departmentHospitality1;
    Department departmentHospitality2;
    
    
    
    Day day1;
    Day day2;
    Day day3;
    Day day4;
    Day day5;
    Day day6;
    Day day7;
    Day day8;
    
    @Override
     public void initialize(URL url, ResourceBundle resources){
         
        choiceBoxNd1.add(choBx1N1);
        choiceBoxNd1.add(choBx7N1);
        choiceBoxNd1.add(choBx13N1);
        
        choiceBoxNd2.add(choBx2N2);
        choiceBoxNd2.add(choBx8N2);
        choiceBoxNd2.add(choBx14N2);
        
        choiceBoxNd3.add(choBx3N3);
        choiceBoxNd3.add(choBx9N3);
        choiceBoxNd3.add(choBx15N3);
         
        
        choiceBoxHNd1.add(choBx4H1);
        choiceBoxHNd1.add(choBx10H1);
        choiceBoxHNd1.add(choBx16H1);
        
        choiceBoxHNd2.add(choBx5H2);
        choiceBoxHNd2.add(choBx11H2);
        choiceBoxHNd2.add(choBx17H2);
        
        choiceBoxHNd3.add(choBx6H3);
        choiceBoxHNd3.add(choBx12H3);
        choiceBoxHNd3.add(choBx18H3);
        
        choiceBoxM.add(choBx1N1);
        choiceBoxM.add(choBx2N2);
        choiceBoxM.add(choBx3N3);
        choiceBoxM.add(choBx4H1);
        choiceBoxM.add(choBx5H2);
        choiceBoxM.add(choBx6H3);
        
        textFeildM.add(txt1N1);
        textFeildM.add(txt2N2);
        textFeildM.add(txt3N3);
        textFeildM.add(txt4H1);
        textFeildM.add(txt5H2);
        textFeildM.add(txt6H3);
        
        
        choiceBoxA.add(choBx7N1);
        choiceBoxA.add(choBx8N2);
        choiceBoxA.add(choBx9N3);
        choiceBoxA.add(choBx10H1);
        choiceBoxA.add(choBx11H2);
        choiceBoxA.add(choBx12H3);
        
        textFeildA.add(txt7N1);
        textFeildA.add(txt8N2);
        textFeildA.add(txt9N3);
        textFeildA.add(txt10H1);
        textFeildA.add(txt11H2);
        textFeildA.add(txt12H3);
        
        choiceBoxE.add(choBx13N1);
        choiceBoxE.add(choBx14N2);
        choiceBoxE.add(choBx15N3);
        choiceBoxE.add(choBx16H1);
        choiceBoxE.add(choBx17H2);
        choiceBoxE.add(choBx18H3);
        
        textFeildE.add(txt13N1);
        textFeildE.add(txt14N2); 
        textFeildE.add(txt15N3);
        textFeildE.add(txt16H1);
        textFeildE.add(txt17H2);
        textFeildE.add(txt18H3);
        
        myIntialize();
        
     }
     
     public void myIntialize(){
        departmentComputer1 = new Department();
        departmentComputer2 = new Department();
        departmentFood1 = new Department();
        departmentFood2 = new Department();
        departmentHospitality1 = new Department();
        departmentHospitality2 = new Department(); 
        
        day1 = getDay();
        day2 = getDay();
        day3 = getDay();
        day4 = getDay();
        day5 = getDay();
        day6 = getDay();
        day7 = getDay();
        day8 = getDay();
        
        
        
        
        
        mIPrintPreview.setOnAction(evtPrintPreview);
        mINew.setOnAction((ActionEvent event) -> {
            int p = JOptionPane.showConfirmDialog(null, "Progress with current TimeTable will be lost \n\n Are you sure want to create new TimeTable?","Create New TimeTable", JOptionPane.YES_NO_OPTION);
            if(p==0){
            myIntialize();
            }
            
        });
        btnCreateTimeTable.setOnAction(evtPrintPreview);
        tPane.getSelectionModel().selectedItemProperty().addListener(tabListener);
        choBxSemester1.getSelectionModel().selectedItemProperty().addListener(semesterListener);
        choBxDay.getSelectionModel().selectedItemProperty().addListener(dayListener);
        choBxDepartment1.getSelectionModel().selectedItemProperty().addListener(departmentListener);
        dtPDate.setOnHiding((Event event) -> {
            save(getChoiceBox(choBxDepartment1),getChoiceBox(choBxDay));
            check(getChoiceBox(choBxSemester1), getChoiceBox(choBxDepartment1));
        });
        choBxSemester1.getSelectionModel().selectFirst();
        eventLoader(Boolean.TRUE);
     }
     
     public void check(String semester,String department){
        
        eventLoader(Boolean.FALSE);
        
        for (TextField tf: textFeildM) {
            tf.setText("");
        }
        for (TextField tf: textFeildA) {
            tf.setText("");
        }
        for (TextField tf: textFeildE) {
            tf.setText("");
        }
        for(ChoiceBox choBx:choiceBoxM){
            choBx.setItems(new List().getList(""));
        }
        for(ChoiceBox choBx:choiceBoxA){
            choBx.setItems(new List().getList(""));
        }
        for(ChoiceBox choBx:choiceBoxE){
            choBx.setItems(new List().getList(""));
        }       
          
        
        if(!"Semester".equals(semester)){
            choBxDay.setDisable(false);
            dtPDate.setDisable(false);
            choBxSemester1.setDisable(true);
            
            if(!dtPDate.getDate().isEmpty()){
                
                
                choBxDepartment1.setDisable(false);
                if(!"Department".equals(department)){
                    
                    tPane.setDisable(false);
                    btnCreateTimeTable.setDisable(false);
                }
                else{
                    tPane.setDisable(true);
                    btnCreateTimeTable.setDisable(true);
                }
            }else{
                
                choBxDepartment1.setDisable(true);
                choBxDepartment1.getSelectionModel().selectFirst();
                tPane.getSelectionModel().selectFirst();
                tPane.setDisable(true);
                btnCreateTimeTable.setDisable(true);
            }
        }else{
            choBxSemester1.setDisable(false);
            choBxDay.setDisable(true);
            choBxDay.getSelectionModel().selectFirst();
            choBxDepartment1.setDisable(true);
            choBxDepartment1.getSelectionModel().selectFirst();
            dtPDate.setDisable(true);
            dtPDate.setValue(null);
            tPane.getSelectionModel().selectFirst();
            tPane.setDisable(true);
            btnCreateTimeTable.setDisable(true);
        }
        eventLoader(Boolean.TRUE);
        
        
     }
     
     public Day getDay(){
          Course tempCourse= new Course("", "");
          Time_ tempTime = new Time_(tempCourse,tempCourse,tempCourse,tempCourse,tempCourse,tempCourse);
          Department tempDepartment = new Department(tempTime,tempTime,tempTime);
          Day tempDay = new Day("","",tempDepartment,tempDepartment,tempDepartment);
         
          return tempDay;
     }
     
     public String getChoiceBox(ChoiceBox cb){
        
         if(cb.getSelectionModel().isEmpty()){
             return "";
         }else{
             return cb.getSelectionModel().getSelectedItem().toString();
         }
       
     }
     
     public String getString_(TextField tf){
         if(tf.getText().trim().isEmpty()){
             return "";
         }else{
             return tf.getText().trim().toUpperCase();
         }
     }
     
     public void save(String dept, String day){
          String date = dtPDate.getDate();
              
          Course mNd1= new Course(getChoiceBox(choBx1N1),getString_(txt1N1));
          Course mNd2= new Course(getChoiceBox(choBx2N2),getString_(txt2N2));
          Course mNd3= new Course(getChoiceBox(choBx3N3),getString_(txt3N3));
          Course mHnd1= new Course(getChoiceBox(choBx4H1),getString_(txt4H1));
          Course mHnd2= new Course(getChoiceBox(choBx5H2),getString_(txt5H2));
          Course mHnd3= new Course(getChoiceBox(choBx6H3),getString_(txt6H3));
          
          Course aNd1= new Course(getChoiceBox(choBx7N1),getString_(txt7N1));
          Course aNd2= new Course(getChoiceBox(choBx8N2),getString_(txt8N2));
          Course aNd3= new Course(getChoiceBox(choBx9N3),getString_(txt9N3));
          Course aHnd1= new Course(getChoiceBox(choBx10H1),getString_(txt10H1));
          Course aHnd2= new Course(getChoiceBox(choBx11H2),getString_(txt11H2));
          Course aHnd3= new Course(getChoiceBox(choBx12H3),getString_(txt12H3));
          
          Course eNd1= new Course(getChoiceBox(choBx13N1),getString_(txt13N1));
          Course eNd2= new Course(getChoiceBox(choBx14N2),getString_(txt14N2));
          Course eNd3= new Course(getChoiceBox(choBx15N3),getString_(txt15N3));
          Course eHnd1= new Course(getChoiceBox(choBx16H1),getString_(txt16H1));
          Course eHnd2= new Course(getChoiceBox(choBx17H2),getString_(txt17H2));
          Course eHnd3= new Course(getChoiceBox(choBx18H3),getString_(txt18H3));
          
          
          
          String department =  dept;
          String semester = getChoiceBox(choBxSemester1);
          
          
          
          Day tempDay = new Day();
          Department tempDepartment = new Department();
          
          Time_ tempMorning = new Time_();
          Time_ tempAfternoon= new Time_();
          Time_ tempEvening = new Time_();
          
          tempDay.setDay(day);
          tempDay.setDate(date);
          
          //--------MORNING--------
          tempMorning.setTime("Morning");
          tempMorning.setNd1(mNd1);
          tempMorning.setNd2(mNd2);
          tempMorning.setNd3(mNd3);
          tempMorning.setHnd1(mHnd1);
          tempMorning.setHnd2(mHnd2);
          tempMorning.setHnd3(mHnd3);
          
          
          //----------AFTERNOON-------
          tempAfternoon.setTime("Afternoon");
          tempAfternoon.setNd1(aNd1);
          tempAfternoon.setNd2(aNd2);
          tempAfternoon.setNd3(aNd3);
          tempAfternoon.setHnd1(aHnd1);
          tempAfternoon.setHnd2(aHnd2);
          tempAfternoon.setHnd3(aHnd3);
          
          
          //-----------EVENING-------
          tempEvening.setTime("Evening");
          tempEvening.setNd1(eNd1);
          tempEvening.setNd2(eNd2);
          tempEvening.setNd3(eNd3);
          tempEvening.setHnd1(eHnd1);
          tempEvening.setHnd2(eHnd2);
          tempEvening.setHnd3(eHnd3);
          
          tempDepartment.setMorning(tempMorning);
          tempDepartment.setAfternoon(tempAfternoon);
          tempDepartment.setEvening(tempEvening);
          
           
          dayUpdate(tempDay.getDay(), tempDepartment,department);
          
          
              
          
     }
     
     public void dayUpdate(String dayInput, Department tempDepartment, String chkDepart){
         
         if("Day 1".equals(dayInput)){
             day1.setDate(dtPDate.getDate());
             day1.setDay(dayInput);
         }
         if("Day 2".equals(dayInput)){
             day2.setDate(dtPDate.getDate());
             day2.setDay(dayInput);
         }
         if("Day 3".equals(dayInput)){
             day3.setDate(dtPDate.getDate());
             day3.setDay(dayInput);
         }
         if("Day 4".equals(dayInput)){
             day4.setDate(dtPDate.getDate());
             day4.setDay(dayInput);
         }
         if("Day 5".equals(dayInput)){
             day5.setDate(dtPDate.getDate());
             day5.setDay(dayInput);
         }
         if("Day 6".equals(dayInput)){
             day6.setDate(dtPDate.getDate());
             day6.setDay(dayInput);
         }
         if("Day 7".equals(dayInput)){
             day7.setDate(dtPDate.getDate());
             day7.setDay(dayInput);
         }
         if("Day 8".equals(dayInput)){
             day8.setDate(dtPDate.getDate());
             day8.setDay(dayInput);
         }
         
         
         if("Computer Technology".equals(chkDepart)){
            if("Day 1".equals(dayInput)){
                 day1.setD1(tempDepartment);
                 
            }
            if("Day 2".equals(dayInput)){
                 day2.setD1(tempDepartment);

             }
            if("Day 3".equals(dayInput)){
                 day3.setD1(tempDepartment);

             }
            if("Day 4".equals(dayInput)){
                 day4.setD1(tempDepartment);

             }
            if("Day 5".equals(dayInput)){
                 day5.setD1(tempDepartment);

             }
            if("Day 6".equals(dayInput)){
                 day6.setD1(tempDepartment);

             }
            if("Day 7".equals(dayInput)){
                 day7.setD1(tempDepartment);

             }
            if("Day 8".equals(dayInput)){
                 day8.setD1(tempDepartment);

             }
         }
         if("Food Technology".equals(chkDepart)){
            if("Day 1".equals(dayInput)){
                 day1.setD2(tempDepartment);

            }
            if("Day 2".equals(dayInput)){
                 day2.setD2(tempDepartment);

             }
            if("Day 3".equals(dayInput)){
                 day3.setD2(tempDepartment);

             }
            if("Day 4".equals(dayInput)){
                 day4.setD2(tempDepartment);

             }
            if("Day 5".equals(dayInput)){
                 day5.setD2(tempDepartment);

             }
            if("Day 6".equals(dayInput)){
                 day6.setD2(tempDepartment);

             }
            if("Day 7".equals(dayInput)){
                 day7.setD2(tempDepartment);

             }
            if("Day 8".equals(dayInput)){
                 day8.setD2(tempDepartment);

             }
         }
         if("Hospitality".equals(chkDepart)){
            if("Day 1".equals(dayInput)){
                 day1.setD3(tempDepartment);

            }
            if("Day 2".equals(dayInput)){
                 day2.setD3(tempDepartment);

             }
            if("Day 3".equals(dayInput)){
                 day3.setD3(tempDepartment);

             }
            if("Day 4".equals(dayInput)){
                 day4.setD3(tempDepartment);

             }
            if("Day 5".equals(dayInput)){
                 day5.setD3(tempDepartment);

             }
            if("Day 6".equals(dayInput)){
                 day6.setD3(tempDepartment);

             }
            if("Day 7".equals(dayInput)){
                 day7.setD3(tempDepartment);

             }
            if("Day 8".equals(dayInput)){
                 day8.setD3(tempDepartment);

             }
         }
     }
     
     public void changed_(String newValue){
                     
                    
                    String day = getChoiceBox(choBxDay);
                    String department = newValue;
                    String semester = (String) choBxSemester1.getSelectionModel().getSelectedItem();
                    
                    
                    //-----Computer Technology 1st Semester 
                    if("Computer Technology".equals(department) && "1".equals(semester)){
                        ob = new List().getList("CND1_1st");
                        popChoiceBox(choiceBoxNd1, ob,day,department);

                        ob = new List().getList("CND2_1st");
                        popChoiceBox(choiceBoxNd2, ob,day,department);

                        ob = new List().getList("CND3_1st");
                        popChoiceBox(choiceBoxNd3, ob,day,department);
                        
                        ob = new List().getList("CHND1_1st");
                        popChoiceBox(choiceBoxHNd1, ob,day,department);
                        
                        ob = new List().getList("CHND2_1st");
                        popChoiceBox(choiceBoxHNd2, ob,day,department);
                        
                        ob = new List().getList("CHND3_1st");
                        popChoiceBox(choiceBoxHNd3, ob,day,department);
                        
                        
                        
                    }
                    //-----Computer Technology 2nd Semester
                    if("Computer Technology".equals(department) && "2".equals(semester)){
                        ob = new List().getList("CND1_2nd");
                        popChoiceBox(choiceBoxNd1, ob,day,department);

                        ob = new List().getList("CND2_2nd");
                        popChoiceBox(choiceBoxNd2, ob,day,department);

                        ob = new List().getList("CND3_2nd");
                        popChoiceBox(choiceBoxNd3, ob,day,department);
                        
                        ob = new List().getList("CHND1_2nd");
                        popChoiceBox(choiceBoxHNd1, ob,day,department);
                        
                        ob = new List().getList("CHND2_2nd");
                        popChoiceBox(choiceBoxHNd2, ob,day,department);
                        
                        ob = new List().getList("CHND3_2nd");
                        popChoiceBox(choiceBoxHNd3, ob,day,department);
                    }
                    
                    
                    //-----Food Technology 1st Semester 
                    if("Food Technology".equals(department) && "1".equals(semester)){
                        ob = new List().getList("FND1_1st");
                        popChoiceBox(choiceBoxNd1, ob,day,department);

                        ob = new List().getList("FND2_1st");
                        popChoiceBox(choiceBoxNd2, ob,day,department);

                        ob = new List().getList("FND3_1st");
                        popChoiceBox(choiceBoxNd3, ob,day,department);
                        
                        ob = new List().getList("FHND1_1st");
                        popChoiceBox(choiceBoxHNd1, ob,day,department);
                        
                        ob = new List().getList("FHND2_1st");
                        popChoiceBox(choiceBoxHNd2, ob,day,department);
                        
                        ob = new List().getList("FHND3_1st");
                        popChoiceBox(choiceBoxHNd3, ob,day,department);
                        
                    }
                    //-----Food Technology 2nd Semester
                    if("Food Technology".equals(department) && "2".equals(semester)){
                        ob = new List().getList("FND1_2nd");
                        popChoiceBox(choiceBoxNd1, ob,day,department);

                        ob = new List().getList("FND2_2nd");
                        popChoiceBox(choiceBoxNd2, ob,day,department);

                        ob = new List().getList("FND3_2nd");
                        popChoiceBox(choiceBoxNd3, ob,day,department);
                        
                        ob = new List().getList("FHND1_2nd");
                        popChoiceBox(choiceBoxHNd1, ob,day,department);
                        
                        ob = new List().getList("FHND2_2nd");
                        popChoiceBox(choiceBoxHNd2, ob,day,department);
                        
                        ob = new List().getList("FHND3_2nd");
                        popChoiceBox(choiceBoxHNd3, ob,day,department);
                    }
                    
                    
                    //-----Hospitality 1st Semester 
                    if("Hospitality".equals(department) && "1".equals(semester)){
                        ob = new List().getList("H_ND1_1st");
                        popChoiceBox(choiceBoxNd1, ob,day,department);

                        ob = new List().getList("H_ND2_1st");
                        popChoiceBox(choiceBoxNd2, ob,day,department);

                        ob = new List().getList("H_ND3_1st");
                        popChoiceBox(choiceBoxNd3, ob,day,department);
                        
                        ob = new List().getList("H_HND1_1st");
                        popChoiceBox(choiceBoxHNd1, ob,day,department);
                        
                        ob = new List().getList("H_HND2_1st");
                        popChoiceBox(choiceBoxHNd2, ob,day,department);
                        
                        ob = new List().getList("H_HND3_1st");
                        popChoiceBox(choiceBoxHNd3, ob,day,department);
                        
                    }
                    //-----Hospitality 2nd Semester
                    if("Hospitality".equals(department) && "2".equals(semester)){
                        ob = new List().getList("H_ND1_2nd");
                        popChoiceBox(choiceBoxNd1, ob,day,department);

                        ob = new List().getList("H_ND2_2nd");
                        popChoiceBox(choiceBoxNd2, ob,day,department);

                        ob = new List().getList("H_ND3_2nd");
                        popChoiceBox(choiceBoxNd3, ob,day,department);
                        
                        ob = new List().getList("H_HND1_2nd");
                        popChoiceBox(choiceBoxHNd1, ob,day,department);
                        
                        ob = new List().getList("H_HND2_2nd");
                        popChoiceBox(choiceBoxHNd2, ob,day,department);
                        
                        ob = new List().getList("H_HND3_2nd");
                        popChoiceBox(choiceBoxHNd3, ob,day,department);
                        
                    }
                    
     }
     
     public void eventLoader(Boolean bool){
         if(bool){
            for (ChoiceBox choiceBox : choiceBoxM) {
            choiceBox.getSelectionModel().selectedItemProperty().addListener(courseListener);
            }
            for (ChoiceBox choiceBox : choiceBoxA) {
                choiceBox.getSelectionModel().selectedItemProperty().addListener(courseListener);
            }
            for (ChoiceBox choiceBox : choiceBoxE) {
                choiceBox.getSelectionModel().selectedItemProperty().addListener(courseListener);
            }
         }
         if(!bool){
            for (ChoiceBox choiceBox : choiceBoxM) {
            choiceBox.getSelectionModel().selectedItemProperty().removeListener(courseListener);
            }
            for (ChoiceBox choiceBox : choiceBoxA) {
                choiceBox.getSelectionModel().selectedItemProperty().removeListener(courseListener);
            }
            for (ChoiceBox choiceBox : choiceBoxE) {
                choiceBox.getSelectionModel().selectedItemProperty().removeListener(courseListener);
            }
         }
     }
     
     public void courseChanged(ArrayList<ChoiceBox> chckBx, ArrayList<TextField> txtF, int i, Course newValue ){
        String level="";
        String tempString="";
        String level2="";
                
        if(i==0 || i==2 || i==3 || i==5){
            if(i==0){
                level="ND1";
                level2="ND2";
                tempString=getChoiceBox(chckBx.get(i+1)).trim();
            }
            if(i==2){
                level="ND3";
                level2="ND2";
                tempString=getChoiceBox(chckBx.get(i-1)).trim();
            }
            if(i==3){
                level="HND1";
                level2="HND2";
                tempString=getChoiceBox(chckBx.get(i+1)).trim();
            }
            if(i==5){
                level="HND3";
                level2="HND2";
                tempString=getChoiceBox(chckBx.get(i-1)).trim();
            }
                            
            if(!newValue.getCourseCode().trim().isEmpty()){
                                
                if(!tempString.isEmpty()){
                    JOptionPane.showMessageDialog(null, level+" and "+level2+" cannot have papper the same time because of carry-over students!","ERROR!",WIDTH);
                    chckBx.get(i).getSelectionModel().selectFirst();
                }else{
                    if(courseChanged2(newValue,chckBx.get(i))){
                        
                        txtF.get(i).setText(newValue.getCourseCode());
                    }else{
                        chckBx.get(i).getSelectionModel().selectFirst();
                    }
                }
            }else{
                if(courseChanged2(newValue,chckBx.get(i))){
                   
                    txtF.get(i).setText(newValue.getCourseCode());
                }else{
                    chckBx.get(i).getSelectionModel().selectFirst();
                }
            }
        }
                        
        if(i==1 || i==4){
            if(!newValue.getCourseCode().trim().isEmpty()){
                if(i==1){
                    level="ND2";
                }
                if(i==4){
                    level="HND2";
                    level2="H";
                }
                
                if(!getChoiceBox(chckBx.get(i+1)).trim().isEmpty()){
                    level2+="ND3";
                                    
                    JOptionPane.showMessageDialog(null, level+" and "+level2+" cannot have papper the same time because of carry-over students!","ERROR!",WIDTH);
                    chckBx.get(i).getSelectionModel().selectFirst();
                }else if(!getChoiceBox(chckBx.get(i-1)).trim().isEmpty()){
                    level2+="ND1";
                                    
                    JOptionPane.showMessageDialog(null, level+" and "+level2+" cannot have papper the same time because of carry-over students!","ERROR!",WIDTH);
                    chckBx.get(i).getSelectionModel().selectFirst();
                }else{
                    if(courseChanged2(newValue,chckBx.get(i))){
                        txtF.get(i).setText(newValue.getCourseCode());
                    }else{
                        chckBx.get(i).getSelectionModel().selectFirst();
                    }
                }
            }else{
                if(courseChanged2(newValue,chckBx.get(i))){
                    txtF.get(i).setText(newValue.getCourseCode());
                }else{
                    chckBx.get(i).getSelectionModel().selectFirst();
                }
            }
        }
                    
     }
     
     public Boolean courseChanged2(Course newValue, ChoiceBox choBx){
         if(test==true){return true;}
        String tabTime= tPane.getSelectionModel().getSelectedItem().getText();
        
        String time="";
        String dept= getChoiceBox(choBxDepartment1);
        String day= getChoiceBox(choBxDay);
        ArrayList<Day> dayList= new ArrayList<>();    
        dayList.add(day1);
        dayList.add(day2);
        dayList.add(day3);
        dayList.add(day4);
        dayList.add(day5);
        dayList.add(day6);
        dayList.add(day7);
        dayList.add(day8);
        
        
                    
        for (Day tempDay : dayList) {
           
            if("Computer Technology".equals(dept)){
                
                //MORNING
                time=tempDay.getD1().getMorning().getTime();
                if (tempDay.getD1().getMorning().getNd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime) ){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getMorning().getNd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getMorning().getNd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getMorning().getHnd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getMorning().getHnd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getMorning().getHnd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                
                
                
                //Afternoon
                time=tempDay.getD1().getAfternoon().getTime();
                if (tempDay.getD1().getAfternoon().getNd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getAfternoon().getNd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getAfternoon().getNd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getAfternoon().getHnd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getAfternoon().getHnd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getAfternoon().getHnd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                //Evening
                time=tempDay.getD1().getEvening().getTime();
                if (tempDay.getD1().getEvening().getNd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getEvening().getNd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getEvening().getNd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getEvening().getHnd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getEvening().getHnd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD1().getEvening().getHnd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD1().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                        
                
            }
            
            
            if("Food Technology".equals(dept)){
                
                //MORNING
                time=tempDay.getD2().getMorning().getTime();
                if (tempDay.getD2().getMorning().getNd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getMorning().getNd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getMorning().getNd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getMorning().getHnd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getMorning().getHnd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getMorning().getHnd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                
                
                
                //Afternoon
                time=tempDay.getD2().getAfternoon().getTime();
                if (tempDay.getD2().getAfternoon().getNd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getAfternoon().getNd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getAfternoon().getNd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getAfternoon().getHnd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getAfternoon().getHnd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getAfternoon().getHnd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                //Evening
                time=tempDay.getD2().getEvening().getTime();
                if (tempDay.getD2().getEvening().getNd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getEvening().getNd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getEvening().getNd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getEvening().getHnd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getEvening().getHnd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD2().getEvening().getHnd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD2().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                        
                
            }
            
            if("Hospitality".equals(dept)){
                
                //MORNING
                time=tempDay.getD3().getMorning().getTime();
                if (tempDay.getD3().getMorning().getNd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getMorning().getNd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getMorning().getNd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getMorning().getHnd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getMorning().getHnd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getMorning().getHnd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getMorning().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                
                
                
                //Afternoon
                time=tempDay.getD3().getAfternoon().getTime();
                if (tempDay.getD3().getAfternoon().getNd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getAfternoon().getNd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getAfternoon().getNd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getAfternoon().getHnd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getAfternoon().getHnd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getAfternoon().getHnd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getAfternoon().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                //Evening
                time=tempDay.getD3().getEvening().getTime();
                if (tempDay.getD3().getEvening().getNd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getEvening().getNd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getEvening().getNd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getEvening().getHnd1().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getEvening().getHnd2().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                if (tempDay.getD3().getEvening().getHnd3().getCourseCode().equals(newValue.getCourseCode())) {
                    if(!day.equals(tempDay.getDay()) ||  !time.equals(tabTime)){
                        JOptionPane.showMessageDialog(null, newValue.getCourse()+" has been selected on "+tempDay.getDay()+" in the "+tempDay.getD3().getEvening().getTime()+"!","ERROR!",WIDTH);
                        return false;
                    }
                }
                        
                
            }
            
            
            
        }
        
        return true;
     }
     
     final EventHandler<ActionEvent> evtPrintPreview = new EventHandler<ActionEvent>() {

            @Override
             public void handle(ActionEvent event){
                scene= btnCreateTimeTable.getScene();
                Stage primaryStage = (Stage)btnCreateTimeTable.getScene().getWindow();
                save(getChoiceBox(choBxDepartment1),getChoiceBox(choBxDay));
                ArrayList<Day> dayList = new ArrayList<>();    
                dayList.add(day1);
                dayList.add(day2);
                dayList.add(day3);
                dayList.add(day4);
                dayList.add(day5);
                dayList.add(day6);
                dayList.add(day7);
                dayList.add(day8);    
                try {
                    new PreviewTable(primaryStage, scene,dayList).start();
                } catch (Exception ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                
             }
    };
     
     final ChangeListener<Course> courseListener = new ChangeListener<Course>() {

        @Override
        public void changed(ObservableValue<? extends Course> observable, Course oldValue, Course newValue) {
            if(newValue!=null){
                
                for(int i=0; i<choiceBoxM.size(); i++){
                    if(choiceBoxM.get(i).getSelectionModel().selectedItemProperty().equals(observable)){
                        courseChanged(choiceBoxM, textFeildM, i, newValue);
                    }
                }
                for(int i=0; i<choiceBoxA.size(); i++){
                    if(choiceBoxA.get(i).getSelectionModel().selectedItemProperty().equals(observable)){
                        courseChanged(choiceBoxA, textFeildA, i, newValue);
                    }
                }
                for(int i=0; i<choiceBoxE.size(); i++){
                    if(choiceBoxE.get(i).getSelectionModel().selectedItemProperty().equals(observable)){
                        courseChanged(choiceBoxE, textFeildE, i, newValue);
                    }
                }
                
            }
            
            
        }
             
     };
     
     final ChangeListener<String> departmentListener = new ChangeListener<String>() {

        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    
                    save(oldValue,getChoiceBox(choBxDay));
                    check(getChoiceBox(choBxSemester1), getChoiceBox(choBxDepartment1));
                    test=true;
                    changed_(newValue);
                    test=false;
                     
                     
                    
        }
        
     };
     
     final ChangeListener<String> dayListener = new ChangeListener<String>() {

        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            save(getChoiceBox(choBxDepartment1),oldValue);
            if("Day 1".equals(newValue)){dtPDate.setValue(day1.getDayDate());}
            if("Day 2".equals(newValue)){dtPDate.setValue(day2.getDayDate());}
            if("Day 3".equals(newValue)){dtPDate.setValue(day3.getDayDate());}
            if("Day 4".equals(newValue)){dtPDate.setValue(day4.getDayDate());}
            if("Day 5".equals(newValue)){dtPDate.setValue(day5.getDayDate());}
            if("Day 6".equals(newValue)){dtPDate.setValue(day6.getDayDate());}
            if("Day 7".equals(newValue)){dtPDate.setValue(day7.getDayDate());}
            if("Day 8".equals(newValue)){dtPDate.setValue(day8.getDayDate());}
            
            check(getChoiceBox(choBxSemester1), getChoiceBox(choBxDepartment1));
            test=true;    
            changed_(getChoiceBox(choBxDepartment1));
            test=false;
            
        }
    
     };
     
     final ChangeListener<String> semesterListener = new ChangeListener<String>() {

        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            check(newValue,getChoiceBox(choBxDepartment1));
        }

     };
     
     final ChangeListener<Tab> tabListener = new ChangeListener<Tab>() {

        @Override
        public void changed(ObservableValue<? extends Tab> observable, Tab oldValue, Tab newValue) {
                    
                    save(getChoiceBox(choBxDepartment1),getChoiceBox(choBxDay));
                    
                    
                     
                     
                    
        }
        
     };
     
     
     
     //-------------------------//
     //----------CHOICE BOX-----//
     //------------------------//
     @FXML
     private ChoiceBox choBxDepartment1;
     
     @FXML
     private ChoiceBox choBxSemester1;
     
     @FXML
     private ChoiceBox choBxDay;
     
        //Day 1
            //ND1
                @FXML
                private ChoiceBox choBx1N1;

                @FXML
                private ChoiceBox choBx7N1;

                @FXML
                private ChoiceBox choBx13N1;

            //ND2
               @FXML
                private ChoiceBox choBx2N2;

                @FXML
                private ChoiceBox choBx8N2;

                @FXML
                private ChoiceBox choBx14N2;
             
            //ND3
                @FXML
                private ChoiceBox choBx3N3;
 
                @FXML
                private ChoiceBox choBx9N3;

                @FXML
                private ChoiceBox choBx15N3;
            
            //HND1
                @FXML
                private ChoiceBox choBx4H1;
 
                @FXML
                private ChoiceBox choBx10H1;
                
                @FXML
                private ChoiceBox choBx16H1;
               
            //HND2
                @FXML
                private ChoiceBox choBx5H2;
 
                @FXML
                private ChoiceBox choBx11H2;
                
                @FXML
                private ChoiceBox choBx17H2;
                
            //HND3
                @FXML
                private ChoiceBox choBx6H3;
 
                @FXML
                private ChoiceBox choBx12H3;
                
                @FXML
                private ChoiceBox choBx18H3;
 
     
     //-------------------------//
     //----------TEXT FEILD-----//
     //------------------------//
    
     //DAY 1
        //ND1
            @FXML
            private TextField txt1N1;

            @FXML
            private TextField txt7N1;

            @FXML
            private TextField txt13N1;
     
        //ND2
           @FXML
            private TextField txt2N2;

            @FXML
            private TextField txt8N2;

            @FXML
            private TextField txt14N2;
        
        //ND3
             @FXML
            private TextField txt3N3;

            @FXML
            private TextField txt9N3;

            @FXML
            private TextField txt15N3;
            
        //HND1
             @FXML
            private TextField txt4H1;

            @FXML
            private TextField txt10H1;

            @FXML
            private TextField txt16H1;
     
        //HND2
             @FXML
            private TextField txt5H2;

            @FXML
            private TextField txt11H2;

            @FXML
            private TextField txt17H2;
            
        //HND3
             @FXML
            private TextField txt6H3;

            @FXML
            private TextField txt12H3;

            @FXML
            private TextField txt18H3;
            
      //------------------------//
     //-----------Button-------//
    //------------------------//
       @FXML
       private Button btnLoader;
       
       @FXML
       private Button btnCreateTimeTable;
       
       
       
      //------------------------//
     //---------DatePicker-----//
    //------------------------//
       @FXML
       private Date_ dtPDate;
       
       
      //------------------------//
     //---------MenuItems------//
    //------------------------//
       @FXML
       private MenuItem mIPrintPreview;
       
       @FXML
       private MenuItem mINew;
       
      //------------------------//
     //--------TabbedPane------//
    //------------------------//
       @FXML
       private TabPane tPane;
       
      //------------------------//
     //-----------Tab----------//
    //------------------------//
       @FXML
       private Tab tabM;
       
       @FXML
       private Tab tabA;
       
       @FXML
       private Tab tabE;
       
      
       
       
     public void popChoiceBox2(ChoiceBox obj1, String data){
         
        for(int i=0; i<obj1.getItems().size(); i++){
            Course tCourse =(Course)obj1.getItems().get(i);
            if(data.equals(tCourse.getCourse())){
                obj1.getSelectionModel().select(tCourse);
            }
        }
         
     }
     
     public void popChoiceBox(ArrayList<ChoiceBox> obj, ObservableList<Course> ob, String day, String department){
        eventLoader(Boolean.FALSE);
        String data;
         
        for (ChoiceBox obj1 : obj) {
             obj1.setItems(ob);
        }
        eventLoader(Boolean.TRUE);
        for (ChoiceBox obj1 : obj) {
            
            if("Day 1".equals(day)){
                dtPDate.setValue(day1.getDayDate());
                if("Computer Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day1.getD1().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day1.getD1().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day1.getD1().getMorning().getNd3().getCourse(); 
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day1.getD1().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day1.getD1().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day1.getD1().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day1.getD1().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day1.getD1().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day1.getD1().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day1.getD1().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day1.getD1().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day1.getD1().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day1.getD1().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day1.getD1().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day1.getD1().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day1.getD1().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day1.getD1().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day1.getD1().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Food Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day1.getD2().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day1.getD2().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day1.getD2().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day1.getD2().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day1.getD2().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day1.getD2().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day1.getD2().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day1.getD2().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day1.getD2().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day1.getD2().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day1.getD2().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day1.getD2().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day1.getD2().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day1.getD2().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day1.getD2().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day1.getD2().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day1.getD2().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day1.getD2().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Hospitality".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day1.getD3().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day1.getD3().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day1.getD3().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day1.getD3().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day1.getD3().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day1.getD3().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day1.getD3().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day1.getD3().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day1.getD3().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day1.getD3().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day1.getD3().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day1.getD3().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day1.getD3().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day1.getD3().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day1.getD3().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day1.getD3().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day1.getD3().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day1.getD3().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                        
            }
            if("Day 2".equals(day)){
                if("Computer Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day2.getD1().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day2.getD1().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day2.getD1().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day2.getD1().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day2.getD1().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day2.getD1().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day2.getD1().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day2.getD1().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day2.getD1().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day2.getD1().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day2.getD1().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day2.getD1().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day2.getD1().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day2.getD1().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day2.getD1().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day2.getD1().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day2.getD1().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day2.getD1().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Food Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day2.getD2().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day2.getD2().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day2.getD2().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day2.getD2().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day2.getD2().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day2.getD2().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day2.getD2().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day2.getD2().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day2.getD2().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day2.getD2().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day2.getD2().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day2.getD2().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day2.getD2().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day2.getD2().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day2.getD2().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day2.getD2().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day2.getD2().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day2.getD2().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Hospitality".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day2.getD3().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day2.getD3().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day2.getD3().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day2.getD3().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day2.getD3().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day2.getD3().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day2.getD3().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day2.getD3().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day2.getD3().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day2.getD3().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day2.getD3().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day2.getD3().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day2.getD3().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day2.getD3().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day2.getD3().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day2.getD3().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day2.getD3().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day2.getD3().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                        
            }
            if("Day 3".equals(day)){
                if("Computer Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day3.getD1().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day3.getD1().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day3.getD1().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day3.getD1().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day3.getD1().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day3.getD1().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day3.getD1().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day3.getD1().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day3.getD1().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day3.getD1().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day3.getD1().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day3.getD1().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day3.getD1().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day3.getD1().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day3.getD1().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day3.getD1().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day3.getD1().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day3.getD1().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Food Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day3.getD2().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day3.getD2().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day3.getD2().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day3.getD2().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day3.getD2().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day3.getD2().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day3.getD2().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day3.getD2().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day3.getD2().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day3.getD2().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day3.getD2().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day3.getD2().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day3.getD2().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day3.getD2().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day3.getD2().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day3.getD2().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day3.getD2().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day3.getD2().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Hospitality".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day3.getD3().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day3.getD3().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day3.getD3().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day3.getD3().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day3.getD3().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day3.getD3().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day3.getD3().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day3.getD3().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day3.getD3().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day3.getD3().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day3.getD3().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day3.getD3().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day3.getD3().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day3.getD3().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day3.getD3().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day3.getD3().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day3.getD3().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day3.getD3().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                        
            }
            if("Day 4".equals(day)){
                if("Computer Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day4.getD1().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day4.getD1().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day4.getD1().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day4.getD1().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day4.getD1().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day4.getD1().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day4.getD1().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day4.getD1().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day4.getD1().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day4.getD1().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day4.getD1().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day4.getD1().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day4.getD1().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day4.getD1().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day4.getD1().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day4.getD1().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day4.getD1().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day4.getD1().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Food Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day4.getD2().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day4.getD2().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day4.getD2().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day4.getD2().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day4.getD2().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day4.getD2().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day4.getD2().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day4.getD2().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day4.getD2().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day4.getD2().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day4.getD2().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day4.getD2().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day4.getD2().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day4.getD2().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day4.getD2().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day4.getD2().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day4.getD2().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day4.getD2().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Hospitality".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day4.getD3().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day4.getD3().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day4.getD3().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day4.getD3().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day4.getD3().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day4.getD3().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day4.getD3().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day4.getD3().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day4.getD3().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day4.getD3().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day4.getD3().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day4.getD3().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day4.getD3().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day4.getD3().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day4.getD3().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day4.getD3().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day4.getD3().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day4.getD3().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                        
            }
            if("Day 5".equals(day)){
                if("Computer Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day5.getD1().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day5.getD1().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day5.getD1().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day5.getD1().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day5.getD1().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day5.getD1().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day5.getD1().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day5.getD1().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day5.getD1().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day5.getD1().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day5.getD1().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day5.getD1().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day5.getD1().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day5.getD1().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day5.getD1().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day5.getD1().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day5.getD1().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day5.getD1().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Food Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day5.getD2().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day5.getD2().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day5.getD2().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day5.getD2().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day5.getD2().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day5.getD2().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day5.getD2().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day5.getD2().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day5.getD2().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day5.getD2().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day5.getD2().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day5.getD2().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day5.getD2().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day5.getD2().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day5.getD2().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day5.getD2().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day5.getD2().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day5.getD2().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Hospitality".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day5.getD3().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day5.getD3().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day5.getD3().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day5.getD3().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day5.getD3().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day5.getD3().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day5.getD3().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day5.getD3().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day5.getD3().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day5.getD3().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day5.getD3().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day5.getD3().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day5.getD3().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day5.getD3().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day5.getD3().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day5.getD3().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day5.getD3().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day5.getD3().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                        
            }
            if("Day 6".equals(day)){
                if("Computer Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day6.getD1().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day6.getD1().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day6.getD1().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day6.getD1().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day6.getD1().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day6.getD1().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day6.getD1().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day6.getD1().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day6.getD1().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day6.getD1().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day6.getD1().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day6.getD1().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day6.getD1().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day6.getD1().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day6.getD1().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day6.getD1().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day6.getD1().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day6.getD1().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Food Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day6.getD2().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day6.getD2().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day6.getD2().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day6.getD2().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day6.getD2().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day6.getD2().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day6.getD2().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day6.getD2().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day6.getD2().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day6.getD2().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day6.getD2().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day6.getD2().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day6.getD2().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day6.getD2().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day6.getD2().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day6.getD2().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day6.getD2().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day6.getD2().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Hospitality".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day6.getD3().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day6.getD3().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day6.getD3().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day6.getD3().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day6.getD3().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day6.getD3().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day6.getD3().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day6.getD3().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day6.getD3().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day6.getD3().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day6.getD3().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day6.getD3().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day6.getD3().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day6.getD3().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day6.getD3().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day6.getD3().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day6.getD3().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day6.getD3().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                        
            }
            if("Day 7".equals(day)){
                if("Computer Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day7.getD1().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day7.getD1().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day7.getD1().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day7.getD1().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day7.getD1().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day7.getD1().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day7.getD1().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day7.getD1().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day7.getD1().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day7.getD1().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day7.getD1().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day7.getD1().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day7.getD1().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day7.getD1().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day7.getD1().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day7.getD1().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day7.getD1().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day7.getD1().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Food Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day7.getD2().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day7.getD2().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day7.getD2().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day7.getD2().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day7.getD2().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day7.getD2().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day7.getD2().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day7.getD2().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day7.getD2().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day7.getD2().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day7.getD2().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day7.getD2().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day7.getD2().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day7.getD2().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day7.getD2().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day7.getD2().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day7.getD2().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day7.getD2().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Hospitality".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day7.getD3().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day7.getD3().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day7.getD3().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day7.getD3().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day7.getD3().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day7.getD3().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day7.getD3().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day7.getD3().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day7.getD3().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day7.getD3().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day7.getD3().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day7.getD3().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day7.getD3().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day7.getD3().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day7.getD3().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day7.getD3().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day7.getD3().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day7.getD3().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                        
            }
            if("Day 8".equals(day)){
                if("Computer Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day8.getD1().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day8.getD1().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day8.getD1().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day8.getD1().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day8.getD1().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day8.getD1().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day8.getD1().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day8.getD1().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day8.getD1().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day8.getD1().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day8.getD1().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day8.getD1().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day8.getD1().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day8.getD1().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day8.getD1().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day8.getD1().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day8.getD1().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day8.getD1().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Food Technology".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day8.getD2().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day8.getD2().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day8.getD2().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day8.getD2().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day8.getD2().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day8.getD2().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day8.getD2().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day8.getD2().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day8.getD2().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day8.getD2().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day8.getD2().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day8.getD2().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day8.getD2().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day8.getD2().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day8.getD2().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day8.getD2().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day8.getD2().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day8.getD2().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                if("Hospitality".equals(department)){
                    ////MORNING
                        if(obj1==choBx1N1){
                            data= day8.getD3().getMorning().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                        }
                        if(obj1==choBx2N2){
                            data=day8.getD3().getMorning().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx3N3){
                            data= day8.getD3().getMorning().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx4H1){
                            data= day8.getD3().getMorning().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx5H2){
                            data= day8.getD3().getMorning().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx6H3){
                            data= day8.getD3().getMorning().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //AFTERNOON
                        if(obj1==choBx7N1){
                            data= day8.getD3().getAfternoon().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx8N2){
                            data= day8.getD3().getAfternoon().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx9N3){
                            data= day8.getD3().getAfternoon().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx10H1){
                            data= day8.getD3().getAfternoon().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx11H2){
                            data= day8.getD3().getAfternoon().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx12H3){
                            data= day8.getD3().getAfternoon().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    //EVENING
                        if(obj1==choBx13N1){
                            data= day8.getD3().getEvening().getNd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx14N2){
                            data= day8.getD3().getEvening().getNd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx15N3){
                            data= day8.getD3().getEvening().getNd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx16H1){
                            data= day8.getD3().getEvening().getHnd1().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx17H2){
                            data= day8.getD3().getEvening().getHnd2().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                        if(obj1==choBx18H3){
                            data= day8.getD3().getEvening().getHnd3().getCourse();
                            if(!data.trim().isEmpty()){
                                popChoiceBox2(obj1, data);
                            }
                            
                        }
                       
                    
                    
                }
                        
            }
            
        }
        
     }
}
