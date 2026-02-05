import java.awt.*;
import javax.swing.*;


public class Display extends JPanel{
	public Display(){}
	// paintCommponent is not explicitly called. It is executed whenever the JPanel is called.
	// Graphics g object is implicitly passed to function.
	public void paintComponent(Graphics g){
		super.paintComponent(g); //satisfies the parent class' requirements.
		setBackground(Color.WHITE);
		Train train = new Train(150, g);
		train.addCar("Locomotive",Color.blue); 
		train.addCar("Passenger",Color.gray);
		train.addCar("Passenger",Color.gray); 
		train.addCar("Freight",Color.green); 
		train.addCar(3,"Passenger",Color.gray); 
		train.addCar("Freight",Color.green); 
		train.addCar("Caboose",Color.red); 
		train.addCar(6,"Freight",Color.green); 
		train.showCars(); 

	}
}