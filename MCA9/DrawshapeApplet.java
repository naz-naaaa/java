import java.applet.*;
import java.awt.*;
public class DrawshapeApplet extends Applet
{
  public void init()
  {
 
  }
  public void paint(Graphics g)
  {
     g.setColor(Color.blue);  	
     g.drawOval(50,50,100,100);
     g.setColor(Color.green);
     g.drawRect(200,50,100,60);
     g.setColor(Color.red);
     g.drawLine(50,200,300,200);
  }
	
}
