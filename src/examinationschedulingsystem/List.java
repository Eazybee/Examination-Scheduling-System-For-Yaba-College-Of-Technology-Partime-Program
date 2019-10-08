package examinationschedulingsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class List {
     public ObservableList<Course> getList(String kode){
         Course listDefault= new Course(" ", " "); 
         ObservableList<Course> list = FXCollections.observableArrayList(new Course("",""));

//---------------------Computer Science 1st Semester------------//
         if(kode=="CND1_1st"){
             Course list1= new Course("Intro to Computing", "COM 111");
             Course list2= new Course("Intro to Digital Electronics", "COM 112");
             Course list3= new Course("Intro to Computer Programming", "COM 113");
             Course list4= new Course("Descriptive Statistic", "STA 112");
             Course list5= new Course("Elementary Probability Theory", "STA 111");
             Course list6= new Course("Logic and Linear Algebra", "MTH 111");
             Course list7= new Course("Use of English", "GNS 101");
             Course list8= new Course("Citizenship Education", "GNS 127");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="CND2_1st"){
             Course list1= new Course("Trig. and Analytical Geometry", "MTH 112");
             Course list2= new Course("Intro to Linux Operating System", "COM 115");
             Course list3= new Course("Programming in O. O. Basic", "COM 211");
             Course list4= new Course("Computer Applications Packages", "COM 215");
             Course list5= new Course("Use of English II", "GNS 201");
         
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5);
            return list;
         }
         if(kode=="CND3_1st"){
             Course list1= new Course("PC Upgrade and Maintenance", "COM 126");
             Course list2= new Course("System Programming", "COM 212");
             Course list3= new Course("File Organization and Management", "COM 214");
             Course list4= new Course("Computer System Troubleshooting", "COM 216");
             Course list5= new Course("Management Information System", "COM 217");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5);
            return list;
         }
         if(kode=="CHND1_1st"){
             Course list1= new Course("INTR. TO COMPUTER", "COM 101");
             Course list2= new Course("INTR. TO COMPUTER Programming", "COM 102");
             Course list3= new Course("INTR. TO STATISTIC", "STA 103");
             Course list4= new Course("LANGUAGE", "GNS 101");
             Course list5= new Course("MATHEMATICS", "COM 111");
             Course list6= new Course("STATISTIC", "STA 104");
             Course list7= new Course("DIGITAL ELECTRONICS", "COM 109");
             Course list8= new Course("COSTITUTION", "GNS 112");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="CHND2_1st"){
             Course list1= new Course("INTR. TO COMPUTER", "COM 201");
             Course list2= new Course("INTR. TO COMPUTER Programming", "COM 202");
             Course list3= new Course("INTR. TO STATISTIC", "STA 203");
             Course list4= new Course("LANGUAGE", "GNS 201");
             Course list5= new Course("MATHEMATICS", "COM 211");
             Course list6= new Course("STATISTIC", "STA 204");
             Course list7= new Course("DIGITAL ELECTRONICS", "COM 209");
             Course list8= new Course("COSTITUTION", "GNS 201");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="CHND3_1st"){
             Course list1= new Course("INTR. TO COMPUTER", "COM 301");
             Course list2= new Course("INTR. TO COMPUTER Programming", "COM 302");
             Course list3= new Course("INTR. TO STATISTIC", "STA 303");
             Course list4= new Course("LANGUAGE", "GNS 301");
             Course list5= new Course("MATHEMATICS", "COM 311");
             Course list6= new Course("STATISTIC", "STA 304");
             Course list7= new Course("DIGITAL ELECTRONICS", "COM 309");
             Course list8= new Course("COSTITUTION", "GNS 301");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         
   
         
         
         
//---------------------Computer Science 2nd Semester------------//
         if(kode=="CND1_2nd"){
             Course list1= new Course("Intro to Internet", "COM 122");
             Course list2= new Course("Computer Application Packages", "COM 123");
             Course list3= new Course("Intro to System Analysis", "COM 125");
             Course list4= new Course("Programming in C", "COM 127");
             Course list5= new Course("Intro to Discrete Mathematics", "COM 128");
             Course list6= new Course("Communication in English", "GNS 102");
             Course list7= new Course("Entrepreneurship Development", "EDP 102");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7);
            return list;
         }
         if(kode=="CND2_2nd"){
             Course list1= new Course("Scientific Programming Using Java", "COM 121");
             Course list2= new Course("Data Structures & Algorithms", "COM 124");
             Course list3= new Course("Programming in O.O. Fortran", "COM 221");
             Course list4= new Course("Seminar on Computer & Society", "COM 222");
             Course list5= new Course("Web Technology", "COM 225");
             Course list6= new Course("Citizenship Education II", "GNS 128");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6);
            return list;
         }
         if(kode=="CND3_2nd"){
             Course list1= new Course("Basic Hardware Maintenance", "COM 223");
             Course list2= new Course("Computer System Troubleshooting II", "COM 226");
             Course list3= new Course("Communication in English II", "GNS 209");
             Course list4= new Course("Calculus", "MTH 229");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4);
            return list;
         }
         if(kode=="CHND1_2nd"){
             Course list1= new Course("COMNHD1 2nd 1", "COM 401");
             Course list2= new Course("COMNHD1 2nd 2", "COM 402");
             Course list3= new Course("COMNHD1 2nd 3", "STA 403");
             Course list4= new Course("COMNHD1 2nd 4", "GNS 401");
             Course list5= new Course("COMNHD1 2nd 5", "COM 411");
             Course list6= new Course("COMNHD1 2nd 6", "STA 404");
             Course list7= new Course("COMNHD1 2nd 7", "COM 409");
             Course list8= new Course("COMNHD1 2nd 8", "GNS 401");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="CHND2_2nd"){
             Course list1= new Course("COMNHD2 2nd 1", "COM 501");
             Course list2= new Course("COMNHD2 2nd 2", "COM 502");
             Course list3= new Course("COMNHD2 2nd 3", "STA 503");
             Course list4= new Course("COMNHD2 2nd 4", "GNS 501");
             Course list5= new Course("COMNHD2 2nd 5", "COM 511");
             Course list6= new Course("COMNHD2 2nd 6", "STA 504");
             Course list7= new Course("COMNHD2 2nd 7", "COM 509");
             Course list8= new Course("COMNHD2 2nd 8", "GNS 501");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="CHND3_2nd"){
             Course list1= new Course("COMNHD3 2nd 1", "COM 601");
             Course list2= new Course("COMNHD3 2nd 2", "COM 602");
             Course list3= new Course("COMNHD3 2nd 3", "STA 603");
             Course list4= new Course("COMNHD3 2nd 4", "GNS 601");
             Course list5= new Course("COMNHD3 2nd 5", "COM 611");
             Course list6= new Course("COMNHD3 2nd 6", "STA 604");
             Course list7= new Course("COMNHD3 2nd 7", "COM 609");
             Course list8= new Course("COMNHD3 2nd 8", "GNS 601");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         
         
         
         
         
         
         
         
         
         
         
         //---------------------FoodTech 1st Semester------------//
         if(kode=="FND1_1st"){
             Course list1= new Course("FTND1 1st 1", "FT 101");
             Course list2= new Course("FTND1 1st 2", "FT 102");
             Course list3= new Course("FTND1 1st 3", "FT 103");
             Course list4= new Course("FTND1 1st 4", "FT 104");
             Course list5= new Course("FTND1 1st 5", "FT 105");
             Course list6= new Course("FTND1 1st 6", "FT 106");
             Course list7= new Course("FTND1 1st 7", "FT 107");
             Course list8= new Course("FTND1 1st 8", "FT 108");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="FND2_1st"){
             Course list1= new Course("FTND2 1st 1", "FT 201");
             Course list2= new Course("FTND2 1st 2", "FT 202");
             Course list3= new Course("FTND2 1st 3", "FT 203");
             Course list4= new Course("FTND2 1st 4", "FT 204");
             Course list5= new Course("FTND2 1st 5", "FT 205");
             Course list6= new Course("FTND2 1st 6", "FT 206");
             Course list7= new Course("FTND2 1st 7", "FT 207");
             Course list8= new Course("FTND2 1st 8", "FT 208");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="FND3_1st"){
             Course list1= new Course("FTND3 1st 1", "FT 301");
             Course list2= new Course("FTND3 1st 2", "FT 302");
             Course list3= new Course("FTND3 1st 3", "FT 303");
             Course list4= new Course("FTND3 1st 4", "FT 304");
             Course list5= new Course("FTND3 1st 5", "FT 305");
             Course list6= new Course("FTND3 1st 6", "FT 306");
             Course list7= new Course("FTND3 1st 7", "FT 307");
             Course list8= new Course("FTND3 1st 8", "FT 308");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="FHND1_1st"){
             Course list1= new Course("FT-HND1 1st 1", "FT 401");
             Course list2= new Course("FT-HND1 1st 2", "FT 402");
             Course list3= new Course("FT-HND1 1st 3", "FT 403");
             Course list4= new Course("FT-HND1 1st 4", "FT 404");
             Course list5= new Course("FT-HND1 1st 5", "FT 405");
             Course list6= new Course("FT-HND1 1st 6", "FT 406");
             Course list7= new Course("FT-HND1 1st 7", "FT 407");
             Course list8= new Course("FT-HND1 1st 8", "FT 408");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="FHND2_1st"){
             Course list1= new Course("FT-HND2 1st 1", "FT 501");
             Course list2= new Course("FT-HND2 1st 2", "FT 502");
             Course list3= new Course("FT-HND2 1st 3", "FT 503");
             Course list4= new Course("FT-HND2 1st 4", "FT 504");
             Course list5= new Course("FT-HND2 1st 5", "FT 505");
             Course list6= new Course("FT-HND2 1st 6", "FT 506");
             Course list7= new Course("FT-HND2 1st 7", "FT 507");
             Course list8= new Course("FT-HND2 1st 8", "FT 508");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="FHND3_1st"){
             Course list1= new Course("FT-HND3 1st 1", "FT 601");
             Course list2= new Course("FT-HND3 1st 2", "FT 602");
             Course list3= new Course("FT-HND3 1st 3", "FT 603");
             Course list4= new Course("FT-HND3 1st 4", "FT 604");
             Course list5= new Course("FT-HND3 1st 5", "FT 605");
             Course list6= new Course("FT-HND3 1st 6", "FT 606");
             Course list7= new Course("FT-HND3 1st 7", "FT 607");
             Course list8= new Course("FT-HND3 1st 8", "FT 608");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         
         //---------------------FoodTech 2nd Semester------------//
         if(kode=="FND1_2nd"){
             Course list1= new Course("FTND1 2nd 1", "FT 701");
             Course list2= new Course("FTND1 2nd 2", "FT 702");
             Course list3= new Course("FTND1 2nd 3", "FT 703");
             Course list4= new Course("FTND1 2nd 4", "FT 704");
             Course list5= new Course("FTND1 2nd 5", "FT 705");
             Course list6= new Course("FTND1 2nd 6", "FT 706");
             Course list7= new Course("FTND1 2nd 7", "FT 707");
             Course list8= new Course("FTND1 2nd 8", "FT 708");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="FND2_2nd"){
             Course list1= new Course("FTND2 2nd 1", "FT 801");
             Course list2= new Course("FTND2 2nd 2", "FT 802");
             Course list3= new Course("FTND2 2nd 3", "FT 803");
             Course list4= new Course("FTND2 2nd 4", "FT 804");
             Course list5= new Course("FTND2 2nd 5", "FT 805");
             Course list6= new Course("FTND2 2nd 6", "FT 806");
             Course list7= new Course("FTND2 2nd 7", "FT 807");
             Course list8= new Course("FTND2 2nd 8", "FT 808");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="FND3_2nd"){
             Course list1= new Course("FTND3 2nd 1", "FT 901");
             Course list2= new Course("FTND3 2nd 2", "FT 902");
             Course list3= new Course("FTND3 2nd 3", "FT 903");
             Course list4= new Course("FTND3 2nd 4", "FT 904");
             Course list5= new Course("FTND3 2nd 5", "FT 905");
             Course list6= new Course("FTND3 2nd 6", "FT 906");
             Course list7= new Course("FTND3 2nd 7", "FT 907");
             Course list8= new Course("FTND3 2nd 8", "FT 908");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="FHND1_2nd"){
             Course list1= new Course("FT-HND1 2nd 1", "FT 111");
             Course list2= new Course("FT-HND1 2nd 2", "FT 112");
             Course list3= new Course("FT-HND1 2nd 3", "FT 113");
             Course list4= new Course("FT-HND1 2nd 4", "FT 114");
             Course list5= new Course("FT-HND1 2nd 5", "FT 115");
             Course list6= new Course("FT-HND1 2nd 6", "FT 116");
             Course list7= new Course("FT-HND1 2nd 7", "FT 117");
             Course list8= new Course("FT-HND1 2nd 8", "FT 118");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="FHND2_2nd"){
             Course list1= new Course("FT-HND2 2nd 1", "FT 121");
             Course list2= new Course("FT-HND2 2nd 2", "FT 122");
             Course list3= new Course("FT-HND2 2nd 3", "FT 123");
             Course list4= new Course("FT-HND2 2nd 4", "FT 124");
             Course list5= new Course("FT-HND2 2nd 5", "FT 125");
             Course list6= new Course("FT-HND2 2nd 6", "FT 126");
             Course list7= new Course("FT-HND2 2nd 7", "FT 127");
             Course list8= new Course("FT-HND2 2nd 8", "FT 128");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="FHND3_2nd"){
             Course list1= new Course("FT-HND3 2nd 1", "FT 131");
             Course list2= new Course("FT-HND3 2nd 2", "FT 132");
             Course list3= new Course("FT-HND3 2nd 3", "FT 133");
             Course list4= new Course("FT-HND3 2nd 4", "FT 134");
             Course list5= new Course("FT-HND3 2nd 5", "FT 135");
             Course list6= new Course("FT-HND3 2nd 6", "FT 136");
             Course list7= new Course("FT-HND3 2nd 7", "FT 137");
             Course list8= new Course("FT-HND3 2nd 8", "FT 138");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
          
         
         
         
         
         
         //---------------------Hospitality 1st Semester------------//
         if(kode=="H_ND1_1st"){
             Course list1= new Course("Intro to Hospitality Management", "HMT 111");
             Course list2= new Course("Intro to Leisure, Recreation and Tourism", "LTM 111");
             Course list3= new Course("French Language 1", "HMT 112");
             Course list4= new Course("Food and Beverage Production 1", "HMT 113");
             Course list5= new Course("Food and Beverage Service 1", "HMT 114");
             Course list6= new Course("Housekeeper Operations", "HMT 115");
             Course list7= new Course("Citizenship Education", "GNS 111");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7);
            return list;
         }
         if(kode=="H_ND2_1st"){
             Course list1= new Course("Food Costing and Control", "HMT 235");
             Course list2= new Course("Principles of Account", "ACC 121");
             Course list3= new Course("Entrepreneurship Education", "EED 216");
             Course list4= new Course("Citizenship Education II", "GNS 121");
             Course list5= new Course("Uses of English", "GNS 201");
                         
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5);
            return list;
         }
         if(kode=="H_ND3_1st"){
             Course list1= new Course("Food Production Managment", "HMT 431");
             Course list2= new Course("Hospitality Marketing 1", "HMT 432");
             Course list3= new Course("Applied Nutrition", "HMT 318");
             Course list4= new Course("Computer Application", "HMT 317");
             Course list5= new Course("Uses of English II", "GNS 301");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5);
            return list;
         }
         if(kode=="H_HND1_1st"){
             Course list1= new Course("HP-HND1 1st 1", "HP 101");
             Course list2= new Course("HP-HND1 1st 2", "HP 102");
             Course list3= new Course("HP-HND1 1st 3", "HP 103");
             Course list4= new Course("HP-HND1 1st 4", "HP 104");
             Course list5= new Course("HP-HND1 1st 5", "HP 105");
             Course list6= new Course("HP-HND1 1st 6", "HP 106");
             Course list7= new Course("HP-HND1 1st 7", "HP 107");
             Course list8= new Course("HP-HND1 1st 8", "HP 108");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="H_HND2_1st"){
             Course list1= new Course("HP-HND2 1st 1", "HP 201");
             Course list2= new Course("HP-HND2 1st 2", "HP 202");
             Course list3= new Course("HP-HND2 1st 3", "HP 203");
             Course list4= new Course("HP-HND2 1st 4", "HP 204");
             Course list5= new Course("HP-HND2 1st 5", "HP 205");
             Course list6= new Course("HP-HND2 1st 6", "HP 206");
             Course list7= new Course("HP-HND2 1st 7", "HP 207");
             Course list8= new Course("HP-HND2 1st 8", "HP 208");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="H_HND3_1st"){
             Course list1= new Course("HP-HND3 1st 1", "HP 301");
             Course list2= new Course("HP-HND3 1st 2", "HP 302");
             Course list3= new Course("HP-HND3 1st 3", "HP 303");
             Course list4= new Course("HP-HND3 1st 4", "HP 304");
             Course list5= new Course("HP-HND3 1st 5", "HP 305");
             Course list6= new Course("HP-HND3 1st 6", "HP 306");
             Course list7= new Course("HP-HND3 1st 7", "HP 307");
             Course list8= new Course("HP-HND3 1st 8", "HP 308");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         
         //---------------------Hospitality 2nd Semester------------//
         if(kode=="H_ND1_2nd"){
             Course list1= new Course("Food and Beverage Production II", "HMT 221");
             Course list2= new Course("Food and Beverage Service II", "HMT 222");
             Course list3= new Course("Acommodation Operations", "HMT 223");
             Course list4= new Course("Food Science and Nutrition", "HMT 234");
             Course list5= new Course("Hospitality Management", "HMT 236");
             Course list6= new Course("Technical English", "GNS 101");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6);
            return list;
         }
         if(kode=="H_ND2_2nd"){
             Course list1= new Course("Food and Beverages Production III", "HMT 311");
             Course list2= new Course("Food and Beverage Service III", "HMT 312");
             Course list3= new Course("Human Capital Management", "BAM 314");
             Course list4= new Course("Financial Accounting", "HMT 315");
             Course list5= new Course("Technical French", "HMT 316");
                   
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5);
            return list;
         }
         if(kode=="H_ND3_2nd"){
             Course list1= new Course("Facility Design", "HMT 433");
             Course list2= new Course("Hospitality Marketing II", "HMT 434");
             Course list3= new Course("Customer Service", "HMT 436");
             Course list4= new Course("Seminar", "HMT 444");
	     Course list5= new Course("Use of English III", "GNS 401");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5);
            return list;
         }
         if(kode=="H_HND1_2nd"){
             Course list1= new Course("HP-HND1 2nd 1", "HP 111");
             Course list2= new Course("HP-HND1 2nd 2", "HP 112");
             Course list3= new Course("HP-HND1 2nd 3", "HP 113");
             Course list4= new Course("HP-HND1 2nd 4", "HP 114");
             Course list5= new Course("HP-HND1 2nd 5", "HP 115");
             Course list6= new Course("HP-HND1 2nd 6", "HP 116");
             Course list7= new Course("HP-HND1 2nd 7", "HP 117");
             Course list8= new Course("HP-HND1 2nd 8", "HP 118");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="H_HND2_2nd"){
             Course list1= new Course("HP-HND2 2nd 1", "HP 121");
             Course list2= new Course("HP-HND2 2nd 2", "HP 122");
             Course list3= new Course("HP-HND2 2nd 3", "HP 123");
             Course list4= new Course("HP-HND2 2nd 4", "HP 124");
             Course list5= new Course("HP-HND2 2nd 5", "HP 125");
             Course list6= new Course("HP-HND2 2nd 6", "HP 126");
             Course list7= new Course("HP-HND2 2nd 7", "HP 127");
             Course list8= new Course("HP-HND2 2nd 8", "HP 128");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         if(kode=="H_HND3_2nd"){
             Course list1= new Course("HP-HND3 2nd 1", "HP 131");
             Course list2= new Course("HP-HND3 2nd 2", "HP 132");
             Course list3= new Course("HP-HND3 2nd 3", "HP 133");
             Course list4= new Course("HP-HND3 2nd 4", "HP 134");
             Course list5= new Course("HP-HND3 2nd 5", "HP 135");
             Course list6= new Course("HP-HND3 2nd 6", "HP 136");
             Course list7= new Course("HP-HND3 2nd 7", "HP 137");
             Course list8= new Course("HP-HND3 2nd 8", "HP 138");
             
             list  = FXCollections.observableArrayList(listDefault,list1,list2,list3,list4,list5,list6,list7,list8);
            return list;
         }
         
         return list;
     }
}
