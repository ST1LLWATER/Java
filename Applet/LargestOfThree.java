import java.applet.*;
import java.awt.event.*;
import java.util.Scanner;
import java.awt.*;

public class LargestOfThree extends Applet implements ActionListener{
    int no1=0;
    int no2=0;
    int no3=0;

    TextField tf1,tf2,tf3;
    Button b1;
    
    public void init(){
        setLayout(null);
        tf1=new TextField();
        tf1.setBounds(30,40,200,20);
        add(tf1);
        tf2=new TextField();
        tf2.setBounds(30,80,200,20);
        add(tf2);
        tf3=new TextField();
        tf3.setBounds(30,120,200,20);
        add(tf3);
        b1=new Button("Check");
        b1.setBounds(30,150,60,50);
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
no1 = Integer.parseInt(tf1.getText());
no2 = Integer.parseInt(tf2.getText());
no3 = Integer.parseInt(tf3.getText());
if(no1>=no2 && no1>=no3)
{ System.out.println(no1 + " is the largest number.");
}
else if(no2>=no1 && no2>=no3)
System.out.println(no2 + " is the largest number.");
else
System.out.println(no3 + " is the largest number.");
}

}

/*
<applet code="LargestOfThree" width=500 height=500>
</applet>
*/