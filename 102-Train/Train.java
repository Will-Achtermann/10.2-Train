import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Train{
    private int xCor;
    private Graphics g;
    private ArrayList<RailCar> trains;

    public Train(int x, Graphics g){
        xCor = x;
        this.g = g;
        trains = new ArrayList<RailCar>();
    }

    public void addCar(String carName, Color color, int position){
        RailCar car = new RailCar(xCor, g);
        car.drawCar(); //TODO: add cars to the array list, and then draw them
        if (carName.equals("Locomotive")){
            Locomotive l = new Locomotive(xCor, g, color.BLUE);
            trains.add(position, l);
        }else if (carName.equals("Freight")){
            Freight f = new Freight(xCor, g, color.GREEN);
            trains.add(position, f);
        }else if (carName.equals("Passenger")){
            Passenger p = new Passenger(xCor, g, color.GRAY);
            trains.add(position, p);
        }else if (carName.equals("Caboose")){
            Caboos c = new Caboos(xCor, g, color.RED);
            trains.add(position, c);
        }
    }

    public void showCars(){
        for (int i = 0; i < trains.size(); i++){
            trains.get(i).setxCor(i * 150 + xCor); // ADD GETTERS AND SETTER IDIOT
            trains.get(i).drawCar();
        }
    }
}