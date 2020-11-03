import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Counter implements ActionListener {
  JLabel label;

  Counter(){
      JFrame frame = new JFrame("Button");
      frame.setLayout(new FlowLayout());
      frame.setSize(220,90);

      JButton Left = new JButton("Left");
      JButton Right = new JButton("Right");

      Left.addActionListener(this);
      Right.addActionListener(this);

      frame.add(Left);
      frame.add(Right);

      label = new JLabel("Press a button");
      frame.add(label);
      frame.setVisible(true);

  }

public void actionPerformed(ActionEvent ae) {
  if(ae.getActionCommand().equals("Up")){
      label.setText("You pressed up");
  }
  else {
      label.setText("You pressed down");
  }
}
} 