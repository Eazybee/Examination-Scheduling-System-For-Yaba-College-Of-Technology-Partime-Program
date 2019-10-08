
package examinationschedulingsystem;


public class Time_ {
    private String time;
    private Course nd1;
    private Course nd2;
    private Course nd3;
    private Course hnd1;
    private Course hnd2;
    private Course hnd3;
    
    public Time_(){
    
    }
    public Time_(Course nd1,Course nd2,Course nd3,Course hnd1,Course hnd2,Course hnd3){
        this.nd1=nd1;
        this.nd2=nd2;
        this.nd3=nd3;
        this.hnd1=hnd1;
        this.hnd2=hnd2;
        this.hnd3=hnd3;
    }
    
    public void setTime(String time){
        this.time=time;
    }
    
    public String getTime(){
        return time;
    }
    
    public void setNd1(Course nd1){
        this.nd1=nd1;
    }
    
    public Course getNd1(){
        return nd1;
    }
    
   
    
    
    //ND2
    public void setNd2(Course nd2){
        this.nd2=nd2;
        
    }
    
    public Course getNd2(){
        return nd2;
    }
    
    
    
    
    //ND3
    public void setNd3(Course nd3){
        this.nd3=nd3;
    }
    
    public Course getNd3(){
        return nd3;
    }
    
    
    
    //-------------HND-----------------
    //HND1
    public void setHnd1(Course hnd1){
        this.hnd1=hnd1;
    }
    
    public Course getHnd1(){
        return hnd1;
    }
    
    
    
    
    //HND2
    public void setHnd2(Course hnd2){
        this.hnd2=hnd2;
    }
    
    public Course getHnd2(){
        return hnd2;
    }
    
    
    
    
    //HND3
    public void setHnd3(Course hnd3){
        this.hnd3=hnd3;
    }
    
    public Course getHnd3(){
        return hnd3;
    }
    
   
}
