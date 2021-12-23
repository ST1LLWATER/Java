import java.applet.*;
import java.awt.*;

public class Test extends Applet{
    public void paint(Graphics g){
        g.drawString("Trial",50,100);
        g.setColor(Color.red);
        g.setFont(new Font("Serif",Font.PLAIN,10));
        g.drawString("Error",50,200);
    }
}

/*<applet code=Test.java height=300 width=300>
</applet>
*/