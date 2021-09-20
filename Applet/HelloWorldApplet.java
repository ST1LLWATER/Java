import java.applet.Applet;
import java.awt.*;

public class HelloWorldApplet extends Applet {
    public void paint(Graphics g) {
      String str=getParameter("msg");
      g.drawString(str, 250, 100);
    }
}

/*<applet code="HelloWorldApplet.class" width="500" height="500">
<param name="msg" value="Parameter Message">  
</applet>*/