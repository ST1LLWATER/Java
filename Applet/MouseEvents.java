import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="MouseEvents.class" width=300 height=300>
</applet>
*/
public class MouseEvents extends Applet implements MouseListener{
String str="";
int mouseX=100;
int mouseY=100;
public void init(){
addMouseListener(this);
}
public void mouseClicked(MouseEvent me){
str="Mouse Clicked.";
repaint();
}
public void mouseEntered(MouseEvent me){
str="Mouse Entered.";
repaint();
}
public void mouseReleased(MouseEvent me){
str="Mouse Released.";
repaint();
}
public void mousePressed(MouseEvent me){
str="Mouse Pressed.";
repaint();
}
public void mouseExited(MouseEvent me){
str="Mouse Exited.";
repaint();
}
public void paint(Graphics g){
g.drawString(str,mouseY,mouseY);
}
}