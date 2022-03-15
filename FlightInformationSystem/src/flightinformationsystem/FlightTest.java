
package flightinformationsystem;

    /*
    Name:P.S.S.Mendis
    StudentID: 4662597
    Degree: Bachelor of Information Technology
    Unit Code:NIT2112(Object oriented programming)
    */

    import java.awt.event.*;
    import javax.swing.*;

    public class FlightTest {
    
    public static void main(String[] args)
    {
    //calling data in main1 method through sortFlight
      Flight f[]= sortFlight(main1());
   //printing the sorted data
      System.out.println("This flight information is sorted based on Flight Number");
       for(int i=0;i<3;i++)
        {
           System.out.println(f[i]);
        }
       
      //creating an object from Form1 class
       Form1 form=new Form1(f);
       JFrame jf=new JFrame("Flight Information System");
       //setting JFrame properties
       jf.add(form);
       jf.setSize(540,380);
       jf.setVisible(true);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
    }
      
    //creating main1() method 
    public static Flight[] main1()
    {//creating objects and passing values
      Flight f1=new Flight("Delta","Philadalphia","London",347);
      Flight f2=new Flight("US Air","Boston","Los Angeles",212);
      Flight f3=new Flight("Continental","Atlanta","Chicago",822);
    
    //creating the object array called flights
     Flight[] flights=new Flight[3];
    //assigning values
    flights[0]= f1;
    flights[1]= f2;
    flights[2]= f3;
    //returning flights object
    return flights;
    }
    
    
    //creating sortFlight method 
    public static Flight[] sortFlight(Flight[] flightList) 
  {//varieble declaring to sort the fields 
   String name;
   String start;
   String destination;
   
for(int i=0; i<3 ;i++){
for (int j=0; j<3; j++){
    
int myFlightNum1 = flightList[i].getFlight_number();
int myFlightNum2 = flightList[j].getFlight_number();
if(myFlightNum1<myFlightNum2) 
{
int temp/*347*/ = flightList[i].getFlight_number();
flightList[i].setFlight_number(myFlightNum2);
flightList[j].setFlight_number(temp);//sorting to get the ascending order of the flight_number

name = flightList[i].getAirline_name();
flightList[i].setAirline_name(flightList[j].getAirline_name());
flightList[j].setAirline_name(name);//Sorting Airline_name

start = flightList[i].getFlight_origin();
flightList[i].setFlight_origin(flightList[j].getFlight_origin());
flightList[j].setFlight_origin(start);//sorting the flight_origin place

destination = flightList[i].getDestination_cities();
flightList[i].setDestination_cities(flightList[j].getDestination_cities());
flightList[j].setDestination_cities(destination);//sorting the flight_destination 

}
}
}
//returning the flightList data
return (flightList);
}
}



