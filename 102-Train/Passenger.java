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
        g.fillRect(xCor-40, 440, 40, 10);

        //Windows
        g.setColor(Color.WHITE);
        g.fillRect(xCor + 10, 425, 20, 20);
        g.fillRect(xCor + 40, 425, 20, 20);
        g.fillRect(xCor + 70, 425, 20, 20);
        g.fillRect(xCor + 100, 425, 20, 20);

        //Roof
        g.setColor(color);
        int[] xCors = {xCor - 7, xCor, xCor};
        int[] yCors = {400, 400, 407};
        g.fillPolygon(xCors, yCors, 3);

        int[] xCors2 = {xCor + 100, xCor + 100, xCor + 107};
        int[] yCors2 = {400, 407, 400};
        g.fillPolygon(xCors2, yCors2, 3);

    }
}