import java.awt.*;              

public class RailCar{
    protected int xCor;
    protected Graphics g;

    public RailCar(int x, Graphics g){
        this.xCor = x;
        this.g = g;
    }

    protected void drawCar(){
        g.setColor(Color.YELLOW);
        g.fillRect(xCor, 400, 150, 75);
        g.setColor(Color.BLACK);
        g.fillOval(xCor, 460, 50, 50);
        g.fillOval(xCor + 100, 460, 50, 50);
    }
}