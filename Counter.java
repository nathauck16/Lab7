import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Counter implements ActionListener {
  JLabel label;
  JLabel leftCountLabel;
  JLabel rightCountLabel;

  int rightCount= 0;
  int leftCount = 0;

  

      JFrame frame = new JFrame("Let's Count");
      frame.setLayout(new FlowLayout());
      frame.setSize(200,110);

      JButton left = new JButton("Left");
      JButton Right = new JButton("Right");

      left.addActionListener(this);
      right.addActionListener(this);

      frame.add(left);
      frame.add(right);

      

      directions = new JLabel("Press a button");
      leftCountLabel = new JLabel("Left Count: ");
      rightCountLabel = new JLabel("Right Count: ");

      frame.add(leftCountLabel, BorderLayout.WEST );
      frame.add(rightCountLabel, BorderLayout.EAST );
      frame.add(directions, BorderLayout.SOUTH );
      frame.setVisible(true);

  }

public void actionPerformed(ActionEvent ae) {
  if(ae.getActionCommand().equals("Left")){
      label.setText("You pressed Left");
  }
  else {
      label.setText("You pressed Right");
  }
}
} 