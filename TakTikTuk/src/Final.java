import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Final implements ActionListener{

    int TotalGames = 0;
    int PlayerOneWins = 0;
    int PlayerTwoWins = 0;

    Songs songs = new Songs();

    ImageIcon icon = new ImageIcon("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\tik-tak-toe.png");


    JLabel label1 = new JLabel("Total Games :");
    JLabel label2 = new JLabel("Player One :");
    JLabel label3 = new JLabel("Player Two :");
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel label6 = new JLabel();
    JLabel label7 = new JLabel("The Final Results");
    JLabel label8 = new JLabel("Drawn :");
    JLabel label9 = new JLabel();
    

    JFrame frame = new JFrame();

    JButton button2 = new JButton("Home");
    JButton button = new JButton("Exit");

    Final(int TotalGames, int PlayerOneWins, int PlayerTwoWins, int Drawn){
        songs.End();

        frame.setSize(420, 420);
        frame.setTitle("The Tak Tik Tok Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setIconImage(icon.getImage());

        button.setBounds(220 , 300, 120, 30);
        button.setFont(new Font("MV Boli", Font.BOLD, 25));
        button.setFocusable(false);
        button.addActionListener(this);

        button2.setBounds(70 , 300, 120, 30);
        button2.setFont(new Font("MV Boli", Font.BOLD, 22));
        button2.setForeground(Color.RED);
        button2.setFocusable(false);
        button2.addActionListener(this);

        label1.setBounds(0, 60, 210, 40);
        label1.setFont(new Font("MV Boli", Font.BOLD, 25));
        label1.setHorizontalAlignment(JLabel.CENTER);

        label4.setBounds(210, 60, 210, 40);
        label4.setFont(new Font("MV Boli", Font.BOLD, 25));
        label4.setText(String.valueOf(TotalGames));
        label4.setHorizontalAlignment(JLabel.CENTER);

        label2.setBounds(0, 120, 210, 40);
        label2.setFont(new Font("MV Boli", Font.BOLD, 25));
        label2.setHorizontalAlignment(JLabel.CENTER);

        label5.setBounds(210, 120, 210, 40);
        label5.setFont(new Font("MV Boli", Font.BOLD, 25));
        label5.setText(String.valueOf(PlayerOneWins));
        label5.setHorizontalAlignment(JLabel.CENTER);

        label3.setBounds(0, 180, 210, 40);
        label3.setFont(new Font("MV Boli", Font.BOLD, 25));
        label3.setHorizontalAlignment(JLabel.CENTER);

        label6.setBounds(210, 180, 210, 40);
        label6.setFont(new Font("MV Boli", Font.BOLD, 25));
        label6.setText(String.valueOf(PlayerTwoWins));
        label6.setHorizontalAlignment(JLabel.CENTER);

        label8.setBounds(0, 240, 210, 40);
        label8.setFont(new Font("MV Boli", Font.BOLD, 25));
        label8.setHorizontalAlignment(JLabel.CENTER);

        label9.setBounds(210, 240, 210, 40);
        label9.setFont(new Font("MV Boli", Font.BOLD, 25));
        label9.setText(String.valueOf(Drawn));
        label9.setHorizontalAlignment(JLabel.CENTER);

        label7.setFont(new Font("MV Boli", Font.BOLD, 25));
        label7.setForeground(Color.BLUE);
        label7.setBounds(-15, 0, 420, 60);
        label7.setHorizontalAlignment(JLabel.CENTER);
        label7.setVerticalTextPosition(JLabel.BOTTOM);


        frame.add(button);
        frame.add(button2);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(label9);
        frame.add(button);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            songs.Beep();
            frame.dispose();
        }
        else if(e.getSource() == button2){
            new Home();
            frame.dispose();
        }
    }
}
