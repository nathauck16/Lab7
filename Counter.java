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
      //had to use a bigger frame size so i could actually see all the text
      frame.setSize(400,310);

      leftCount = 0;
      rightCount = 0;

      //when not commented out, below code will crash our IDE when GUI is exited 
      //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


      JButton left = new JButton("Left ");
      JButton right = new JButton("Right ");
      JButton reset = new JButton("Reset ");

      left.addActionListener(this);
      right.addActionListener(this);
      reset.addActionListener(this);

      frame.add(left);
      frame.add(right);
      frame.add(reset, BorderLayout.SOUTH);

      leftLabel = new JLabel("Left Count: "  + leftCount);
      rightLabel = new JLabel("Right Count: " + rightCount);
      label1 = new JLabel("Press a button");

      frame.add(label1, BorderLayout.SOUTH);
      frame.add(leftLabel, BorderLayout.EAST);
      frame.add(rightLabel, BorderLayout.WEST);
      frame.setVisible(true);

  }


//action event
public void actionPerformed(ActionEvent ae) {
  if(ae.getActionCommand().equals("Left ")){
      leftCount ++;
      label1.setText("You pressed Left");
      leftLabel.setText("Left Count: " + leftCount);

  }
  else if(ae.getActionCommand().equals("Right ")) {
      rightCount ++;
      label1.setText("You pressed Right");
      rightLabel.setText("Right Count: " + rightCount);
  }
  else if(ae.getActionCommand().equals("Reset ")) {
      leftCount = 0;
      rightCount = 0;
      label1.setText("Press a button");
      leftLabel.setText("Left Count: " + leftCount);
      rightLabel.setText("Right Count: " + rightCount);

  }
}
}