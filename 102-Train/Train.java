import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Train{
    private int xCor;
    private Graphics g;

    public Train(int x, Graphics g){
        xCor = x;
        this.g = g;
        ArrayList<RailCar> trains = new ArrayList<RailCar>();
    }

    public void addCar(String carName, Color color){
        RailCar car = new RailCar(xCor, g);
        car.drawCar(); //TODO: add cars to the array list, and then draw them
        if (carName.equals("Locomotive")){
            //Add a locomotive
        }else if (carName.equals("Freight")){
            //add a freight car
        }else if (carName.equals("Passenger")){
            //add a passenger car
        }else if (carName.equals("Caboose")){
            //add a caboos
        }
    }
}