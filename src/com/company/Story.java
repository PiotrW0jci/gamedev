package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Story {
    String saveNextPosition;
    Game game;
    UI ui;
    VisibilityManager vm;
    Player player = new Player();

    public  Story(Game g, UI userInterface, VisibilityManager visibilityManager){
        game=g;
        ui= userInterface;
        vm = visibilityManager;

    }
    public  void defaultSetup(){

        player.ects=0;
        ui.etcsPoints.setText(""+player.ects);
    }
    public void loadData(){
        try{
            BufferedReader br= new BufferedReader(new FileReader("save.txt"));
            player.ects = Integer.parseInt(br.readLine());
            saveNextPosition = br.readLine();
            ui.etcsPoints.setText(""+player.ects);

        }
        catch (Exception e){

        }
    }

    public  void selectPosition(String nextPosition){

        switch (nextPosition){
            case "north":north();break;
            case "south":south();break;
            case "east":east();break;
            case "west":west();break;
            case "stairs":stairs();break;
            case "board":board();break;
            case "lessons":lessons();break;
            case "firstLesson":firstLesson();break;

        }
    }
    public void umcs(){

        ui.mainTextArea.setText("JESTEŚ W BUDYNKU UMCS\n ROZEJRZYJ SIĘ");

        ui.choice1.setText("PÓŁNOC");
        ui.choice2.setText("POŁÓWNIE");
        ui.choice3.setText("ZACHÓD");
        ui.choice4.setText("WSCHÓD");

        game.nextPosition1="north";
        game.nextPosition2="south";
        game.nextPosition3="west";
        game.nextPosition4="east";
    }

    public void north(){

        ui.mainTextArea.setText("PRZED TOBĄ STOI STUDENT");
        player.ects= player.ects -3;
        ui.etcsPoints.setText(""+player.ects);
        ui.choice1.setText("ZAGADAJ");
        ui.choice2.setText("POŁODNIE");
        ui.choice3.setText("ZACHÓD");
        ui.choice4.setText("WSCHÓD");

        game.nextPosition1="north";
        game.nextPosition2="south";
        game.nextPosition3="west";
        game.nextPosition4="east";
    }

    public void south() {

        ui.mainTextArea.setText("PRZED TOBĄ SCHODY");
        ui.choice1.setText("IDĘ NA GÓRĘ");
        ui.choice2.setText("PÓŁNOC");
        ui.choice3.setText("ZACHÓD");
        ui.choice4.setText("WSCHÓD");

        game.nextPosition1="north";
        game.nextPosition2="south";
        game.nextPosition3="west";
        game.nextPosition4="east";
    }

    public void east() {

        ui.mainTextArea.setText("PRZED TOBĄ SALA");
        ui.choice1.setText("WEJDŹ DO SALI");
        ui.choice2.setText("PÓŁNOC");
        ui.choice3.setText("ZACHÓD");
        ui.choice4.setText("PÓŁUDNIE");

        game.nextPosition1="north";
        game.nextPosition2="south";
        game.nextPosition3="west";
        game.nextPosition4="east";
    }

    public void west() {

        ui.mainTextArea.setText("WOOOOW!!! \nNA BIURKU PRZED TOBĄ LEŻY\n" +
                "ZWOLNIENIE LEKARSKIE");
        ui.choice1.setText("WEŹ ZWOLNIENIE");
        ui.choice2.setText("PÓŁNOC");
        ui.choice3.setText("WSCHÓD");
        ui.choice4.setText("POŁÓDNIE");

        game.nextPosition1="north";
        game.nextPosition2="south";
        game.nextPosition3="west";
        game.nextPosition4="east";
    }

    public void stairs() {

        ui.mainTextArea.setText("JESTEŚ W WIELKIM SZARYM KORYTARZU.\n NA ŚCIANIE WISI DUŻA TABLICA Z OGŁOSZENIAMI. \n DUŻO ZAMKNIĘTYCH DRZWI.");
        ui.choice1.setText("SPÓJRZ NA TABLICĘ");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1="north";
        game.nextPosition2="south";
        game.nextPosition3="west";
        game.nextPosition4="east";
    }

    public void board() {

        ui. mainTextArea.setText("NA TABLICY WISZĄ RÓŻNE OGŁOSZENIA I ROZKŁĄD ZAJĘĆ");
        ui. choice1.setText("PRZECZYTAJ ROZKŁAD");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1="north";
        game.nextPosition2="south";
        game.nextPosition3="west";
        game.nextPosition4="east";
    }

    public void lessons () {

        ui.mainTextArea.setText("JUŻ ZNASZ SWÓJ ROZKŁAD,\n TERAZ MUSISZ SIĘ POŚPIESZYĆ ŻEBY ZDĄŻYŁ NA ZAJĘCIA\n I NIE DOSTAŁ UJEMNYCH PUNKTÓW");
        ui.choice1.setText("IDŹ ZA ZAJĘCIA");
        ui.choice2.setText("WAGARUJ");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1="north";
        game.nextPosition2="south";
        game.nextPosition3="west";
        game.nextPosition4="east";
    }

    public void firstLesson() {

        ui.mainTextArea.setText("WITAM PAŃSTWA NA PIERWSZYCH ZAJĘCIACH ZE STAR UMLA. DZISIAJ MACIE KOLOKWIUM. PIERWSZE PYTANIE: KTÓRA OCENA JEST LEPSZA: 3- CZY 2+");
        ui.choice1.setText("2+");
        ui.choice2.setText("3-");
        ui.choice3.setText("");
        ui.choice4.setText("Zapisz Progres");

        game.nextPosition1="north";
        game.nextPosition2="south";
        game.nextPosition3="west";
        game.nextPosition4="save";

    }
    public void save() {
        String position ="save";

        ui.mainTextArea.setText("Gra została zapisana");
        ui.choice1.setText("Powróć");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1="firstLesson";
        game.nextPosition2="";
        game.nextPosition3="";
        game.nextPosition4="";

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("save.txt"));
            bw.write(""+player.ects);
            bw.newLine();
            bw.write(position);
            bw.close();
        }
        catch(Exception e){

        }

    }

}
