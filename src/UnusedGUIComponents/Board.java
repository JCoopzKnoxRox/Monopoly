package UnusedGUIComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Board extends JPanel implements ActionListener{
    private ImageIcon logoImage;
    private ImageIcon railroad;
    private ImageIcon railroad2;
    private ImageIcon goSpace;
    private ImageIcon freeParking;
    private ImageIcon goToJail;
    private ImageIcon jailSpace;
    private int x = 0, y = 520, velX = 2, velY = 2;
    private JButton button;
    public void paint(Graphics g) {
        button = new JButton("Click ME");
        button.addActionListener(this);
        this.add(button, BorderLayout.SOUTH);
        logoImage = new ImageIcon("MonopolyMan.png");
        Image Man = logoImage.getImage();
        g.drawImage(Man, 175, 150, 256, 256, null);
        railroad = new ImageIcon("MS Paint _ Microsoft Paint Online.png");
        Image Railroad = railroad.getImage();
        g.drawImage(Railroad, 0, 275, 100, 44, null);
        g.drawImage(Railroad, 500, 275, 100, 44, null);
        railroad2 = new ImageIcon("Train2.png");
        Image Railroad2 = railroad2.getImage();
        g.drawImage(Railroad2, 275, 0, 44, 100, null);
        g.drawImage(Railroad2, 275, 500, 44, 100, null);
        goSpace = new ImageIcon("GoSpace.png");
        Image GoSpace = goSpace.getImage();
        g.drawImage(GoSpace, 0, 500, 100, 100, null);
        freeParking = new ImageIcon("FreeParking.png");
        Image FreeParking = freeParking.getImage();
        g.drawImage(FreeParking, 500, 0, 100, 100, null);
        goToJail = new ImageIcon("GoToJail.png");
        Image GoToJail = goToJail.getImage();
        g.drawImage(GoToJail, 500, 500, 100, 100, null);
        jailSpace = new ImageIcon("JailSpace.png");
        Image JailSpace = jailSpace.getImage();
        g.drawImage(JailSpace, 0, 0, 100, 100, null);


        g.setColor(Color.BLACK);
        g.draw3DRect(0, 0, 100, 100, true);
        g.draw3DRect(0, 500, 100, 100, true);
        g.draw3DRect(500, 500, 100, 100, true);
        g.draw3DRect(500, 0, 100, 100, true);
        //draws colored tiles
        Color Brown = new Color(139, 69, 19);
        g.setColor(Brown);
        g.fillRect(80, 452, 20, 48);
        g.fillRect(80, 364, 20, 44);
        Color lBlue = new Color(137, 213, 255);
        g.setColor(lBlue);
        g.fillRect(80, 100, 20, 44);
        g.fillRect(80, 144, 20, 44);
        g.fillRect(80, 232, 20, 44);
        g.setColor(Color.MAGENTA);
        g.fillRect(100, 80, 44, 20);
        g.fillRect(188, 80, 44, 20);
        g.fillRect(232, 80, 44, 20);
        g.setColor(Color.ORANGE);
        g.fillRect(320, 80, 44, 20);
        g.fillRect(408, 80, 44, 20);
        g.fillRect(452, 80, 48, 20);
        g.setColor(Color.RED);
        g.fillRect(500, 100, 20, 44);
        g.fillRect(500, 188, 20, 44);
        g.fillRect(500, 232, 20, 44);
        g.setColor(Color.YELLOW);
        g.fillRect(500, 320, 20, 44);
        g.fillRect(500, 408, 20, 44);
        g.fillRect(500, 452, 20, 48);
        Color darkGreen = new Color(0, 153, 0);
        g.setColor(darkGreen);
        g.fillRect(452, 500, 48, 20);
        g.fillRect(408, 500, 44, 20);
        g.fillRect(320, 500, 44, 20);
        g.setColor(Color.BLUE);
        g.fillRect(100, 500, 44, 20);
        g.fillRect(188, 500, 44, 20);


        g.setColor(Color.BLACK);
        //draws top
        g.draw3DRect(100, 0, 44, 100, true);
        g.draw3DRect(144, 0, 44, 100, true);
        g.draw3DRect(188, 0, 44, 100, true);
        g.draw3DRect(232, 0, 44, 100, true);
        g.draw3DRect(276, 0, 44, 100, true);
        g.draw3DRect(320, 0, 44, 100, true);
        g.draw3DRect(364, 0, 44, 100, true);
        g.draw3DRect(408, 0, 44, 100, true);
        g.draw3DRect(452, 0, 48, 100, true);
        //draws left
        g.draw3DRect(0, 100, 100, 44, true);
        g.draw3DRect(0, 144, 100, 44, true);
        g.draw3DRect(0, 188, 100, 44, true);
        g.draw3DRect(0, 232, 100, 44, true);
        g.draw3DRect(0, 276, 100, 44, true);
        g.draw3DRect(0, 320, 100, 44, true);
        g.draw3DRect(0, 364, 100, 44, true);
        g.draw3DRect(0, 408, 100, 44, true);
        g.draw3DRect(0, 452, 100, 48, true);
        //draws right
        g.draw3DRect(500, 100, 100, 44, true);
        g.draw3DRect(500, 144, 100, 44, true);
        g.draw3DRect(500, 188, 100, 44, true);
        g.draw3DRect(500, 232, 100, 44, true);
        g.draw3DRect(500, 276, 100, 44, true);
        g.draw3DRect(500, 320, 100, 44, true);
        g.draw3DRect(500, 364, 100, 44, true);
        g.draw3DRect(500, 408, 100, 44, true);
        g.draw3DRect(500, 452, 100, 48, true);
        //draws bottom
        g.draw3DRect(100, 500, 44, 100, true);
        g.draw3DRect(144, 500, 44, 100, true);
        g.draw3DRect(188, 500, 44, 100, true);
        g.draw3DRect(232, 500, 44, 100, true);
        g.draw3DRect(276, 500, 44, 100, true);
        g.draw3DRect(320, 500, 44, 100, true);
        g.draw3DRect(364, 500, 44, 100, true);
        g.draw3DRect(408, 500, 44, 100, true);
        g.draw3DRect(452, 500, 48, 100, true);
        Color pieceColor = new Color(128, 128, 128, 127);
        g.setColor(pieceColor);

        g.fillRoundRect(x, y, 30, 30, 10, 10);
        g.fillRoundRect(x, y, 30, 30, 10, 10);
        //setUp();

    }
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == button){
           System.out.println("OK Boomer");
       }

        //repaint();
    }


}
