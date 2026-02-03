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

        //Locomotive features
        int[] xCors = {xCor - }; //TODO: add feautres of locomotive and the other cars
        g.fillPolygon([1, 3, 5], [1, 3, 5], 3);

    }
}
