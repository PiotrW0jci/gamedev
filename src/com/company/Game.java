package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel,choiceBottonPanel,playerPanel;
    JLabel titleNameLabel, etcsPoints,etcsPointsNumber;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 75);
    Font startButtonFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    int Points;
    String Position;

    TitleScreenHandler tsHandler= new TitleScreenHandler();
    ChoiceHandler chHandler= new ChoiceHandler();

    public static void main(String[] args) {

        new Game();
    }

    public Game() {

        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 250);
        titleNamePanel.setBackground(Color.BLACK);
        titleNameLabel = new JLabel("UMSC Adventure");
        titleNameLabel.setForeground(Color.WHITE);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.BLACK);

        startButton = new JButton("START");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);
        startButton.setFont(startButtonFont);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }

    public void creteGameScreen() {

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea(" Witaj Vladka śpiochu :D");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(startButtonFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceBottonPanel= new JPanel();
        choiceBottonPanel.setBounds(250,350,300,150);
        choiceBottonPanel.setBackground(Color.BLACK);
        choiceBottonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceBottonPanel);

        choice1 = new JButton("1");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(startButtonFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(chHandler);
        choice1.setActionCommand("c1");
        choiceBottonPanel.add(choice1);

        choice2 = new JButton("2");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(startButtonFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(chHandler);
        choice2.setActionCommand("c2");
        choiceBottonPanel.add(choice2);

        choice3 = new JButton("3");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.WHITE);
        choice3.setFont(startButtonFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(chHandler);
        choice3.setActionCommand("c3");
        choiceBottonPanel.add(choice3);

        choice4 = new JButton("4");
        choice4.setBackground(Color.BLACK);
        choice4.setForeground(Color.WHITE);
        choice4.setFont(startButtonFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(chHandler);
        choice4.setActionCommand("c4");
        choiceBottonPanel.add(choice4);


        playerPanel = new JPanel();
        playerPanel.setBounds(100,15,300,50);
        playerPanel.setBackground(Color.BLACK);
        playerPanel.setLayout(new GridLayout(1,2));
        con.add(playerPanel);

        etcsPoints = new JLabel("ECTS:");
        etcsPoints.setFont(startButtonFont);
        etcsPoints.setForeground(Color.WHITE);
        playerPanel.add(etcsPoints);

        etcsPointsNumber = new JLabel();
        etcsPointsNumber.setFont(startButtonFont);
        etcsPointsNumber.setFont(startButtonFont);
        etcsPointsNumber.setForeground(Color.WHITE);
        playerPanel.add(etcsPointsNumber);

        playerSetup();

    }
    public void playerSetup(){
        Points=0;
        etcsPointsNumber.setText(""+Points);
        umcs();
    }
    public void umcs(){
        Position="umcs";
        mainTextArea.setText("Witaj Vladka czas ntwoją fabule");

        choice1.setText("wybierz wolnosc uciekaj");
        choice2.setText("wejdz");
        choice3.setText("3");
        choice4.setText("");
    }

    public void run(){
        Position="run";
        mainTextArea.setText("ciesz się wolnoscią");
        choice1.setText("wroc");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public class  TitleScreenHandler  implements  ActionListener{
        public void actionPerformed(ActionEvent event) {
            creteGameScreen();

        }
    }

    public class ChoiceHandler implements  ActionListener{
        public void actionPerformed(ActionEvent event){
            String yourChoice= event.getActionCommand();

            switch (Position){
                case "umcs":
                    switch(yourChoice){
                        case "c1" :run();
                        case "c2": break;
                        case "c3": break;
                        case "c4": break;
                    }
                    break;
                case "run":
                    switch (yourChoice){
                        case "c1":umcs();
                    }


            }

        }
    }

}
