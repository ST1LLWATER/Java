import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame implements ActionListener
{
Button b[]=new Button[10];
Button badd,bsub,bdiv,bmul,bclear,bdot,bequal;
TextField t1;
Panel p1,p2,p3;
int i;
double num1,num2,ans;
char op;
Calculator()
{
for(i=0;i<10;i++)
{
b[i]=new Button(Integer.toString(i));
}
t1=new TextField(10);
badd=new Button("+");
bsub=new Button("-");
bdiv=new Button("/");
bmul=new Button("*");
bequal=new Button("=");
bdot=new Button(".");
bclear=new Button("AC");
t1.setText("0");
p3=new Panel();
p2=new Panel();
p2.add(t1);
p1=new Panel(new GridLayout(5,4));
p1.add(b[7]);
p1.add(b[8]);
p1.add(b[9]);
p1.add(bdiv);
p1.add(b[4]);
p1.add(b[5]);
p1.add(b[6]);
p1.add(bmul);
p1.add(b[1]);
p1.add(b[2]);
p1.add(b[3]);
p1.add(badd);
p1.add(b[0]);
p1.add(bdot);
p1.add(bequal);
p1.add(bsub);
p3.add(p2,BorderLayout.NORTH);
p3.add(p1,BorderLayout.CENTER);
add(p3);
for(i=0;i<10;i++)
{
b[i].addActionListener(this);
}
badd.addActionListener(this);
bsub.addActionListener(this);
bmul.addActionListener(this);
bdiv.addActionListener(this);
bequal.addActionListener(this);
bdot.addActionListener(this);
setVisible(true);
setSize(130,175);
setTitle("Calculator");
}
public void actionPerformed(ActionEvent ae)
{
Button b1=(Button)ae.getSource();
for(i=0;i<10;i++)
{
if(b[i]==b1)
{
t1.setText(t1.getText()+Integer.toString(i));
}
}
if(badd==b1)
{
num1=Double.parseDouble(t1.getText());
t1.setText("");
op='+';
}
if(bsub==b1)
{
num1=Double.parseDouble(t1.getText());
t1.setText("");
op='-';
}
if(bmul==b1)
{
num1=Double.parseDouble(t1.getText());
t1.setText("");
op='*';
}
if(bdiv==b1)
{
num1=Double.parseDouble(t1.getText());
t1.setText("");
op='/';
}
if(bequal==b1)
{
num2=Double.parseDouble(t1.getText());
switch(op)
{
case '+':
ans=num1+num2;
break;
case '-':
ans=num1-num2;
break;
case '*':
ans=num1*num2;
break;
case '/':
ans=num1/num2;
break;
}
t1.setText(Double.toString(ans));
}
if(bdot==b1)
{
t1.setText(t1.getText()+".");
}
}
public static void main(String args[]) throws Exception
{
new Calculator();
}
}
