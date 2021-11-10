import java.applet.Applet;
import java.awt.*;

public class LifeCycle extends Applet{

int count=0;
    public void init() {
        System.out.println("Starting: " + count++);
    }

    public void start(){
        System.out.println("Starting: "+count++);
    }

    public void destroy(){
        System.out.println("DestroyingL "+count++);
    }

    public void paint(Graphics g){
        System.out.println("Painting: "+count++);
        g.drawString("LifeCycle Of A Class",100,100);
    }
}

/*<applet code="LifeCycle.class" width="500" height="500">
<param name="msg" value="Parameter Message">
</applet>*/