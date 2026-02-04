import java.awt.*;

public class Passenger extends RailCar{
    private Color color;

    public Passenger(int x, Graphics g, Color c){
        super(x, g);
        this.color = c;
    }

    @Override
    public void drawCar(){
        g.setColor(color);
        g.fillRect(xCor, 400, 150, 75);
        g.setColor(Color.BLACK);
        g.fillOval(xCor, 460, 50, 50);
        g.fillOval(xCor + 100, 460, 50, 50);

        //Window
        g.drawRect(Xcor + 25, 415, 25, 35);
        g.drawRect(Xcor + 50, 415, 25, 35);

        g.drawLine(xCor + 25, 415, xCor + 50, 450);
        g.drawLine(xCor + 50, 415, xCor + 50, 450);
        g.drawLine(xCor + 25, 450, xCor + 50, 415);
        g.drawLine(xCor + 50, 450, xCor + 50, 415);

    }
}