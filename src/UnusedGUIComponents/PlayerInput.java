package UnusedGUIComponents;

import javax.swing.*;

public class PlayerInput {
        private JFrame f;
        PlayerInput() {
            f = new JFrame();
            String name = JOptionPane.showInputDialog(f, "");
        }
}
