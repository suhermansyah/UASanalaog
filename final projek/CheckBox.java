import javax.swing.*;  
import java.awt.event.*;    
public class CheckBox    
{    
     CheckBox(){    
        JFrame f= new JFrame("CheckBox");    
        final JLabel label = new JLabel();            
        label.setHorizontalAlignment(JLabel.CENTER);    
        label.setSize(400,100);    
        JCheckBox checkbox1 = new JCheckBox("SISWA");    
        checkbox1.setBounds(150,100, 100,50);    
        JCheckBox checkbox2 = new JCheckBox("GURU");    
        checkbox2.setBounds(150,150, 100,50);    
        f.add(checkbox1); f.add(checkbox2); f.add(label);    
        checkbox1.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                label.setText("Siswa Checkbox: "     
                + (e.getStateChange()==1?"checked":"unchecked"));    
             }    
          });    
        checkbox2.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                label.setText("Guru Checkbox: "     
                + (e.getStateChange()==1?"checked":"unchecked"));    
             }    
          });    
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }    
public static void main(String args[])    
{    
    new CheckBox();    
}    
}