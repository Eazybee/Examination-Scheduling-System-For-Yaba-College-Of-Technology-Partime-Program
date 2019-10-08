
package examinationschedulingsystem;


public class Course {
   
    
    private String course;
    private String courseCode;
    
    public Course(){}
    public Course(String course, String courseCode){
        this.course=course;
        this.courseCode=courseCode;
    }
    
    public void setCourse(String course){
        this.course=course;
    }
    public String getCourse(){
        return course;
    }
    public void setCourseCode(String courseCode){
        this.courseCode=courseCode;
    }
    public String getCourseCode(){
        return courseCode;
    }
    public String getTCourseCode(){
        String[] de = courseCode.split(" ");
        
        if(de.length>1){
             courseCode =de[0]+"\n"+de[1];
        }
        return courseCode;
    }
    
    @Override
    public String toString(){
        return this.course;
    }
    
}
