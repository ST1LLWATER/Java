import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ActionListenerExample extends JFrame implements ActionListener {
JFrame f;
JPanel p1,p2;
JButton b;
JButton b1;
JTextField tf;

    public ActionListenerExample(){
         f = new JFrame("ActionListener Example");
         p1 = new JPanel(new GridLayout(1,2));
         p2=new JPanel(new GridLayout(1,1));
        f.setSize(400,400);
        // f.setLayout();

        b=new JButton("Click Me");
        // b.setBounds(100,100,100,50);
        b1=new JButton("Click Me");
        // b1.setBounds(100,200,100,50);
        p1.add(b);
        p1.add(b1);     

        tf=new JTextField();
        // tf.setBounds(150,50,300,100);
        p2.add(tf);

        f.add(p1,BorderLayout.CENTER);
        f.add(p2,BorderLayout.NORTH);

        b.addActionListener(this);
        b1.addActionListener(this);

        f.setVisible(true);

    }

    public static void main(String[] args) {
        new ActionListenerExample();
    }

    public void actionPerformed(ActionEvent e) {
        JButton b=(JButton)e.getSource();

        if(b==b){
            JOptionPane.showMessageDialog(null,"Button 1 Clicked");
        }
        if(b==b1){
            tf.setText("Button 2 Clicked");
        }
    }
}