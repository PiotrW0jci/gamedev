package com.company;

public class VisibilityManager {

    UI ui;
    public  VisibilityManager(UI userInterface){
        ui= userInterface;

    }
    public  void showTitleScreen(){
    //title screen
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);
        //hide game screen
        ui.mainTextPanel.setVisible(false);
        ui.choiceBottonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }

    public void titleToUmcs(){
        //hide title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        //show game screen
        ui.mainTextPanel.setVisible(true);
        ui.choiceBottonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
    }
}
