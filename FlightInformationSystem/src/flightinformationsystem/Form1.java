
package flightinformationsystem;
import javax.swing.*;
import java.awt.event.*;

public class Form1 extends JPanel implements ActionListener {
    //creating private variebles
    private JLabel Flight_number,AirlineName,Flight_origin_and_destination;
    private JButton jb;
    private JTextArea output1,output2,output3;
    private Flight[] f; 
    
   public Form1(Flight[] f)
    {
    //getting flight object array
     this.f=f;
     setLayout(null);//setting an absolute layout
    
     //Displaying values on JButton and 
    // assigning it to the jb variable
    jb=new JButton("Display Flights");
    //setting bounds of the JButton
    jb.setBounds(0, 20, 200, 35);
    
    //Displaying values on JLabel and
    //assigning it to the Flight_number variable
    Flight_number= new JLabel("Flight Number");
    //setting bounds of the JLabel
    Flight_number.setBounds(10, 75, 160, 35);
    
    //Displaying values on JLabel and
    //assigning it to the AirlineName variable
    AirlineName= new JLabel("Airline Name");
     //setting bounds of the JLabel
    AirlineName.setBounds(160, 75, 160, 35);
    
    //Displaying values on JLabel and
    Flight_origin_and_destination = new JLabel("Flight Origin and Destination");
   //setting bounds of the JLabel
    Flight_origin_and_destination.setBounds(310, 75, 340, 35);
    
    //Assigning output1 to the TextArea
    output1=new JTextArea("", 10,12);
    //setting bounds
    output1.setBounds(10, 110,100, 150);
    
    //Assigning output2 to the TextArea
    output2=new JTextArea("", 10,12);
    //setting bounds
    output2.setBounds(160, 110,100, 150);
    
    //Assigning output3 to the TextArea
    output3=new JTextArea("", 10,12);
    //Assigning output1 to the TextArea
    output3.setBounds(310, 110,180, 150);
    
    //Adding the created components to the GUI
    add(jb);
    add(AirlineName);
    add(Flight_number); 
    add(Flight_origin_and_destination);
    add(output1);
    add(output2);
    add(output3);
    
    //setting editable value to false
    output1.setEditable(false);
    output2.setEditable(false);
    output3.setEditable(false); 
    jb.addActionListener(this);  
   }
   
    //getting the output for the screen
    @Override
    public void actionPerformed(ActionEvent ae) {
        output1.setText("");
        output2.setText("");
        output3.setText("");
     for(int s=0;s<3;s++)
       {
         output1.setText(output1.getText()+f[s].getFlight_number()+"\n");
         output2.setText(output2.getText()+f[s].getAirline_name()+"\n");
         output3.setText(output3.getText()+f[s].getFlight_origin()+" To "+f[s].getDestination_cities()+"\n");
       }
    } 
}
