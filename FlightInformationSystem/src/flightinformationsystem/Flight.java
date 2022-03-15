
package flightinformationsystem;

public class Flight {
    //creating private variables
    private String airline_name;
    private int flight_number;
    private String flight_origin;
    private  String destination_cities;
    
    
    //creating a constructor from Flight class
    Flight(String name,String start, String ends, int number)
    {
     this.airline_name=name;
     this.flight_origin=start;
     this.destination_cities=ends;
     this.flight_number=number;
     }
    //creating getter and setter methods
    public String getAirline_name()
    {
     return airline_name;
    }
    public int getFlight_number()
    {
     return flight_number;
    }

    public String getFlight_origin()
    {
      return flight_origin;
    }
    public String getDestination_cities()
    {
      return destination_cities;
    }
    public void setAirline_name(String name)
    {
    this.airline_name=name;
    }
    public void setFlight_origin(String start)
    {
    this.flight_origin=start;
    }
    public void setDestination_cities(String ends)
    {
    this.destination_cities=ends;
    }
    public void setFlight_number(int number)
    {
    this.flight_number=number; 
    }
    
  //creating toString method and return in values
     @Override
   public String toString()
   {
       return ""+this.airline_name+" "+this.flight_number+" --  From: "+this.flight_origin+", To: "+this.destination_cities+"";
 }  
}
