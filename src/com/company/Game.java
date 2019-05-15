package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    ChoiceHandler chHandler= new ChoiceHandler();
    TitleScreenHandler tsHandler= new TitleScreenHandler();
    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);



    public static void main(String[] args) {

        new Game();
    }

    public Game() {

        ui.createUI(chHandler,tsHandler);
        vm.showTitleScreen();

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
