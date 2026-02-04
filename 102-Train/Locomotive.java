import java.awt.*;

public class Locomotive extends RailCar{
    private Color color;

    public Locomotive(int x, Graphics g, Color c){
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

        //ramp
        int[] xCors = {xCor - 25, xCor, xCor}; //TODO: add feautres of locomotive and the other cars
        int[] yCors = {475, 475, 450};
        g.fillPolygon(xCors, yCors, 3);

        //Smoke stack
        g.fillRect(Xcor + 10, 350, 20, 50);

    }
}
