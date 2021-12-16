import java.applet.*;
import java.awt.*;

public class StarLoop extends Applet{
    int height=50;
    int width=50;
    public void paint(Graphics g){
        g.setFont(new Font("Times New Roman",Font.BOLD,30));
        FontMetrics fm=g.getFontMetrics();
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                width+=fm.stringWidth("*   ");
                if(i%2==0){
                    g.drawString("*",width,height);
                }else{
                      g.drawString("   *",width,height);
                }
            }
            width=50;
            height+=fm.getHeight();
        }
    }
}

/*<applet code="StarLoop.class" height=500 width=600>
</applet>
*/