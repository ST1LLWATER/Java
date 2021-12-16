import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
<applet code="MouseDraw.class" width=300 height=300>
</applet>
*/

public class MouseDraw extends Applet implements MouseMotionListener
{
int x1,y1,x2,y2;

public void init()
{
addMouseMotionListener(this);
// addMouseListener(this);
addMouseListener(new MouseAdapter()
{
public void mousePressed(MouseEvent me)
{
System.out.println("Pressed");
x1=me.getX();
y1=me.getY();
}
});
}

// addMouseListener(new MouseAdapter()
// {
// public void mousePressed(MouseEvent me)
// {
// System.out.println("Pressed");
// x1=me.getX();
// y1=me.getY();
// }
// })
// public void mouseReleased(MouseEvent me)
// {
// // System.out.println("Drageed");
// // System.out.println(x1 +" "+ y1);
// // x2=me.getX();
// // y2=me.getY();
// // System.out.println(x2 +" "+ y2);
// // repaint();
// // // x1=x2;
// // // y1=y2;
// // System.out.println(x1 +" "+ y1);
// }
// public void mouseExited(MouseEvent me)
// {

// }
// public void mouseEntered(MouseEvent me)
// {

// }
// public void mouseClicked(MouseEvent me)
// {

// }
// });
// addMouseMotionListener(new MouseMotionAdapter()
// {
public void mouseMoved(MouseEvent me){}

public void mouseDragged(MouseEvent me)
{
// System.out.println("Drageed");
// x1=me.getX();
// y1=me.getY();
x2=me.getX();
y2=me.getY();
Graphics g=getGraphics();
g.drawLine(x1,y1,x2,y2);
x1=x2;
y1=y2;
}
// });

// public void paint(Graphics g){
// g.drawLine(x1,y1,x2,y2);
// }

// setVisible(true);
// setSize(800,800);
// setTitle("Draw Line");

}