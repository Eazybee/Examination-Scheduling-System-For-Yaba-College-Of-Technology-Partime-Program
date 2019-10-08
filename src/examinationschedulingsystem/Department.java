
package examinationschedulingsystem;


public class Department {
    
    private Time_ morning;
    private Time_ afternoon;
    private Time_ evening;
    
    public Department(){}
    public Department(Time_ morning, Time_ afternoon, Time_ evening){
        this.morning=morning;
        this.afternoon=afternoon;
        this.evening=evening;
    }
    
    public void setMorning(Time_ morning){
        this.morning = morning;
    }
    
    public Time_ getMorning(){
        return morning;
    }
    
    public void setAfternoon(Time_ afternoon){
        this.afternoon = afternoon;
    }
    
    public Time_ getAfternoon(){
        return afternoon;
    }
    
    public void setEvening(Time_ evening){
        this.evening = evening;
    }
    
    public Time_ getEvening(){
        return evening;
    }
}
