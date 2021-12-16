import java.applet.*;
import java.awt.*;

public class WelcomeApplet extends Applet{

    public void init(){
        setBackground(Color.black);
        setForeground(Color.white);
    }
    public void paint(Graphics g){
        g.setColor(getForeground());
        String str="Welcome To Java Applets";
        String str1="Nice";
        g.setFont(new Font("Times New Roman",Font.BOLD,30));
        Dimension d=getSize();
        FontMetrics fm=g.getFontMetrics();
        int x=d.width/2-fm.stringWidth(str)/2;
        int x1=d.width/2-fm.stringWidth(str1)/2;
        int y=d.height/2-fm.getHeight()/2;
        g.drawString(str,x,y);
        g.drawString(str1,x1,y+fm.getHeight());
    }
}

/*<applet code="WelcomeApplet.class" height=500 width=500>
</applet>
*/