import javax.swing.*;
import java.awt.event.*; 

public class ButtonExample {
    public static void main(String[] args) {
     JFrame f=new JFrame("FRAME");
    f.setSize(500,500);
    f.setLayout(null);
     JTextField tf=new JTextField();
     tf.setBounds(150,50,300,30);
     JButton b=new JButton("Click Me!");
     b.setBounds(150,100,100,30);
     b.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            tf.setText("Button Was Clicked Lmao Ded");
         }
     });
    f.add(b);
    f.add(tf);
    f.setVisible(true);
    
//     JFrame f=new JFrame("Button Example");  
//     final JTextField tf=new JTextField();  
//     tf.setBounds(50,50, 150,20);  
//     JButton b=new JButton("Click Here");  
//     b.setBounds(50,100,95,30);  
//     b.addActionListener(new ActionListener(){  
// public void actionPerformed(ActionEvent e){  
//             tf.setText("Welcome to Javatpoint.");  
//         }  
//     });  
//     f.add(b);f.add(tf);  
//     f.setSize(400,400);  
//     f.setLayout(null);  
//     f.setVisible(true);   
}
}