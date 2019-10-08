
package examinationschedulingsystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.util.Callback;
import javafx.util.StringConverter;


public class Date_ extends DatePicker{
    final private  String pattern="dd/MM/yyyy";
    
    
    
    private Callback<DatePicker,DateCell> MygetDayCellFactory() {

        final Callback<DatePicker, DateCell> dayCellFactory = new Callback<DatePicker, DateCell>() {

            @Override
            public DateCell call(DatePicker param) {
                return new DateCell(){
                
                    @Override
                    public void updateItem(LocalDate item, boolean empty){
                        super.updateItem(item, empty);
                        
                        //Disable Monday to friday
                        if(DayOfWeek.MONDAY.equals(item.getDayOfWeek())
                                || DayOfWeek.TUESDAY.equals(item.getDayOfWeek())
                                || DayOfWeek.WEDNESDAY.equals(item.getDayOfWeek())
                                || DayOfWeek.THURSDAY.equals(item.getDayOfWeek())
                                || DayOfWeek.FRIDAY.equals(item.getDayOfWeek())){
                            setDisable(true);
                            setStyle("-fx-background-color:#ffc0cb;");
                        }
                    }
                };
            }

        }; 
        
        return dayCellFactory;
    }
    
    public Date_(){
        
        StringConverter<LocalDate> sC = new StringConverter<LocalDate>(){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
            
            @Override
            public String toString(LocalDate date) {
                if(date != null){
                    //retrieve format
                    return dtf.format(date);
                }else{
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if(string !=null && !string.isEmpty()){
                    return LocalDate.parse(string, dtf);
                }else{
                    return null;
                }
            }
              
        };
        this.setDayCellFactory(MygetDayCellFactory());
        this.setConverter(sC);
        this.setPromptText("Date: "+pattern.toUpperCase());
        
    }
    
    public String getDate(){
        try{
        return this.getValue().format(DateTimeFormatter.ofPattern(pattern)).trim();
        } catch (Exception e) {
            return "";
        }
    }
    
   
}
