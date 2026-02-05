import java.awt.*;

public class Caboos extends RailCar{
    private Color color;

    public Caboos(int x, Graphics g, Color c){
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

        //Window
        g.setColor(Color.WHITE);
        g.fillRect(xCor + 20, 425, 20, 20);
        g.fillRect(xCor + 60, 425, 20, 20);

        //Top bit
        g.setColor(color);
        g.fillRect(xCor + 20, 370, 60, 30);
        g.setColor(color.BLACK);
        g.fillRect(xCor+15, 360, 70, 10);


    }
}