
package preview;

import examinationschedulingsystem.Course;
import examinationschedulingsystem.Day;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class LinkClass {
        ArrayList<Day> dayList;
        Populate objPopulate ;
        ObservableList<Populate> list = FXCollections.observableArrayList();
        
        ObservableList<Course> listD1M = FXCollections.observableArrayList();
        ObservableList<Course> listD1A = FXCollections.observableArrayList();
        ObservableList<Course> listD1E = FXCollections.observableArrayList();
        
        ObservableList<Course> listD2M = FXCollections.observableArrayList();
        ObservableList<Course> listD2A = FXCollections.observableArrayList();
        ObservableList<Course> listD2E = FXCollections.observableArrayList();
        
        ObservableList<Course> listD3M = FXCollections.observableArrayList();
        ObservableList<Course> listD3A = FXCollections.observableArrayList();
        ObservableList<Course> listD3E = FXCollections.observableArrayList();
        
        ObservableList<Course> listD4M = FXCollections.observableArrayList();
        ObservableList<Course> listD4A = FXCollections.observableArrayList();
        ObservableList<Course> listD4E = FXCollections.observableArrayList();
        
        ObservableList<Course> listD5M = FXCollections.observableArrayList();
        ObservableList<Course> listD5A = FXCollections.observableArrayList();
        ObservableList<Course> listD5E = FXCollections.observableArrayList();
        
        ObservableList<Course> listD6M = FXCollections.observableArrayList();
        ObservableList<Course> listD6A = FXCollections.observableArrayList();
        ObservableList<Course> listD6E = FXCollections.observableArrayList();
        
        ObservableList<Course> listD7M = FXCollections.observableArrayList();
        ObservableList<Course> listD7A = FXCollections.observableArrayList();
        ObservableList<Course> listD7E = FXCollections.observableArrayList();
        
        ObservableList<Course> listD8M = FXCollections.observableArrayList();
        ObservableList<Course> listD8A = FXCollections.observableArrayList();
        ObservableList<Course> listD8E = FXCollections.observableArrayList();
        
        Populate popDp1ND1 = new Populate("ND1");
        Populate popDp1ND2 = new Populate("ND2");
        Populate popDp1ND3 = new Populate("ND3");
        Populate popDp1HND1 = new Populate("HND1");
        Populate popDp1HND2 = new Populate("HND2");
        Populate popDp1HND3 = new Populate("HND3");
        
        Populate popDp2ND1 = new Populate("ND1");
        Populate popDp2ND2 = new Populate("ND2");
        Populate popDp2ND3 = new Populate("ND3");
        Populate popDp2HND1 = new Populate("HND1");
        Populate popDp2HND2 = new Populate("HND2");
        Populate popDp2HND3 = new Populate("HND3");
        
        Populate popDp3ND1 = new Populate("ND1");
        Populate popDp3ND2 = new Populate("ND2");
        Populate popDp3ND3 = new Populate("ND3");
        Populate popDp3HND1 = new Populate("HND1");
        Populate popDp3HND2 = new Populate("HND2");
        Populate popDp3HND3 = new Populate("HND3");
        
        Populate popSeprator = new Populate(" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ");
        
        
    public LinkClass(ArrayList<Day> dayList){
        this.dayList=dayList;
                
    }
    
    public void prepare(){
        int h = dayList.size();
        
        for (Object dayList1 : dayList) {
            Day tempDay = (Day) dayList1;
                
            if(tempDay==dayList.get(0)){
                getMorning(tempDay,"0");
                getAfternoon(tempDay,"0");
                getEvening(tempDay,"0");
            }    
            if(tempDay==dayList.get(1)){
                getMorning(tempDay,"1");
                getAfternoon(tempDay,"1");
                getEvening(tempDay,"1");
            }    
            if(tempDay==dayList.get(2)){
                getMorning(tempDay,"2");
                getAfternoon(tempDay,"2");
                getEvening(tempDay,"2");
            }    
            if(tempDay==dayList.get(3)){
                getMorning(tempDay,"3");
                getAfternoon(tempDay,"3");
                getEvening(tempDay,"3");
            }    
            if(tempDay==dayList.get(4)){
                getMorning(tempDay,"4");
                getAfternoon(tempDay,"4");
                getEvening(tempDay,"4");
            }    
            if(tempDay==dayList.get(5)){
                getMorning(tempDay,"5");
                getAfternoon(tempDay,"5");
                getEvening(tempDay,"5");
            }    
            if(tempDay==dayList.get(6)){
                getMorning(tempDay,"6");
                getAfternoon(tempDay,"6");
                getEvening(tempDay,"6");
            }    
            if(tempDay==dayList.get(7)){
                getMorning(tempDay,"7");
                getAfternoon(tempDay,"7");
                getEvening(tempDay,"7");
            }
             
        }
        list.add(popDp1ND1);
        list.add(popDp1ND2);
        list.add(popDp1ND3);
        list.add(popDp1HND1);
        list.add(popDp1HND2);
        list.add(popDp1HND3);
        list.add(popSeprator);
        list.add(popDp2ND1);
        list.add(popDp2ND2);
        list.add(popDp2ND3);
        list.add(popDp2HND1);
        list.add(popDp2HND2);
        list.add(popDp2HND3);
        list.add(popSeprator);
        list.add(popDp3ND1);
        list.add(popDp3ND2);
        list.add(popDp3ND3);
        list.add(popDp3HND1);
        list.add(popDp3HND2);
        list.add(popDp3HND3);
       
    }
    
    public void getMorning(Day tempDay, String day){
        if("0".equals(day)){
            
            popDp1ND1.setD1M(tempDay.getD1().getMorning().getNd1().getCourseCode());
            popDp1ND2.setD1M(tempDay.getD1().getMorning().getNd2().getCourseCode());
            popDp1ND3.setD1M(tempDay.getD1().getMorning().getNd3().getCourseCode());
            popDp1HND1.setD1M(tempDay.getD1().getMorning().getHnd1().getCourseCode());
            popDp1HND2.setD1M(tempDay.getD1().getMorning().getHnd2().getCourseCode());
            popDp1HND3.setD1M(tempDay.getD1().getMorning().getHnd3().getCourseCode());
            
            popDp2ND1.setD1M(tempDay.getD2().getMorning().getNd1().getCourseCode());
            popDp2ND2.setD1M(tempDay.getD2().getMorning().getNd2().getCourseCode());
            popDp2ND3.setD1M(tempDay.getD2().getMorning().getNd3().getCourseCode());
            popDp2HND1.setD1M(tempDay.getD2().getMorning().getHnd1().getCourseCode());
            popDp2HND2.setD1M(tempDay.getD2().getMorning().getHnd2().getCourseCode());
            popDp2HND3.setD1M(tempDay.getD2().getMorning().getHnd3().getCourseCode());
            
            popDp3ND1.setD1M(tempDay.getD3().getMorning().getNd1().getCourseCode());
            popDp3ND2.setD1M(tempDay.getD3().getMorning().getNd2().getCourseCode());
            popDp3ND3.setD1M(tempDay.getD3().getMorning().getNd3().getCourseCode());
            popDp3HND1.setD1M(tempDay.getD3().getMorning().getHnd1().getCourseCode());
            popDp3HND2.setD1M(tempDay.getD3().getMorning().getHnd2().getCourseCode());
            popDp3HND3.setD1M(tempDay.getD3().getMorning().getHnd3().getCourseCode());
            
            
        
        }
        if("1".equals(day)){
            popDp1ND1.setD2M(tempDay.getD1().getMorning().getNd1().getCourseCode());
            popDp1ND2.setD2M(tempDay.getD1().getMorning().getNd2().getCourseCode());
            popDp1ND3.setD2M(tempDay.getD1().getMorning().getNd3().getCourseCode());
            popDp1HND1.setD2M(tempDay.getD1().getMorning().getHnd1().getCourseCode());
            popDp1HND2.setD2M(tempDay.getD1().getMorning().getHnd2().getCourseCode());
            popDp1HND3.setD2M(tempDay.getD1().getMorning().getHnd3().getCourseCode());
            
            popDp2ND1.setD2M(tempDay.getD2().getMorning().getNd1().getCourseCode());
            popDp2ND2.setD2M(tempDay.getD2().getMorning().getNd2().getCourseCode());
            popDp2ND3.setD2M(tempDay.getD2().getMorning().getNd3().getCourseCode());
            popDp2HND1.setD2M(tempDay.getD2().getMorning().getHnd1().getCourseCode());
            popDp2HND2.setD2M(tempDay.getD2().getMorning().getHnd2().getCourseCode());
            popDp2HND3.setD2M(tempDay.getD2().getMorning().getHnd3().getCourseCode());
            
            popDp3ND1.setD2M(tempDay.getD3().getMorning().getNd1().getCourseCode());
            popDp3ND2.setD2M(tempDay.getD3().getMorning().getNd2().getCourseCode());
            popDp3ND3.setD2M(tempDay.getD3().getMorning().getNd3().getCourseCode());
            popDp3HND1.setD2M(tempDay.getD3().getMorning().getHnd1().getCourseCode());
            popDp3HND2.setD2M(tempDay.getD3().getMorning().getHnd2().getCourseCode());
            popDp3HND3.setD2M(tempDay.getD3().getMorning().getHnd3().getCourseCode());
        
        }
        if("2".equals(day)){
            popDp1ND1.setD3M(tempDay.getD1().getMorning().getNd1().getCourseCode());
            popDp1ND2.setD3M(tempDay.getD1().getMorning().getNd2().getCourseCode());
            popDp1ND3.setD3M(tempDay.getD1().getMorning().getNd3().getCourseCode());
            popDp1HND1.setD3M(tempDay.getD1().getMorning().getHnd1().getCourseCode());
            popDp1HND2.setD3M(tempDay.getD1().getMorning().getHnd2().getCourseCode());
            popDp1HND3.setD3M(tempDay.getD1().getMorning().getHnd3().getCourseCode());
            
            popDp2ND1.setD3M(tempDay.getD2().getMorning().getNd1().getCourseCode());
            popDp2ND2.setD3M(tempDay.getD2().getMorning().getNd2().getCourseCode());
            popDp2ND3.setD3M(tempDay.getD2().getMorning().getNd3().getCourseCode());
            popDp2HND1.setD3M(tempDay.getD2().getMorning().getHnd1().getCourseCode());
            popDp2HND2.setD3M(tempDay.getD2().getMorning().getHnd2().getCourseCode());
            popDp2HND3.setD3M(tempDay.getD2().getMorning().getHnd3().getCourseCode());
            
            popDp3ND1.setD3M(tempDay.getD3().getMorning().getNd1().getCourseCode());
            popDp3ND2.setD3M(tempDay.getD3().getMorning().getNd2().getCourseCode());
            popDp3ND3.setD3M(tempDay.getD3().getMorning().getNd3().getCourseCode());
            popDp3HND1.setD3M(tempDay.getD3().getMorning().getHnd1().getCourseCode());
            popDp3HND2.setD3M(tempDay.getD3().getMorning().getHnd2().getCourseCode());
            popDp3HND3.setD3M(tempDay.getD3().getMorning().getHnd3().getCourseCode());
        
        }
        if("3".equals(day)){
            popDp1ND1.setD4M(tempDay.getD1().getMorning().getNd1().getCourseCode());
            popDp1ND2.setD4M(tempDay.getD1().getMorning().getNd2().getCourseCode());
            popDp1ND3.setD4M(tempDay.getD1().getMorning().getNd3().getCourseCode());
            popDp1HND1.setD4M(tempDay.getD1().getMorning().getHnd1().getCourseCode());
            popDp1HND2.setD4M(tempDay.getD1().getMorning().getHnd2().getCourseCode());
            popDp1HND3.setD4M(tempDay.getD1().getMorning().getHnd3().getCourseCode());
            
            popDp2ND1.setD4M(tempDay.getD2().getMorning().getNd1().getCourseCode());
            popDp2ND2.setD4M(tempDay.getD2().getMorning().getNd2().getCourseCode());
            popDp2ND3.setD4M(tempDay.getD2().getMorning().getNd3().getCourseCode());
            popDp2HND1.setD4M(tempDay.getD2().getMorning().getHnd1().getCourseCode());
            popDp2HND2.setD4M(tempDay.getD2().getMorning().getHnd2().getCourseCode());
            popDp2HND3.setD4M(tempDay.getD2().getMorning().getHnd3().getCourseCode());
            
            popDp3ND1.setD4M(tempDay.getD3().getMorning().getNd1().getCourseCode());
            popDp3ND2.setD4M(tempDay.getD3().getMorning().getNd2().getCourseCode());
            popDp3ND3.setD4M(tempDay.getD3().getMorning().getNd3().getCourseCode());
            popDp3HND1.setD4M(tempDay.getD3().getMorning().getHnd1().getCourseCode());
            popDp3HND2.setD4M(tempDay.getD3().getMorning().getHnd2().getCourseCode());
            popDp3HND3.setD4M(tempDay.getD3().getMorning().getHnd3().getCourseCode());
        
        }
        if("4".equals(day)){
            popDp1ND1.setD5M(tempDay.getD1().getMorning().getNd1().getCourseCode());
            popDp1ND2.setD5M(tempDay.getD1().getMorning().getNd2().getCourseCode());
            popDp1ND3.setD5M(tempDay.getD1().getMorning().getNd3().getCourseCode());
            popDp1HND1.setD5M(tempDay.getD1().getMorning().getHnd1().getCourseCode());
            popDp1HND2.setD5M(tempDay.getD1().getMorning().getHnd2().getCourseCode());
            popDp1HND3.setD5M(tempDay.getD1().getMorning().getHnd3().getCourseCode());
            
            popDp2ND1.setD5M(tempDay.getD2().getMorning().getNd1().getCourseCode());
            popDp2ND2.setD5M(tempDay.getD2().getMorning().getNd2().getCourseCode());
            popDp2ND3.setD5M(tempDay.getD2().getMorning().getNd3().getCourseCode());
            popDp2HND1.setD5M(tempDay.getD2().getMorning().getHnd1().getCourseCode());
            popDp2HND2.setD5M(tempDay.getD2().getMorning().getHnd2().getCourseCode());
            popDp2HND3.setD5M(tempDay.getD2().getMorning().getHnd3().getCourseCode());
            
            popDp3ND1.setD5M(tempDay.getD3().getMorning().getNd1().getCourseCode());
            popDp3ND2.setD5M(tempDay.getD3().getMorning().getNd2().getCourseCode());
            popDp3ND3.setD5M(tempDay.getD3().getMorning().getNd3().getCourseCode());
            popDp3HND1.setD5M(tempDay.getD3().getMorning().getHnd1().getCourseCode());
            popDp3HND2.setD5M(tempDay.getD3().getMorning().getHnd2().getCourseCode());
            popDp3HND3.setD5M(tempDay.getD3().getMorning().getHnd3().getCourseCode());
        
        }
        if("5".equals(day)){
            popDp1ND1.setD6M(tempDay.getD1().getMorning().getNd1().getCourseCode());
            popDp1ND2.setD6M(tempDay.getD1().getMorning().getNd2().getCourseCode());
            popDp1ND3.setD6M(tempDay.getD1().getMorning().getNd3().getCourseCode());
            popDp1HND1.setD6M(tempDay.getD1().getMorning().getHnd1().getCourseCode());
            popDp1HND2.setD6M(tempDay.getD1().getMorning().getHnd2().getCourseCode());
            popDp1HND3.setD6M(tempDay.getD1().getMorning().getHnd3().getCourseCode());
            
            popDp2ND1.setD6M(tempDay.getD2().getMorning().getNd1().getCourseCode());
            popDp2ND2.setD6M(tempDay.getD2().getMorning().getNd2().getCourseCode());
            popDp2ND3.setD6M(tempDay.getD2().getMorning().getNd3().getCourseCode());
            popDp2HND1.setD6M(tempDay.getD2().getMorning().getHnd1().getCourseCode());
            popDp2HND2.setD6M(tempDay.getD2().getMorning().getHnd2().getCourseCode());
            popDp2HND3.setD6M(tempDay.getD2().getMorning().getHnd3().getCourseCode());
            
            popDp3ND1.setD6M(tempDay.getD3().getMorning().getNd1().getCourseCode());
            popDp3ND2.setD6M(tempDay.getD3().getMorning().getNd2().getCourseCode());
            popDp3ND3.setD6M(tempDay.getD3().getMorning().getNd3().getCourseCode());
            popDp3HND1.setD6M(tempDay.getD3().getMorning().getHnd1().getCourseCode());
            popDp3HND2.setD6M(tempDay.getD3().getMorning().getHnd2().getCourseCode());
            popDp3HND3.setD6M(tempDay.getD3().getMorning().getHnd3().getCourseCode());
        
        }
        if("6".equals(day)){
            popDp1ND1.setD7M(tempDay.getD1().getMorning().getNd1().getCourseCode());
            popDp1ND2.setD7M(tempDay.getD1().getMorning().getNd2().getCourseCode());
            popDp1ND3.setD7M(tempDay.getD1().getMorning().getNd3().getCourseCode());
            popDp1HND1.setD7M(tempDay.getD1().getMorning().getHnd1().getCourseCode());
            popDp1HND2.setD7M(tempDay.getD1().getMorning().getHnd2().getCourseCode());
            popDp1HND3.setD7M(tempDay.getD1().getMorning().getHnd3().getCourseCode());
            
            popDp2ND1.setD7M(tempDay.getD2().getMorning().getNd1().getCourseCode());
            popDp2ND2.setD7M(tempDay.getD2().getMorning().getNd2().getCourseCode());
            popDp2ND3.setD7M(tempDay.getD2().getMorning().getNd3().getCourseCode());
            popDp2HND1.setD7M(tempDay.getD2().getMorning().getHnd1().getCourseCode());
            popDp2HND2.setD7M(tempDay.getD2().getMorning().getHnd2().getCourseCode());
            popDp2HND3.setD7M(tempDay.getD2().getMorning().getHnd3().getCourseCode());
            
            popDp3ND1.setD7M(tempDay.getD3().getMorning().getNd1().getCourseCode());
            popDp3ND2.setD7M(tempDay.getD3().getMorning().getNd2().getCourseCode());
            popDp3ND3.setD7M(tempDay.getD3().getMorning().getNd3().getCourseCode());
            popDp3HND1.setD7M(tempDay.getD3().getMorning().getHnd1().getCourseCode());
            popDp3HND2.setD7M(tempDay.getD3().getMorning().getHnd2().getCourseCode());
            popDp3HND3.setD7M(tempDay.getD3().getMorning().getHnd3().getCourseCode());
        
        }
        if("7".equals(day)){
            popDp1ND1.setD8M(tempDay.getD1().getMorning().getNd1().getCourseCode());
            popDp1ND2.setD8M(tempDay.getD1().getMorning().getNd2().getCourseCode());
            popDp1ND3.setD8M(tempDay.getD1().getMorning().getNd3().getCourseCode());
            popDp1HND1.setD8M(tempDay.getD1().getMorning().getHnd1().getCourseCode());
            popDp1HND2.setD8M(tempDay.getD1().getMorning().getHnd2().getCourseCode());
            popDp1HND3.setD8M(tempDay.getD1().getMorning().getHnd3().getCourseCode());
            
            popDp2ND1.setD8M(tempDay.getD2().getMorning().getNd1().getCourseCode());
            popDp2ND2.setD8M(tempDay.getD2().getMorning().getNd2().getCourseCode());
            popDp2ND3.setD8M(tempDay.getD2().getMorning().getNd3().getCourseCode());
            popDp2HND1.setD8M(tempDay.getD2().getMorning().getHnd1().getCourseCode());
            popDp2HND2.setD8M(tempDay.getD2().getMorning().getHnd2().getCourseCode());
            popDp2HND3.setD8M(tempDay.getD2().getMorning().getHnd3().getCourseCode());
            
            popDp3ND1.setD8M(tempDay.getD3().getMorning().getNd1().getCourseCode());
            popDp3ND2.setD8M(tempDay.getD3().getMorning().getNd2().getCourseCode());
            popDp3ND3.setD8M(tempDay.getD3().getMorning().getNd3().getCourseCode());
            popDp3HND1.setD8M(tempDay.getD3().getMorning().getHnd1().getCourseCode());
            popDp3HND2.setD8M(tempDay.getD3().getMorning().getHnd2().getCourseCode());
            popDp3HND3.setD8M(tempDay.getD3().getMorning().getHnd3().getCourseCode());
        
        }
        
        
    }
    
    public void getAfternoon(Day tempDay, String day){
        if("0".equals(day)){
            popDp1ND1.setD1A(tempDay.getD1().getAfternoon().getNd1().getCourseCode());
            popDp1ND2.setD1A(tempDay.getD1().getAfternoon().getNd2().getCourseCode());
            popDp1ND3.setD1A(tempDay.getD1().getAfternoon().getNd3().getCourseCode());
            popDp1HND1.setD1A(tempDay.getD1().getAfternoon().getHnd1().getCourseCode());
            popDp1HND2.setD1A(tempDay.getD1().getAfternoon().getHnd2().getCourseCode());
            popDp1HND3.setD1A(tempDay.getD1().getAfternoon().getHnd3().getCourseCode());
            
            popDp2ND1.setD1A(tempDay.getD2().getAfternoon().getNd1().getCourseCode());
            popDp2ND2.setD1A(tempDay.getD2().getAfternoon().getNd2().getCourseCode());
            popDp2ND3.setD1A(tempDay.getD2().getAfternoon().getNd3().getCourseCode());
            popDp2HND1.setD1A(tempDay.getD2().getAfternoon().getHnd1().getCourseCode());
            popDp2HND2.setD1A(tempDay.getD2().getAfternoon().getHnd2().getCourseCode());
            popDp2HND3.setD1A(tempDay.getD2().getAfternoon().getHnd3().getCourseCode());
            
            popDp3ND1.setD1A(tempDay.getD3().getAfternoon().getNd1().getCourseCode());
            popDp3ND2.setD1A(tempDay.getD3().getAfternoon().getNd2().getCourseCode());
            popDp3ND3.setD1A(tempDay.getD3().getAfternoon().getNd3().getCourseCode());
            popDp3HND1.setD1A(tempDay.getD3().getAfternoon().getHnd1().getCourseCode());
            popDp3HND2.setD1A(tempDay.getD3().getAfternoon().getHnd2().getCourseCode());
            popDp3HND3.setD1A(tempDay.getD3().getAfternoon().getHnd3().getCourseCode());
            
            
        
        }
        if("1".equals(day)){
            popDp1ND1.setD2A(tempDay.getD1().getAfternoon().getNd1().getCourseCode());
            popDp1ND2.setD2A(tempDay.getD1().getAfternoon().getNd2().getCourseCode());
            popDp1ND3.setD2A(tempDay.getD1().getAfternoon().getNd3().getCourseCode());
            popDp1HND1.setD2A(tempDay.getD1().getAfternoon().getHnd1().getCourseCode());
            popDp1HND2.setD2A(tempDay.getD1().getAfternoon().getHnd2().getCourseCode());
            popDp1HND3.setD2A(tempDay.getD1().getAfternoon().getHnd3().getCourseCode());
            
            popDp2ND1.setD2A(tempDay.getD2().getAfternoon().getNd1().getCourseCode());
            popDp2ND2.setD2A(tempDay.getD2().getAfternoon().getNd2().getCourseCode());
            popDp2ND3.setD2A(tempDay.getD2().getAfternoon().getNd3().getCourseCode());
            popDp2HND1.setD2A(tempDay.getD2().getAfternoon().getHnd1().getCourseCode());
            popDp2HND2.setD2A(tempDay.getD2().getAfternoon().getHnd2().getCourseCode());
            popDp2HND3.setD2A(tempDay.getD2().getAfternoon().getHnd3().getCourseCode());
            
            popDp3ND1.setD2A(tempDay.getD3().getAfternoon().getNd1().getCourseCode());
            popDp3ND2.setD2A(tempDay.getD3().getAfternoon().getNd2().getCourseCode());
            popDp3ND3.setD2A(tempDay.getD3().getAfternoon().getNd3().getCourseCode());
            popDp3HND1.setD2A(tempDay.getD3().getAfternoon().getHnd1().getCourseCode());
            popDp3HND2.setD2A(tempDay.getD3().getAfternoon().getHnd2().getCourseCode());
            popDp3HND3.setD2A(tempDay.getD3().getAfternoon().getHnd3().getCourseCode());
        
        }
        if("2".equals(day)){
            popDp1ND1.setD3A(tempDay.getD1().getAfternoon().getNd1().getCourseCode());
            popDp1ND2.setD3A(tempDay.getD1().getAfternoon().getNd2().getCourseCode());
            popDp1ND3.setD3A(tempDay.getD1().getAfternoon().getNd3().getCourseCode());
            popDp1HND1.setD3A(tempDay.getD1().getAfternoon().getHnd1().getCourseCode());
            popDp1HND2.setD3A(tempDay.getD1().getAfternoon().getHnd2().getCourseCode());
            popDp1HND3.setD3A(tempDay.getD1().getAfternoon().getHnd3().getCourseCode());
            
            popDp2ND1.setD3A(tempDay.getD2().getAfternoon().getNd1().getCourseCode());
            popDp2ND2.setD3A(tempDay.getD2().getAfternoon().getNd2().getCourseCode());
            popDp2ND3.setD3A(tempDay.getD2().getAfternoon().getNd3().getCourseCode());
            popDp2HND1.setD3A(tempDay.getD2().getAfternoon().getHnd1().getCourseCode());
            popDp2HND2.setD3A(tempDay.getD2().getAfternoon().getHnd2().getCourseCode());
            popDp2HND3.setD3A(tempDay.getD2().getAfternoon().getHnd3().getCourseCode());
            
            popDp3ND1.setD3A(tempDay.getD3().getAfternoon().getNd1().getCourseCode());
            popDp3ND2.setD3A(tempDay.getD3().getAfternoon().getNd2().getCourseCode());
            popDp3ND3.setD3A(tempDay.getD3().getAfternoon().getNd3().getCourseCode());
            popDp3HND1.setD3A(tempDay.getD3().getAfternoon().getHnd1().getCourseCode());
            popDp3HND2.setD3A(tempDay.getD3().getAfternoon().getHnd2().getCourseCode());
            popDp3HND3.setD3A(tempDay.getD3().getAfternoon().getHnd3().getCourseCode());
        
        }
        if("3".equals(day)){
            popDp1ND1.setD4A(tempDay.getD1().getAfternoon().getNd1().getCourseCode());
            popDp1ND2.setD4A(tempDay.getD1().getAfternoon().getNd2().getCourseCode());
            popDp1ND3.setD4A(tempDay.getD1().getAfternoon().getNd3().getCourseCode());
            popDp1HND1.setD4A(tempDay.getD1().getAfternoon().getHnd1().getCourseCode());
            popDp1HND2.setD4A(tempDay.getD1().getAfternoon().getHnd2().getCourseCode());
            popDp1HND3.setD4A(tempDay.getD1().getAfternoon().getHnd3().getCourseCode());
            
            popDp2ND1.setD4A(tempDay.getD2().getAfternoon().getNd1().getCourseCode());
            popDp2ND2.setD4A(tempDay.getD2().getAfternoon().getNd2().getCourseCode());
            popDp2ND3.setD4A(tempDay.getD2().getAfternoon().getNd3().getCourseCode());
            popDp2HND1.setD4A(tempDay.getD2().getAfternoon().getHnd1().getCourseCode());
            popDp2HND2.setD4A(tempDay.getD2().getAfternoon().getHnd2().getCourseCode());
            popDp2HND3.setD4A(tempDay.getD2().getAfternoon().getHnd3().getCourseCode());
            
            popDp3ND1.setD4A(tempDay.getD3().getAfternoon().getNd1().getCourseCode());
            popDp3ND2.setD4A(tempDay.getD3().getAfternoon().getNd2().getCourseCode());
            popDp3ND3.setD4A(tempDay.getD3().getAfternoon().getNd3().getCourseCode());
            popDp3HND1.setD4A(tempDay.getD3().getAfternoon().getHnd1().getCourseCode());
            popDp3HND2.setD4A(tempDay.getD3().getAfternoon().getHnd2().getCourseCode());
            popDp3HND3.setD4A(tempDay.getD3().getAfternoon().getHnd3().getCourseCode());
        
        }
        if("4".equals(day)){
            popDp1ND1.setD5A(tempDay.getD1().getAfternoon().getNd1().getCourseCode());
            popDp1ND2.setD5A(tempDay.getD1().getAfternoon().getNd2().getCourseCode());
            popDp1ND3.setD5A(tempDay.getD1().getAfternoon().getNd3().getCourseCode());
            popDp1HND1.setD5A(tempDay.getD1().getAfternoon().getHnd1().getCourseCode());
            popDp1HND2.setD5A(tempDay.getD1().getAfternoon().getHnd2().getCourseCode());
            popDp1HND3.setD5A(tempDay.getD1().getAfternoon().getHnd3().getCourseCode());
            
            popDp2ND1.setD5A(tempDay.getD2().getAfternoon().getNd1().getCourseCode());
            popDp2ND2.setD5A(tempDay.getD2().getAfternoon().getNd2().getCourseCode());
            popDp2ND3.setD5A(tempDay.getD2().getAfternoon().getNd3().getCourseCode());
            popDp2HND1.setD5A(tempDay.getD2().getAfternoon().getHnd1().getCourseCode());
            popDp2HND2.setD5A(tempDay.getD2().getAfternoon().getHnd2().getCourseCode());
            popDp2HND3.setD5A(tempDay.getD2().getAfternoon().getHnd3().getCourseCode());
            
            popDp3ND1.setD5A(tempDay.getD3().getAfternoon().getNd1().getCourseCode());
            popDp3ND2.setD5A(tempDay.getD3().getAfternoon().getNd2().getCourseCode());
            popDp3ND3.setD5A(tempDay.getD3().getAfternoon().getNd3().getCourseCode());
            popDp3HND1.setD5A(tempDay.getD3().getAfternoon().getHnd1().getCourseCode());
            popDp3HND2.setD5A(tempDay.getD3().getAfternoon().getHnd2().getCourseCode());
            popDp3HND3.setD5A(tempDay.getD3().getAfternoon().getHnd3().getCourseCode());
        
        }
        if("5".equals(day)){
            popDp1ND1.setD6A(tempDay.getD1().getAfternoon().getNd1().getCourseCode());
            popDp1ND2.setD6A(tempDay.getD1().getAfternoon().getNd2().getCourseCode());
            popDp1ND3.setD6A(tempDay.getD1().getAfternoon().getNd3().getCourseCode());
            popDp1HND1.setD6A(tempDay.getD1().getAfternoon().getHnd1().getCourseCode());
            popDp1HND2.setD6A(tempDay.getD1().getAfternoon().getHnd2().getCourseCode());
            popDp1HND3.setD6A(tempDay.getD1().getAfternoon().getHnd3().getCourseCode());
            
            popDp2ND1.setD6A(tempDay.getD2().getAfternoon().getNd1().getCourseCode());
            popDp2ND2.setD6A(tempDay.getD2().getAfternoon().getNd2().getCourseCode());
            popDp2ND3.setD6A(tempDay.getD2().getAfternoon().getNd3().getCourseCode());
            popDp2HND1.setD6A(tempDay.getD2().getAfternoon().getHnd1().getCourseCode());
            popDp2HND2.setD6A(tempDay.getD2().getAfternoon().getHnd2().getCourseCode());
            popDp2HND3.setD6A(tempDay.getD2().getAfternoon().getHnd3().getCourseCode());
            
            popDp3ND1.setD6A(tempDay.getD3().getAfternoon().getNd1().getCourseCode());
            popDp3ND2.setD6A(tempDay.getD3().getAfternoon().getNd2().getCourseCode());
            popDp3ND3.setD6A(tempDay.getD3().getAfternoon().getNd3().getCourseCode());
            popDp3HND1.setD6A(tempDay.getD3().getAfternoon().getHnd1().getCourseCode());
            popDp3HND2.setD6A(tempDay.getD3().getAfternoon().getHnd2().getCourseCode());
            popDp3HND3.setD6A(tempDay.getD3().getAfternoon().getHnd3().getCourseCode());
        
        }
        if("6".equals(day)){
            popDp1ND1.setD7A(tempDay.getD1().getAfternoon().getNd1().getCourseCode());
            popDp1ND2.setD7A(tempDay.getD1().getAfternoon().getNd2().getCourseCode());
            popDp1ND3.setD7A(tempDay.getD1().getAfternoon().getNd3().getCourseCode());
            popDp1HND1.setD7A(tempDay.getD1().getAfternoon().getHnd1().getCourseCode());
            popDp1HND2.setD7A(tempDay.getD1().getAfternoon().getHnd2().getCourseCode());
            popDp1HND3.setD7A(tempDay.getD1().getAfternoon().getHnd3().getCourseCode());
            
            popDp2ND1.setD7A(tempDay.getD2().getAfternoon().getNd1().getCourseCode());
            popDp2ND2.setD7A(tempDay.getD2().getAfternoon().getNd2().getCourseCode());
            popDp2ND3.setD7A(tempDay.getD2().getAfternoon().getNd3().getCourseCode());
            popDp2HND1.setD7A(tempDay.getD2().getAfternoon().getHnd1().getCourseCode());
            popDp2HND2.setD7A(tempDay.getD2().getAfternoon().getHnd2().getCourseCode());
            popDp2HND3.setD7A(tempDay.getD2().getAfternoon().getHnd3().getCourseCode());
            
            popDp3ND1.setD7A(tempDay.getD3().getAfternoon().getNd1().getCourseCode());
            popDp3ND2.setD7A(tempDay.getD3().getAfternoon().getNd2().getCourseCode());
            popDp3ND3.setD7A(tempDay.getD3().getAfternoon().getNd3().getCourseCode());
            popDp3HND1.setD7A(tempDay.getD3().getAfternoon().getHnd1().getCourseCode());
            popDp3HND2.setD7A(tempDay.getD3().getAfternoon().getHnd2().getCourseCode());
            popDp3HND3.setD7A(tempDay.getD3().getAfternoon().getHnd3().getCourseCode());
        
        }
        if("7".equals(day)){
            popDp1ND1.setD8A(tempDay.getD1().getAfternoon().getNd1().getCourseCode());
            popDp1ND2.setD8A(tempDay.getD1().getAfternoon().getNd2().getCourseCode());
            popDp1ND3.setD8A(tempDay.getD1().getAfternoon().getNd3().getCourseCode());
            popDp1HND1.setD8A(tempDay.getD1().getAfternoon().getHnd1().getCourseCode());
            popDp1HND2.setD8A(tempDay.getD1().getAfternoon().getHnd2().getCourseCode());
            popDp1HND3.setD8A(tempDay.getD1().getAfternoon().getHnd3().getCourseCode());
            
            popDp2ND1.setD8A(tempDay.getD2().getAfternoon().getNd1().getCourseCode());
            popDp2ND2.setD8A(tempDay.getD2().getAfternoon().getNd2().getCourseCode());
            popDp2ND3.setD8A(tempDay.getD2().getAfternoon().getNd3().getCourseCode());
            popDp2HND1.setD8A(tempDay.getD2().getAfternoon().getHnd1().getCourseCode());
            popDp2HND2.setD8A(tempDay.getD2().getAfternoon().getHnd2().getCourseCode());
            popDp2HND3.setD8A(tempDay.getD2().getAfternoon().getHnd3().getCourseCode());
            
            popDp3ND1.setD8A(tempDay.getD3().getAfternoon().getNd1().getCourseCode());
            popDp3ND2.setD8A(tempDay.getD3().getAfternoon().getNd2().getCourseCode());
            popDp3ND3.setD8A(tempDay.getD3().getAfternoon().getNd3().getCourseCode());
            popDp3HND1.setD8A(tempDay.getD3().getAfternoon().getHnd1().getCourseCode());
            popDp3HND2.setD8A(tempDay.getD3().getAfternoon().getHnd2().getCourseCode());
            popDp3HND3.setD8A(tempDay.getD3().getAfternoon().getHnd3().getCourseCode());
        
        }
        
    }
    
    public void getEvening(Day tempDay, String day){
       if("0".equals(day)){
            popDp1ND1.setD1E(tempDay.getD1().getEvening().getNd1().getCourseCode());
            popDp1ND2.setD1E(tempDay.getD1().getEvening().getNd2().getCourseCode());
            popDp1ND3.setD1E(tempDay.getD1().getEvening().getNd3().getCourseCode());
            popDp1HND1.setD1E(tempDay.getD1().getEvening().getHnd1().getCourseCode());
            popDp1HND2.setD1E(tempDay.getD1().getEvening().getHnd2().getCourseCode());
            popDp1HND3.setD1E(tempDay.getD1().getEvening().getHnd3().getCourseCode());
            
            popDp2ND1.setD1E(tempDay.getD2().getEvening().getNd1().getCourseCode());
            popDp2ND2.setD1E(tempDay.getD2().getEvening().getNd2().getCourseCode());
            popDp2ND3.setD1E(tempDay.getD2().getEvening().getNd3().getCourseCode());
            popDp2HND1.setD1E(tempDay.getD2().getEvening().getHnd1().getCourseCode());
            popDp2HND2.setD1E(tempDay.getD2().getEvening().getHnd2().getCourseCode());
            popDp2HND3.setD1E(tempDay.getD2().getEvening().getHnd3().getCourseCode());
            
            popDp3ND1.setD1E(tempDay.getD3().getEvening().getNd1().getCourseCode());
            popDp3ND2.setD1E(tempDay.getD3().getEvening().getNd2().getCourseCode());
            popDp3ND3.setD1E(tempDay.getD3().getEvening().getNd3().getCourseCode());
            popDp3HND1.setD1E(tempDay.getD3().getEvening().getHnd1().getCourseCode());
            popDp3HND2.setD1E(tempDay.getD3().getEvening().getHnd2().getCourseCode());
            popDp3HND3.setD1E(tempDay.getD3().getEvening().getHnd3().getCourseCode());
            
            
        
        }
        if("1".equals(day)){
            popDp1ND1.setD2E(tempDay.getD1().getEvening().getNd1().getCourseCode());
            popDp1ND2.setD2E(tempDay.getD1().getEvening().getNd2().getCourseCode());
            popDp1ND3.setD2E(tempDay.getD1().getEvening().getNd3().getCourseCode());
            popDp1HND1.setD2E(tempDay.getD1().getEvening().getHnd1().getCourseCode());
            popDp1HND2.setD2E(tempDay.getD1().getEvening().getHnd2().getCourseCode());
            popDp1HND3.setD2E(tempDay.getD1().getEvening().getHnd3().getCourseCode());
            
            popDp2ND1.setD2E(tempDay.getD2().getEvening().getNd1().getCourseCode());
            popDp2ND2.setD2E(tempDay.getD2().getEvening().getNd2().getCourseCode());
            popDp2ND3.setD2E(tempDay.getD2().getEvening().getNd3().getCourseCode());
            popDp2HND1.setD2E(tempDay.getD2().getEvening().getHnd1().getCourseCode());
            popDp2HND2.setD2E(tempDay.getD2().getEvening().getHnd2().getCourseCode());
            popDp2HND3.setD2E(tempDay.getD2().getEvening().getHnd3().getCourseCode());
            
            popDp3ND1.setD2E(tempDay.getD3().getEvening().getNd1().getCourseCode());
            popDp3ND2.setD2E(tempDay.getD3().getEvening().getNd2().getCourseCode());
            popDp3ND3.setD2E(tempDay.getD3().getEvening().getNd3().getCourseCode());
            popDp3HND1.setD2E(tempDay.getD3().getEvening().getHnd1().getCourseCode());
            popDp3HND2.setD2E(tempDay.getD3().getEvening().getHnd2().getCourseCode());
            popDp3HND3.setD2E(tempDay.getD3().getEvening().getHnd3().getCourseCode());
        
        }
        if("2".equals(day)){
            popDp1ND1.setD3E(tempDay.getD1().getEvening().getNd1().getCourseCode());
            popDp1ND2.setD3E(tempDay.getD1().getEvening().getNd2().getCourseCode());
            popDp1ND3.setD3E(tempDay.getD1().getEvening().getNd3().getCourseCode());
            popDp1HND1.setD3E(tempDay.getD1().getEvening().getHnd1().getCourseCode());
            popDp1HND2.setD3E(tempDay.getD1().getEvening().getHnd2().getCourseCode());
            popDp1HND3.setD3E(tempDay.getD1().getEvening().getHnd3().getCourseCode());
            
            popDp2ND1.setD3E(tempDay.getD2().getEvening().getNd1().getCourseCode());
            popDp2ND2.setD3E(tempDay.getD2().getEvening().getNd2().getCourseCode());
            popDp2ND3.setD3E(tempDay.getD2().getEvening().getNd3().getCourseCode());
            popDp2HND1.setD3E(tempDay.getD2().getEvening().getHnd1().getCourseCode());
            popDp2HND2.setD3E(tempDay.getD2().getEvening().getHnd2().getCourseCode());
            popDp2HND3.setD3E(tempDay.getD2().getEvening().getHnd3().getCourseCode());
            
            popDp3ND1.setD3E(tempDay.getD3().getEvening().getNd1().getCourseCode());
            popDp3ND2.setD3E(tempDay.getD3().getEvening().getNd2().getCourseCode());
            popDp3ND3.setD3E(tempDay.getD3().getEvening().getNd3().getCourseCode());
            popDp3HND1.setD3E(tempDay.getD3().getEvening().getHnd1().getCourseCode());
            popDp3HND2.setD3E(tempDay.getD3().getEvening().getHnd2().getCourseCode());
            popDp3HND3.setD3E(tempDay.getD3().getEvening().getHnd3().getCourseCode());
        
        }
        if("3".equals(day)){
            popDp1ND1.setD4E(tempDay.getD1().getEvening().getNd1().getCourseCode());
            popDp1ND2.setD4E(tempDay.getD1().getEvening().getNd2().getCourseCode());
            popDp1ND3.setD4E(tempDay.getD1().getEvening().getNd3().getCourseCode());
            popDp1HND1.setD4E(tempDay.getD1().getEvening().getHnd1().getCourseCode());
            popDp1HND2.setD4E(tempDay.getD1().getEvening().getHnd2().getCourseCode());
            popDp1HND3.setD4E(tempDay.getD1().getEvening().getHnd3().getCourseCode());
            
            popDp2ND1.setD4E(tempDay.getD2().getEvening().getNd1().getCourseCode());
            popDp2ND2.setD4E(tempDay.getD2().getEvening().getNd2().getCourseCode());
            popDp2ND3.setD4E(tempDay.getD2().getEvening().getNd3().getCourseCode());
            popDp2HND1.setD4E(tempDay.getD2().getEvening().getHnd1().getCourseCode());
            popDp2HND2.setD4E(tempDay.getD2().getEvening().getHnd2().getCourseCode());
            popDp2HND3.setD4E(tempDay.getD2().getEvening().getHnd3().getCourseCode());
            
            popDp3ND1.setD4E(tempDay.getD3().getEvening().getNd1().getCourseCode());
            popDp3ND2.setD4E(tempDay.getD3().getEvening().getNd2().getCourseCode());
            popDp3ND3.setD4E(tempDay.getD3().getEvening().getNd3().getCourseCode());
            popDp3HND1.setD4E(tempDay.getD3().getEvening().getHnd1().getCourseCode());
            popDp3HND2.setD4E(tempDay.getD3().getEvening().getHnd2().getCourseCode());
            popDp3HND3.setD4E(tempDay.getD3().getEvening().getHnd3().getCourseCode());
        
        }
        if("4".equals(day)){
            popDp1ND1.setD5E(tempDay.getD1().getEvening().getNd1().getCourseCode());
            popDp1ND2.setD5E(tempDay.getD1().getEvening().getNd2().getCourseCode());
            popDp1ND3.setD5E(tempDay.getD1().getEvening().getNd3().getCourseCode());
            popDp1HND1.setD5E(tempDay.getD1().getEvening().getHnd1().getCourseCode());
            popDp1HND2.setD5E(tempDay.getD1().getEvening().getHnd2().getCourseCode());
            popDp1HND3.setD5E(tempDay.getD1().getEvening().getHnd3().getCourseCode());
            
            popDp2ND1.setD5E(tempDay.getD2().getEvening().getNd1().getCourseCode());
            popDp2ND2.setD5E(tempDay.getD2().getEvening().getNd2().getCourseCode());
            popDp2ND3.setD5E(tempDay.getD2().getEvening().getNd3().getCourseCode());
            popDp2HND1.setD5E(tempDay.getD2().getEvening().getHnd1().getCourseCode());
            popDp2HND2.setD5E(tempDay.getD2().getEvening().getHnd2().getCourseCode());
            popDp2HND3.setD5E(tempDay.getD2().getEvening().getHnd3().getCourseCode());
            
            popDp3ND1.setD5E(tempDay.getD3().getEvening().getNd1().getCourseCode());
            popDp3ND2.setD5E(tempDay.getD3().getEvening().getNd2().getCourseCode());
            popDp3ND3.setD5E(tempDay.getD3().getEvening().getNd3().getCourseCode());
            popDp3HND1.setD5E(tempDay.getD3().getEvening().getHnd1().getCourseCode());
            popDp3HND2.setD5E(tempDay.getD3().getEvening().getHnd2().getCourseCode());
            popDp3HND3.setD5E(tempDay.getD3().getEvening().getHnd3().getCourseCode());
        
        }
        if("5".equals(day)){
            popDp1ND1.setD6E(tempDay.getD1().getEvening().getNd1().getCourseCode());
            popDp1ND2.setD6E(tempDay.getD1().getEvening().getNd2().getCourseCode());
            popDp1ND3.setD6E(tempDay.getD1().getEvening().getNd3().getCourseCode());
            popDp1HND1.setD6E(tempDay.getD1().getEvening().getHnd1().getCourseCode());
            popDp1HND2.setD6E(tempDay.getD1().getEvening().getHnd2().getCourseCode());
            popDp1HND3.setD6E(tempDay.getD1().getEvening().getHnd3().getCourseCode());
            
            popDp2ND1.setD6E(tempDay.getD2().getEvening().getNd1().getCourseCode());
            popDp2ND2.setD6E(tempDay.getD2().getEvening().getNd2().getCourseCode());
            popDp2ND3.setD6E(tempDay.getD2().getEvening().getNd3().getCourseCode());
            popDp2HND1.setD6E(tempDay.getD2().getEvening().getHnd1().getCourseCode());
            popDp2HND2.setD6E(tempDay.getD2().getEvening().getHnd2().getCourseCode());
            popDp2HND3.setD6E(tempDay.getD2().getEvening().getHnd3().getCourseCode());
            
            popDp3ND1.setD6E(tempDay.getD3().getEvening().getNd1().getCourseCode());
            popDp3ND2.setD6E(tempDay.getD3().getEvening().getNd2().getCourseCode());
            popDp3ND3.setD6E(tempDay.getD3().getEvening().getNd3().getCourseCode());
            popDp3HND1.setD6E(tempDay.getD3().getEvening().getHnd1().getCourseCode());
            popDp3HND2.setD6E(tempDay.getD3().getEvening().getHnd2().getCourseCode());
            popDp3HND3.setD6E(tempDay.getD3().getEvening().getHnd3().getCourseCode());
        
        }
        if("6".equals(day)){
            popDp1ND1.setD7E(tempDay.getD1().getEvening().getNd1().getCourseCode());
            popDp1ND2.setD7E(tempDay.getD1().getEvening().getNd2().getCourseCode());
            popDp1ND3.setD7E(tempDay.getD1().getEvening().getNd3().getCourseCode());
            popDp1HND1.setD7E(tempDay.getD1().getEvening().getHnd1().getCourseCode());
            popDp1HND2.setD7E(tempDay.getD1().getEvening().getHnd2().getCourseCode());
            popDp1HND3.setD7E(tempDay.getD1().getEvening().getHnd3().getCourseCode());
            
            popDp2ND1.setD7E(tempDay.getD2().getEvening().getNd1().getCourseCode());
            popDp2ND2.setD7E(tempDay.getD2().getEvening().getNd2().getCourseCode());
            popDp2ND3.setD7E(tempDay.getD2().getEvening().getNd3().getCourseCode());
            popDp2HND1.setD7E(tempDay.getD2().getEvening().getHnd1().getCourseCode());
            popDp2HND2.setD7E(tempDay.getD2().getEvening().getHnd2().getCourseCode());
            popDp2HND3.setD7E(tempDay.getD2().getEvening().getHnd3().getCourseCode());
            
            popDp3ND1.setD7E(tempDay.getD3().getEvening().getNd1().getCourseCode());
            popDp3ND2.setD7E(tempDay.getD3().getEvening().getNd2().getCourseCode());
            popDp3ND3.setD7E(tempDay.getD3().getEvening().getNd3().getCourseCode());
            popDp3HND1.setD7E(tempDay.getD3().getEvening().getHnd1().getCourseCode());
            popDp3HND2.setD7E(tempDay.getD3().getEvening().getHnd2().getCourseCode());
            popDp3HND3.setD7E(tempDay.getD3().getEvening().getHnd3().getCourseCode());
        
        }
        if("7".equals(day)){
            popDp1ND1.setD8E(tempDay.getD1().getEvening().getNd1().getCourseCode());
            popDp1ND2.setD8E(tempDay.getD1().getEvening().getNd2().getCourseCode());
            popDp1ND3.setD8E(tempDay.getD1().getEvening().getNd3().getCourseCode());
            popDp1HND1.setD8E(tempDay.getD1().getEvening().getHnd1().getCourseCode());
            popDp1HND2.setD8E(tempDay.getD1().getEvening().getHnd2().getCourseCode());
            popDp1HND3.setD8E(tempDay.getD1().getEvening().getHnd3().getCourseCode());
            
            popDp2ND1.setD8E(tempDay.getD2().getEvening().getNd1().getCourseCode());
            popDp2ND2.setD8E(tempDay.getD2().getEvening().getNd2().getCourseCode());
            popDp2ND3.setD8E(tempDay.getD2().getEvening().getNd3().getCourseCode());
            popDp2HND1.setD8E(tempDay.getD2().getEvening().getHnd1().getCourseCode());
            popDp2HND2.setD8E(tempDay.getD2().getEvening().getHnd2().getCourseCode());
            popDp2HND3.setD8E(tempDay.getD2().getEvening().getHnd3().getCourseCode());
            
            popDp3ND1.setD8E(tempDay.getD3().getEvening().getNd1().getCourseCode());
            popDp3ND2.setD8E(tempDay.getD3().getEvening().getNd2().getCourseCode());
            popDp3ND3.setD8E(tempDay.getD3().getEvening().getNd3().getCourseCode());
            popDp3HND1.setD8E(tempDay.getD3().getEvening().getHnd1().getCourseCode());
            popDp3HND2.setD8E(tempDay.getD3().getEvening().getHnd2().getCourseCode());
            popDp3HND3.setD8E(tempDay.getD3().getEvening().getHnd3().getCourseCode());
        
        }
        
    }
    
    public ObservableList getLink(){
        prepare();
        return list;
                
    }
    
   
    
}
