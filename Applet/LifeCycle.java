import java.applet.Applet;
import java.awt.*;

public class LifeCycle extends Applet{

int count=1;
    public void init() {
        System.out.println("Initializing: " + count++);
    }

    public void start(){
        System.out.println("Starting: "+count++);
    }

    public void stop(){
        System.out.println("Stopping: "+count++);
    }

    public void destroy(){
        System.out.println("Destroying: "+count++);
    }

    public void paint(Graphics g){
        System.out.println("Painting: "+count++);
        g.drawString("LifeCycle Of A Class",100,100);
    }
}

/*<applet code="LifeCycle.class" width="300" height="200">
<param name="msg" value="Parameter Message">
</applet>*/