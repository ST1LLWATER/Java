import java.applet.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class big3 extends Applet implements ActionListener{
    int n1=0,n2=0,n3=0;
    TextField tf1,tf2,tf3;
    Button b1;

    public void init(){
        setLayout(null);

        tf1=new TextField();
        tf1.setBounds(100,100,200,30);
        add(tf1);

        tf2=new TextField();
        tf2.setBounds(100,150,200,30);
        add(tf2);
        
        tf3=new TextField();
        tf3.setBounds(100,200,200,30);
        add(tf3);

        b1=new Button("Check");
        b1.setBounds(100,230,200,50);
        add(b1);

        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        n1=Integer.parseInt(tf1.getText());
        n2=Integer.parseInt(tf2.getText());
        n3=Integer.parseInt(tf3.getText());
        
        int big=n1;

        if(n2>n1 && n2>n3){
            big=n2;
        }
        if(n3>n1 && n3>n2){
            big=n3;
        }
        // int greatest=n1>n2?n1>n3:n1:n2>n3:n2:n3;


        System.out.println(big);
    }

}

/* <applet code="big3.class" height=430 width=400>
</applet>
*/