//package UnusedGUIComponents;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//
//public class Game extends Board implements ActionListener {
//    private static Dimension OUTER_FRAME_DIMESION = new Dimension(600, 600);
//
//    public ArrayList<Player> players = new ArrayList<>();
//    private JButton button;
//    private JTextArea p1Stats;
//    private JTextArea p2Stats;
//    //private Player p1 = new Player("Player 1", 1500,0,false);
//    //private Player p2 = new Player("Player 2", 1500,0,false);
//    public Game(){
//        JFrame frame = new JFrame();
//        Color greenTan = new Color(204,255,204);
//        Board Monopoly = new Board();
//        //frame.setBackground(greenTan);
//        button = new JButton("Click ME");
//        button.addActionListener(this);
//        Monopoly.setPreferredSize(OUTER_FRAME_DIMESION);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(Monopoly);
//        //p1Stats = new JTextArea(p1.getName() + ":\n" + "Money: " +p1.getMoney() + "\n" + "Jail Cards:" +p1.getJailFreeCards() + "\n" + p1.printProperties());
//        //p2Stats = new JTextArea(p2.getName() + ":\n" + "Money: " +p2.getMoney() + "\n" + "Jail Cards:" +p2.getJailFreeCards() + "\n" + p2.printProperties());
//        frame.add(button,BorderLayout.SOUTH);
//        frame.add(p1Stats,BorderLayout.WEST);
//        frame.add(p2Stats,BorderLayout.EAST);
//        frame.setTitle("Monopoly");
//        frame.pack();
//        frame.setVisible(true);
//
//
//
//    }
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == button){
//            JOptionPane.showMessageDialog(null, "Clicked");
//        }
//
//        //repaint();
//    }
//
//        public static void main(String [] args){
//        //new UnusedGUIComponents.PlayerInput();
//
//        new Game();
//    }
//}
//
