import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CalcArea extends Applet{

int length,breadth,ar;
    public void init(){
    length=Integer.parseInt(getParameter("len"));
    breadth=Integer.parseInt(getParameter("br"));
    ar=length*breadth;
    }

    public void paint(Graphics g){
        g.drawString("Length: "+length,50,100);
        g.drawString("Breadth: "+breadth,50,130);
        g.drawString("Area: "+ar,50,150);
    }
}

/*<applet code="CalcArea.class" height=200 width=250>
<param name="len" value=30>
<param name="br" value=50>
</applet>
*/