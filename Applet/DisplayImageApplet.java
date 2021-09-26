import java.applet.*;
import java.awt.Graphics;
import java.awt.Image;

public class DisplayImageApplet extends Applet {
      
      Image picture;  
      
      public void init() {  
        picture = getImage(getDocumentBase(),"./Assets/rengoku.jpg");  
      }  
        
      public void paint(Graphics g) {  
        g.drawImage(picture, 30,30, this);  
      }  
          
      }  

/*<applet code="DisplayImageApplet.class" width="910" height="600">
</applet>*/