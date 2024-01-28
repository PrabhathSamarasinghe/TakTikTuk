import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Game implements ActionListener{
    int move = 0;
    int clicks = 0;
    int result = 3;
    int TotalGames;
    int PlayerOneWins;
    int PlayerTwoWins;
    int Drawn;

    Songs songs = new Songs();

    JFrame frame = new JFrame();

    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();

    JLabel label1 = new JLabel(" ");
    JLabel label2 = new JLabel(" ");
    JLabel label3 = new JLabel(" ");
    JLabel label4 = new JLabel(" ");
    JLabel label5 = new JLabel(" ");
    JLabel label6 = new JLabel(" ");
    JLabel label7 = new JLabel(" ");
    JLabel label8 = new JLabel(" ");
    JLabel label9 = new JLabel(" "); 


    ImageIcon icon = new ImageIcon("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\tik-tak-toe.png");
    ImageIcon draw = new ImageIcon("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\Fuck.jpg");   
    ImageIcon WinLose = new ImageIcon("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\Laughing-Emoji.png");
  
    Game(int x, int y, int z, int a){
        TotalGames = x;
        PlayerOneWins = y;
        PlayerTwoWins = z;
        Drawn = a;

        Image newdraw = draw.getImage();
        Image modiNewImage = newdraw.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        draw = new ImageIcon(modiNewImage);

        Image newWinLose = WinLose.getImage();
        Image modiNewWinLose = newWinLose.getScaledInstance(75, 50, java.awt.Image.SCALE_SMOOTH);
        WinLose = new ImageIcon(modiNewWinLose);

        frame.setTitle("The Tak Tik Tok Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(new GridLayout(3, 3));
        frame.setIconImage(icon.getImage());
        

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);


        button1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
        button1.add(label1);

        button2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
        button2.add(label2);

        button3.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
        button3.add(label3);

        button4.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
        button4.add(label4);

        button5.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
        button5.add(label5);

        button6.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
        button6.add(label6);

        button7.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
        button7.add(label7);

        button8.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
        button8.add(label8);

        button9.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
        button9.add(label9);


        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);

        frame.setVisible(true);       
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            songs.Beep();
            move = XorOAdder(label1, move);
            button1.setEnabled(false);
        }
        else if(e.getSource() == button2){
            songs.Beep();
            move = XorOAdder(label2, move);
            button2.setEnabled(false);
        }
        else if(e.getSource() == button3){
            songs.Beep();
            move = XorOAdder(label3, move);
            button3.setEnabled(false);
        }
        else if(e.getSource() == button4){
            songs.Beep();
            move = XorOAdder(label4, move);
            button4.setEnabled(false);
        }
        else if(e.getSource() == button5){
            songs.Beep();
            move = XorOAdder(label5, move);
            button5.setEnabled(false);
        }
        else if(e.getSource() == button6){
            songs.Beep();
            move = XorOAdder(label6, move);
            button6.setEnabled(false);
        }
        else if(e.getSource() == button7){
            songs.Beep();
            move = XorOAdder(label7, move);
            button7.setEnabled(false);
        }
        else if(e.getSource() == button8){
            songs.Beep();
            move = XorOAdder(label8, move);
            button8.setEnabled(false);
        }
        else if(e.getSource() == button9){
            songs.Beep();
            move = XorOAdder(label9, move);
            button9.setEnabled(false);
        }
        clicks++;
        if (!checkWinOrLose()) {
            showWinMessage(move);
            frame.dispose();
        }else{
            if(checkDraw(clicks)){
                frame.dispose();
            }
        }
        if (result == 0){
            TotalGames++;
            new Game(TotalGames, PlayerOneWins, PlayerTwoWins, Drawn);
        }else if (result == 1){
            new Final(TotalGames, PlayerOneWins, PlayerTwoWins, Drawn);
        }
    }
    
    public int XorOAdder(JLabel label, int move){
        if(move == 0){
            label.setText("X");
            label.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 50));
            label.setForeground(Color.RED);
            return 1;
        }else{
            label.setText("O");
            label.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 50));
            label.setForeground(Color.GREEN);
            return 0;
        }
    }

    public boolean checkWinOrLose() {
        if (label1.getText() != " " && label1.getText().equals(label2.getText()) && label1.getText().equals(label3.getText())) {
            return false;
        } else if (label4.getText() != " " && label4.getText().equals(label5.getText()) && label4.getText().equals(label6.getText())) {
            return false;
        } else if (label7.getText() != " " && label7.getText().equals(label8.getText()) && label7.getText().equals(label9.getText())) {
            return false;
        } else if (label1.getText() != " " && label1.getText().equals(label4.getText()) && label1.getText().equals(label7.getText())) {
            return false;
        } else if (label2.getText() != " " && label2.getText().equals(label5.getText()) && label2.getText().equals(label8.getText())) {
            return false;
        } else if (label3.getText() != " " && label3.getText().equals(label6.getText()) && label3.getText().equals(label9.getText())) {

            return false;
        } else if (label1.getText() != " " && label1.getText().equals(label5.getText()) && label1.getText().equals(label9.getText())) {
            return false;
        } else if (label3.getText() != " " && label3.getText().equals(label5.getText()) && label3.getText().equals(label7.getText())) {
            return false;
        }
        return true;
    }
    
    public void showWinMessage(int move) {
        if(move == 1){
            songs.Cheering();
            result = JOptionPane.showConfirmDialog(frame, "Player one won! Do you want to play again?", "Winner", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, WinLose);         
            PlayerOneWins++;  
            
        }else{
            songs.Cheering();
            result = JOptionPane.showConfirmDialog(frame, "Player two won! Do you want to play again?","Winner", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, WinLose);
            PlayerTwoWins++;
            
        }
    }

    public boolean checkDraw(int clicks){
        if(clicks == 9){
            songs.Laughing();
            result = JOptionPane.showConfirmDialog(frame,"Smile in Pain", "Congragulations Match Drawn!", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, draw);
            Drawn++;
            return true;
        }
        return false;
    }
 }
