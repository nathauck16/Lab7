import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Counter implements ActionListener {
  JLabel label1;
  JLabel rightLabel;
  JLabel leftLabel;
  int leftCount;
  int rightCount;

  Counter(){
      JFrame frame = new JFrame("Let's count");
      frame.setLayout(new FlowLayout());
      frame.setSize(200,110);

      leftCount = 0;
      rightCount = 0;

      //when not commented out, below code will crash our IDE when GUI is exited 
      //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


      JButton left = new JButton("Left ");
      JButton right = new JButton("Right ");

      left.addActionListener(this);
      right.addActionListener(this);

      frame.add(left);
      frame.add(right);

      leftLabel = new JLabel("Left Count: " + leftCount);
      rightLabel = new JLabel("Right Count " + rightCount);
      label1 = new JLabel("Press a button");

      frame.add(label1, BorderLayout.SOUTH);
      frame.add(leftLabel);
      frame.add(rightLabel);
      frame.setVisible(true);

  }

public void actionPerformed(ActionEvent ae) {
  if(ae.getActionCommand().equals("Left ")){
      label1.setText("You pressed Left");
  }
  else {
      label1.setText("You pressed Right");
  }
}
}