/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import javax.sound.sampled.*;
import javax.swing.*;

/**
 *
 * @author jse
 */
public class Learning extends JFrame implements ActionListener{
private JButton btn[],btn1[],btn2[],btn3[],btn4[],btn5[],btn6[],btn7[],btn8[],btn9[],btn10[];
JPanel imgpan[];
JPanel panel1;
JLabel label1;
JButton btnmenu;
Color colors[];
char abc[]="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

ArrayList<ImageIcon> animal = new ArrayList<ImageIcon>();
ArrayList<ImageIcon> menu = new ArrayList<ImageIcon>();

    public Learning(){
setTitle("Learn with me");
setLayout(null);
imgpan=new JPanel[10];
    colors = new Color[10];
    colors[0]=Color.BLACK;
    colors[1]=Color.BLUE;
    colors[2]=Color.GRAY;
    colors[3]=Color.GREEN;
    colors[4]=Color.ORANGE;
    colors[5]=Color.PINK;
    colors[6]=Color.RED;
    colors[7]=Color.WHITE;
    colors[8]=Color.YELLOW;
    colors[9]=Color.CYAN;

panel1=new JPanel();
panel1.setLayout(new GridLayout(2,5,8,8));
panel1.setBackground(Color.BLACK);
panel1.setBounds(0, 112, 984, 450);
add(panel1);
label1=new JLabel("Learn With Me");
label1.setFont(new java.awt.Font("Consolas", 1, 20));
label1.setBounds(420, 30, 150, 30);
add(label1);

btnmenu= new JButton("Regresar");
btnmenu.setBounds(850, 20, 120, 30);
btnmenu.addActionListener(this);
btnmenu.setVisible(false);
add(btnmenu);


btn=new JButton[10];
btn1=new JButton[10];
btn2=new JButton[10];
btn3=new JButton[10];
btn4=new JButton[4];
btn5=new JButton[7];
btn6=new JButton[10];
btn7=new JButton[8];
btn8=new JButton[12];
btn9=new JButton[10];
btn10=new JButton[26];

        for (int i = 0; i < 10; i++) {
            menu.add(i, new ImageIcon("menu"+i+".jpg"));
           btn[i]=new JButton("Boton"+(i+1));
           panel1.add(btn[i]);
           btn[i].addActionListener(this);
           
           imgpan[i]=new JPanel();
           imgpan[0].setLayout(new GridLayout(2,5,6,6));
           imgpan[i].setBounds(0, 112, 984, 450);           
           imgpan[i].setVisible(false);           
           add(imgpan[i]);
           
           btn1[i]=new JButton();
           imgpan[0].add(btn1[i]);
           btn1[i].addActionListener(this);
           btn1[i].setBackground(colors[i]);
           
           animal.add(i, new ImageIcon("animal"+i+".jfif"));
              btn[i].setIcon(new ImageIcon(menu.get(i).getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH)));         
              btn[i].setBackground(new Color(0,0,0,0));
btn[i].setBorder(null);
        }
        for (int j = 0; j < 10; j++) {
                btn2[j]=new JButton();
           imgpan[1].add(btn2[j]);
           imgpan[1].setLayout(new GridLayout(2,5,6,6));
           btn2[j].addActionListener(this);
                      btn2[j].setFont(new Font("Tahoma", 1, 50));
                      btn2[j].setText(String.valueOf(j+1));
                    btn2[j].setOpaque(false);
btn2[j].setBackground(new Color(0,0,0,0));
btn2[j].setBorder(null);
            }       
         for (int j = 0; j < 10; j++) {
                btn3[j]=new JButton();
           imgpan[2].add(btn3[j]);
           imgpan[2].setLayout(new GridLayout(2,5,6,6));
           btn3[j].addActionListener(this);         
           btn3[j].setIcon(new ImageIcon(animal.get(j).getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH)));
            }
        for (int j = 0; j < 4; j++) {
                btn4[j]=new JButton();
           imgpan[3].add(btn4[j]);
           imgpan[3].setLayout(new GridLayout(1,4,6,6));
           imgpan[3].setBounds(0, 140, 984, 250);  
           btn4[j].addActionListener(this);
           btn4[j].setIcon(new ImageIcon(new ImageIcon("season"+j+".jpg").getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH)));
                    
            }
        for (int j = 0; j < 7; j++) {
                btn5[j]=new JButton();
           imgpan[4].add(btn5[j]);
           imgpan[4].setLayout(new GridLayout(1,7,6,6));
           imgpan[4].setBounds(0, 140, 984, 220);
           btn5[j].setText(days[j]);
           btn2[j].setFont(new Font("Tahoma", 1, 30));
           btn5[j].addActionListener(this);                      
            }
        
        for (int j = 0; j < 10; j++) {
                btn6[j]=new JButton();
           imgpan[5].add(btn6[j]);
           imgpan[5].setLayout(new GridLayout(2,5,6,6));
           btn6[j].addActionListener(this);  
           btn6[j].setIcon(new ImageIcon(new ImageIcon("fruta"+j+".jfif").getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH)));
                    
            }
        for (int j = 0; j < 8; j++) {
                btn7[j]=new JButton();
           imgpan[6].add(btn7[j]);
           imgpan[6].setLayout(new GridLayout(2,4,6,6));
           btn7[j].addActionListener(this);
           btn7[j].setIcon(new ImageIcon(new ImageIcon("planet"+j+".jpg").getImage().getScaledInstance(280, 220, Image.SCALE_SMOOTH)));
           
            }
        for (int j = 0; j < 12; j++) {
                btn8[j]=new JButton();
           imgpan[7].add(btn8[j]);
           imgpan[7].setLayout(new GridLayout(2,6,6,6));
           btn8[j].addActionListener(this);
           btn8[j].setText(months[j]);
            btn8[j].setFont(new Font("Tahoma", 1, 18));
            }
        for (int j = 0; j < 10; j++) {
                 btn9[j]=new JButton();
           imgpan[8].add(btn9[j]);
           imgpan[8].setLayout(new GridLayout(2,5,6,6));
           btn9[j].addActionListener(this);   
                      btn9[j].setIcon(new ImageIcon(new ImageIcon("part"+j+".jfif").getImage().getScaledInstance(280, 220, Image.SCALE_SMOOTH)));

            }
        for (int j = 0; j < 26; j++) {
                  btn10[j]=new JButton();
           imgpan[9].add(btn10[j]);
           imgpan[9].setLayout(new GridLayout(2,13,6,6));
           imgpan[9].setBounds(0, 180, 984, 200);           
           btn10[j].setText(String.valueOf(abc[j]));
           btn10[j].setFont(new Font("Tahoma", 1, 30));
           btn10[j].addActionListener(this);
            }

}
    
    public static void main(String[] args) {
        Learning obj=new Learning();
        obj.setVisible(true);
        obj.setBounds(180, 30, 1000, 600);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource()==btn[i]) {
                reproducirsonido("click15.wav");
               panel1.setVisible(false);
               imgpan[i].setVisible(true);
               btnmenu.setVisible(true);                
        }
            
            if (e.getSource()==btn1[i]) {
                reproducirsonido("color"+i+".wav");
            }
            
            if (e.getSource()==btn2[i]) {
                reproducirsonido("number"+i+".wav");
            }
            
            if (e.getSource()==btn3[i]) {
                reproducirsonido("animal"+i+".wav");
            }
            if (e.getSource()==btn6[i]) {
                 reproducirsonido("fruta"+i+".wav");
            }
            if (e.getSource()==btn9[i]) {
                 reproducirsonido("part"+i+".wav");
            }
        }
        for (int i = 0; i < 4; i++) {
             if (e.getSource()==btn4[i]) {
                reproducirsonido("season"+i+".wav");
            }
        }
        for (int i = 0; i < 7; i++) {
            if (e.getSource()==btn5[i]) {
                reproducirsonido("day"+i+".wav");
            }
        }
        
        for (int i = 0; i < 8; i++) {
            if (e.getSource()==btn7[i]) {
                reproducirsonido("planet"+i+".wav");
            }
        }
        
        for (int i = 0; i < 12; i++) {
            if (e.getSource()==btn8[i]) {
                reproducirsonido("month"+i+".wav");
            }
        }
        for (int i = 0; i < 26; i++) {
            if (e.getSource()==btn10[i]) {
                reproducirsonido("abc"+i+".wav");
            }
        }
        
        if (e.getSource()==btnmenu) {
  reproducirsonido("click15.wav");            
            btnmenu.setVisible(false);
            for (int i = 0; i < 10; i++) {
                if (imgpan[i].isVisible()==true) {
                    imgpan[i].setVisible(false);
                    panel1.setVisible(true);
                }
            }
        }
        
        
    }

    public void reproducirsonido(String dir){
       try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(dir).getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
       } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
         System.out.println("Error al reproducir el sonido."+ex.getMessage());
       }
     }
}
