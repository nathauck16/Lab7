import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Main {
  public static void main(String[] args) {
   SwingUtilities.invokeLater(new Runnable() {
      public void run() {

        new Counter();
          

      }
   });
  }
}