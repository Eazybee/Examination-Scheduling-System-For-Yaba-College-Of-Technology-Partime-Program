
package examinationschedulingsystem;

import java.time.LocalDate;
import java.time.Month;


public class Day {
    private String day;
    private String date;
    private Department d1;
    private Department d2;
    private Department d3;
    
    public Day(){}
    
    public Day(String day, String date, Department d1, Department d2, Department d3){
        this.day=day;
        this.date=date;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
    }
    
    public void setDate(String date){
        this.date=date;
    }
    
    public String getDate(){
        return date;
    }
    public LocalDate getDayDate(){
        if(date.isEmpty()){
            return null;
        }
        int yr, mt, dy;
        String[] d = date.split("/");
        
        dy=Integer.parseInt(d[0]);
        mt=Integer.parseInt(d[1]);
        yr = Integer.parseInt(d[2]);
        
        return LocalDate.of(yr, mt, dy);
    }
    public void setDay(String day){
        this.day=day;
    }
    
    public String getDay(){
        return day;
    }
    
    public void setD1(Department d1){
        this.d1=d1;
    }
    
    public Department getD1(){
        return d1;
    }
    
    public void setD2(Department d2){
        this.d2=d2;
    }
    
    public Department getD2(){
        return d2;
    }
    
    public void setD3(Department d3){
        this.d3=d3;
    }
    
    public Department getD3(){
        return d3;
    }
    
}
