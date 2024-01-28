
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SinglePlayer implements ActionListener{

    int move = 0;
    int clicks = 0;
    int result = 3;
    int TotalGames;
    int PlayerOneWins;
    int ComputerWins;
    int Drawn;
    int Cwin = 0;

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
    
    Random rand = new Random();

    JButton Button;

    Songs songs = new Songs();

    ImageIcon icon = new ImageIcon("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\tik-tak-toe.png");
    ImageIcon draw = new ImageIcon("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\Fuck.jpg");   
    ImageIcon WinLose = new ImageIcon("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\Laughing-Emoji.png");
    ImageIcon Win = new ImageIcon("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\win.jpg");


    SinglePlayer(int x, int y, int z, int a){
        TotalGames = x;
        PlayerOneWins = y;
        ComputerWins = z;
        Drawn = a;

        Image newdraw = draw.getImage();
        Image modiNewImage = newdraw.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        draw = new ImageIcon(modiNewImage);

        Image newWinLose = WinLose.getImage();
        Image modiNewWinLose = newWinLose.getScaledInstance(75, 50, java.awt.Image.SCALE_SMOOTH);
        WinLose = new ImageIcon(modiNewWinLose);

        Image newWin = Win.getImage();
        Image modiNewWin = newWin.getScaledInstance(75, 70, java.awt.Image.SCALE_SMOOTH);
        Win = new ImageIcon(modiNewWin);

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

        button1.add(label1);
        button2.add(label2);
        button3.add(label3);
        button4.add(label4);
        button5.add(label5);
        button6.add(label6);
        button7.add(label7);
        button8.add(label8);
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
        if(move==0){
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

            if(checkDraw(clicks)){
                frame.dispose();
                move=10;
            } 
        }

        if (!checkWinOrLose()) {
            showWinMessage(move);
            frame.dispose();
            move=10;
            }
        if(move!=10){
            if(TrytoWin()){
                if(gonnaWin()){
                    while(true){
                        Button = buttonSelection(rand.nextInt(9)+1);
                        if(Button.isEnabled()){
                            break;
                        }
                    }
                    JButton BUTTON = Button;
                    BUTTON.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
                    editText(labelSelection(BUTTON));
                    BUTTON.setEnabled(false);
                    clicks++;
                    move--;

                    if (!checkWinOrLose()) {
                        showWinMessage(move);
                        frame.dispose();
                        Cwin++;
                    }
                }
            }
            if (!checkWinOrLose() && Cwin==0) {
                    showWinMessage(move);
                    frame.dispose();
                }
            
        }
        if (result == 0){
            TotalGames++;
            new SinglePlayer(TotalGames, PlayerOneWins, ComputerWins, Drawn);
        }else if (result == 1){
            new FinalvsComp(TotalGames, PlayerOneWins, ComputerWins, Drawn);
        } 
    }
    public JButton buttonSelection(int x){
        switch (x) {
            case 1:
                return button1;
            case 2:
                return button2;
            case 3:
                return button3;
            case 4:
                return button4;
            case 5: 
                return button5;
            case 6:
                return button6;
            case 7: 
                return button7;
            case 8:
                return button8;
            default:
                return button9;
        }
    }
    public JLabel labelSelection(JButton button){
        if(button==button1){
            return label1;
        }
        else if(button==button2){
            return label2;
        }
        else if(button==button3){
            return label3;
        }
        else if(button==button4){
            return label4;
        }
        else if(button==button5){
            return label5;
        }
        else if(button==button6){
            return label6;
        }
        else if(button==button7){
            return label7;
        }
        else if(button==button8){
            return label8;
        }
        return label9;
    }

    public int XorOAdder(JLabel label, int move){
        if(move == 0){
            label.setText("X");
            label.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 50));
            label.setForeground(Color.RED);
        }
        return 1;
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
            songs.Win();
            result = JOptionPane.showConfirmDialog(frame, "You won! Do you want to play again?", "Winner", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, Win);         
            PlayerOneWins++;  
            
        }else if(move == 0){
            songs.Cheering();
            result = JOptionPane.showConfirmDialog(frame, "You lose! Do you want to play again?","Winner", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, WinLose);
            ComputerWins++;   
        }
    }

    public boolean checkDraw(int clicks) {
        if (clicks == 9 && checkWinOrLose()) {
            songs.Laughing();
            result = JOptionPane.showConfirmDialog(frame, "Do you want to play again?", "Congratulations Match Drawn!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, draw);
            Drawn++;
            return true;
        }
        return false;
    }

    public void editText(JLabel label){
        label.setText("O");
        label.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 50));
        label.setForeground(Color.GREEN);
        label.setHorizontalTextPosition(JLabel.CENTER);
    }
    // if the player going to win the game then this method will obstract the available slot and return false so the while loop exits
    public boolean gonnaWin(){
        if((label1.getText()=="X" || label2.getText()=="X") && label1.getText() == label2.getText() && label3.getText() == " "){
            editText(label3);
            button3.setEnabled(false);
            button3.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label1.getText()=="X" || label3.getText()=="X") && label1.getText() == label3.getText() && label2.getText() == " "){
            editText(label2);
            button2.setEnabled(false);
            button2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label1.getText()=="X" || label4.getText()=="X") && label1.getText() == label4.getText() && label7.getText() == " "){
            editText(label7);
            button7.setEnabled(false);
            button7.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label1.getText()=="X" || label7.getText()=="X") && label1.getText() == label7.getText() && label4.getText() == " "){
            editText(label4);
            button4.setEnabled(false);
            button4.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label1.getText()=="X" || label5.getText()=="X") && label1.getText() == label5.getText() && label9.getText() == " "){
            editText(label9);
            button9.setEnabled(false);
            button9.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label1.getText()=="X" || label9.getText()=="X") && label1.getText() == label9.getText() && label5.getText() == " "){
            editText(label5);
            button5.setEnabled(false);
            button5.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label5.getText()=="X" || label7.getText()=="X") && label5.getText() == label7.getText() && label3.getText() == " "){
            editText(label3);
            button3.setEnabled(false);
            button3.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label5.getText()=="X" || label8.getText()=="X") && label5.getText() == label8.getText() && label2.getText() == " "){
            editText(label2);
            button2.setEnabled(false);
            button2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label5.getText()=="X" || label9.getText()=="X") && label5.getText() == label9.getText() && label1.getText() == " "){
            editText(label1);
            button1.setEnabled(false);
            button1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label5.getText()=="X" || label6.getText()=="X") && label5.getText() == label6.getText() && label4.getText() == " "){
            editText(label4);
            button4.setEnabled(false);
            button4.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }  
        else if((label5.getText()=="X" || label3.getText()=="X") && label5.getText() == label3.getText() && label7.getText() == " "){
            editText(label7);
            button7.setEnabled(false);
            button7.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }    
        else if((label5.getText()=="X" || label2.getText()=="X") && label5.getText() == label2.getText() && label8.getText() == " "){
            editText(label8);
            button8.setEnabled(false);
            button8.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label5.getText()=="X" || label4.getText()=="X") && label5.getText() == label4.getText() && label6.getText() == " "){
            editText(label6);
            button6.setEnabled(false);
            button6.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }   
        else if((label2.getText()=="X" || label3.getText()=="X") && label2.getText() == label3.getText() && label1.getText() == " "){
            editText(label1);
            button1.setEnabled(false);
            button1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label2.getText()=="X" || label8.getText()=="X") && label2.getText() == label8.getText() && label5.getText() == " "){
            editText(label5);
            button5.setEnabled(false);
            button5.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label6.getText()=="X" || label3.getText()=="X") && label6.getText() == label3.getText() && label9.getText() == " "){
            editText(label9);
            button9.setEnabled(false);
            button9.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }  
        else if((label9.getText()=="X" || label3.getText()=="X") && label9.getText() == label3.getText() && label6.getText() == " "){
            editText(label6);
            button6.setEnabled(false);
            button6.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }  
        else if((label6.getText()=="X" || label9.getText()=="X") && label6.getText() == label9.getText() && label3.getText() == " "){
            editText(label3);
            button3.setEnabled(false);
            button3.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label6.getText()=="X" || label4.getText()=="X") && label6.getText() == label4.getText() && label5.getText() == " "){
            editText(label5);
            button5.setEnabled(false);
            button5.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }   
        else if((label7.getText()=="X" || label4.getText()=="X") && label7.getText() == label4.getText() && label1.getText() == " "){
            editText(label1);
            button1.setEnabled(false);
            button1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label7.getText()=="X" || label8.getText()=="X") && label7.getText() == label8.getText() && label9.getText() == " "){
            editText(label9);
            button9.setEnabled(false);
            button9.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label7.getText()=="X" || label9.getText()=="X") && label7.getText() == label9.getText() && label8.getText() == " "){
            editText(label8);
            button8.setEnabled(false);
            button8.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label7.getText()=="X" || label3.getText()=="X") && label7.getText() == label3.getText() && label5.getText() == " "){
            editText(label5);
            button5.setEnabled(false);
            button5.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label8.getText()=="X" || label9.getText()=="X") && label8.getText() == label9.getText() && label7.getText() == " "){
                editText(label7);
                button7.setEnabled(false);
                button7.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
                move--;
                clicks++;
                return false;
            }  
    return true;        
    }

    public boolean TrytoWin(){
        if((label1.getText()=="O" || label2.getText()=="O") && label1.getText() == label2.getText() && label3.getText() == " "){
            editText(label3);
            button3.setEnabled(false);
            button3.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label1.getText()=="O" || label3.getText()=="O") && label1.getText() == label3.getText() && label2.getText() == " "){
            editText(label2);
            button2.setEnabled(false);
            button2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label1.getText()=="O" || label4.getText()=="O") && label1.getText() == label4.getText() && label7.getText() == " "){
            editText(label7);
            button7.setEnabled(false);
            button7.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label1.getText()=="O" || label7.getText()=="O") && label1.getText() == label7.getText() && label4.getText() == " "){
            editText(label4);
            button4.setEnabled(false);
            button4.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label1.getText()=="O" || label5.getText()=="O") && label1.getText() == label5.getText() && label9.getText() == " "){
            editText(label9);
            button9.setEnabled(false);
            button9.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label1.getText()=="O" || label9.getText()=="O") && label1.getText() == label9.getText() && label5.getText() == " "){
            editText(label5);
            button5.setEnabled(false);
            button5.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label5.getText()=="O" || label7.getText()=="O") && label5.getText() == label7.getText() && label3.getText() == " "){
            editText(label3);
            button3.setEnabled(false);
            button3.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label5.getText()=="O" || label8.getText()=="O") && label5.getText() == label8.getText() && label2.getText() == " "){
            editText(label2);
            button2.setEnabled(false);
            button2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label5.getText()=="O" || label9.getText()=="O") && label5.getText() == label9.getText() && label1.getText() == " "){
            editText(label1);
            button1.setEnabled(false);
            button1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label5.getText()=="O" || label6.getText()=="O") && label5.getText() == label6.getText() && label4.getText() == " "){
            editText(label4);
            button4.setEnabled(false);
            button4.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }  
        else if((label5.getText()=="O" || label3.getText()=="O") && label5.getText() == label3.getText() && label7.getText() == " "){
            editText(label7);
            button7.setEnabled(false);
            button7.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }    
        else if((label5.getText()=="O" || label2.getText()=="O") && label5.getText() == label2.getText() && label8.getText() == " "){
            editText(label8);
            button8.setEnabled(false);
            button8.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }
        else if((label5.getText()=="O" || label4.getText()=="O") && label5.getText() == label4.getText() && label6.getText() == " "){
            editText(label6);
            button6.setEnabled(false);
            button6.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }   
        else if((label2.getText()=="O" || label3.getText()=="O") && label2.getText() == label3.getText() && label1.getText() == " "){
            editText(label1);
            button1.setEnabled(false);
            button1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label2.getText()=="O" || label8.getText()=="O") && label2.getText() == label8.getText() && label5.getText() == " "){
            editText(label5);
            button5.setEnabled(false);
            button5.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label6.getText()=="O" || label3.getText()=="O") && label6.getText() == label3.getText() && label9.getText() == " "){
            editText(label9);
            button9.setEnabled(false);
            button9.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }  
        else if((label9.getText()=="O" || label3.getText()=="O") && label9.getText() == label3.getText() && label6.getText() == " "){
            editText(label6);
            button6.setEnabled(false);
            button6.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }  
        else if((label6.getText()=="O" || label9.getText()=="O") && label6.getText() == label9.getText() && label3.getText() == " "){
            editText(label3);
            button3.setEnabled(false);
            button3.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label6.getText()=="O" || label4.getText()=="O") && label6.getText() == label4.getText() && label5.getText() == " "){
            editText(label5);
            button5.setEnabled(false);
            button5.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }   
        else if((label7.getText()=="O" || label4.getText()=="O") && label7.getText() == label4.getText() && label1.getText() == " "){
            editText(label1);
            button1.setEnabled(false);
            button1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label7.getText()=="O" || label8.getText()=="O") && label7.getText() == label8.getText() && label9.getText() == " "){
            editText(label9);
            button9.setEnabled(false);
            button9.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label7.getText()=="O" || label9.getText()=="O") && label7.getText() == label9.getText() && label8.getText() == " "){
            editText(label8);
            button8.setEnabled(false);
            button8.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label7.getText()=="O" || label3.getText()=="O") && label7.getText() == label3.getText() && label5.getText() == " "){
            editText(label5);
            button5.setEnabled(false);
            button5.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        } 
        else if((label8.getText()=="O" || label9.getText()=="O") && label8.getText() == label9.getText() && label7.getText() == " "){
            editText(label7);
            button7.setEnabled(false);
            button7.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
            move--;
            clicks++;
            return false;
        }          
        return true;
    }
}
