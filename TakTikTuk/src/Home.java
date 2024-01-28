import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home implements ActionListener{
    JFrame frame = new JFrame();

    JLabel label = new JLabel();

    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();

    Songs songs = new Songs();

    ImageIcon icon = new ImageIcon("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\tik-tak-toe.png");

    Home(){
        ImageIcon icon = new ImageIcon("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\tik-tak-toe.png");
        Image newIcon = icon.getImage();
        Image modiNewIcon = newIcon.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modiNewIcon);  

        frame.setTitle("The Tak Tik Tok Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setIconImage(icon.getImage());

        button3.setBounds(55, 300, 100, 30);
        button1.setBounds(150, 300, 100, 30);
        button2.setBounds(250, 300, 100, 30);

        button3.addActionListener(this);  
        button1.addActionListener(this);        
        button2.addActionListener(this);

        label.setText("Tak Tik Tok");
        label.setFont(new Font("MV Boli", Font.BOLD, 50));
        label.setBounds(-10, 0, 420, 300);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setIcon(icon);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setIconTextGap(-20);
        label.setOpaque(true);
        

        button1.setText("2 Player");
        button2.setText("Exit");
        button3.setText("1 Player");
        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button1.setFont(new Font("MV Boli" , Font.BOLD, 15));
        button2.setFont(new Font("MV Boli", Font.BOLD, 15));
        button3.setFont(new Font("MV Boli", Font.BOLD, 15));
        button1.setForeground(Color.RED);
        button3.setForeground(Color.BLUE);
        

        
        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setVisible(true);
        songs.Start();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            songs.Beep();
            frame.dispose();
            new Game(1, 0 , 0, 0);
        }
        else if(e.getSource() == button2){
            songs.Beep();
            frame.dispose();
        }
        else if(e.getSource() == button3){
            songs.Beep();
            frame.dispose();
            new SinglePlayer(1, 0, 0, 0);
        }
    }


    public static void main(String[] args) {
        new Home();
    }
}
