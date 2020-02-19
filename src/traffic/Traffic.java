package traffic;

import java.awt.*;
import java.awt.event.*;
class A  extends Frame implements ItemListener
{
Label l1 = new Label();
Label l2 = new Label("Select Lights");
CheckboxGroup cbg= new CheckboxGroup();
Panel p1=new Panel(new GridLayout(1,1));
  Panel p2=new Panel(new FlowLayout());
  Font f = new Font("Verdana", Font.BOLD, 40);
public A()
{
setLayout(new GridLayout(2,1));
setSize(800, 400);
p1.add(l1); 
p2.add(l2);
 

l1.setFont(f); 
l1.setAlignment(Label.CENTER);

Checkbox r1 = new Checkbox("Red Light", cbg, false);
r1.setBackground(Color.red);
p2.add(r1);
r1.addItemListener(this);

Checkbox r2 = new Checkbox("Yellow Light", cbg, false);
r2.setBackground(Color.YELLOW);
p2.add(r2);
r2.addItemListener(this);

Checkbox r3 = new Checkbox("Green Light", cbg, false);
r3.setBackground(Color.GREEN);
p2.add(r3);
r3.addItemListener(this);

add(p1);
add(p2);

setVisible(true);
addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
});
}
public void itemStateChanged(ItemEvent i)
{
Checkbox chk = cbg.getSelectedCheckbox();
switch (chk.getLabel())
{
case "Red Light":
l1.setText("STOP");
l1.setForeground(Color.red);
break;
    
case "Yellow Light":
l1.setText("Ready");
l1.setForeground(Color.YELLOW);
break;
    
case "Green Light":
l1.setText("GO");
l1.setForeground(Color.GREEN);
break;
}
}
}
public class Traffic {
public static void main(String[] args)
{
A a = new A();
}
}
