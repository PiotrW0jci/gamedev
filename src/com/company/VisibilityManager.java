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
}
