import action.ChangeTheView;
import action.SeeInDifferentWays;
import action.WhatIsBehindTheDoor;
import exceptions.FightSupervision;
import characters.*;
import street.*;
import street.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LittleBoy littleBoy = new LittleBoy("Малыш");
        WhatIsBehindTheDoor whatIsBehindTheDoor = new WhatIsBehindTheDoor();
        ChangeTheView changeTheView = new ChangeTheView();
        Betan betan = new Betan("Бетан", "Свантесон", "14");
        //BoysAtTheEntrance boysAtTheEntrance = new BoysAtTheEntrance();
        //WhetherFriendsAreOutside whetherFriendsAreOutside = new WhetherFriendsAreOutside();
        //StreetContains.FriendsOnTheStreet friendsOnTheStreet = new StreetContains.FriendsOnTheStreet("Vulkanusgatan 1", "Дома", "Кристофер и Гунилла");
        //System.out.println(friendsOnTheStreet);

        //anonim class
        HeroesWhoGoesSomewhere parents = new HeroesWhoGoesSomewhere(){
            @Override
            public void name() {
                System.out.println("мама с папой");
            }
            public void left(){
                System.out.println("отправились в кино");
            }
        };



        HeroesWhoGoesSomewhere bosse = new HeroesWhoGoesSomewhere();

        //littleBoy.forgotToCreateClass();
        littleBoy.goToTheWindow();
        whatIsBehindTheDoor.openDoor();
        changeTheView.Change(SeeInDifferentWays.LookDown);

        betan.toMakeBetanAngry();
        parents.name();
        parents.left();
        bosse.name();
        bosse.left();
        littleBoy.sitInRoom();
        whatIsBehindTheDoor.openDoor();
        betan.talkWithPelle();
        littleBoy.tryToUnderstandWhatTheySaid();
        littleBoy.goToTheWindow();
        changeTheView.Change(SeeInDifferentWays.GazeIntoTheTwilight);
        changeTheView.Change(SeeInDifferentWays.LookDown);
        StreetContains.FriendsOnTheStreet friendsOnTheStreet = new StreetContains.FriendsOnTheStreet("Vulkanusgatan 12", "дома под окном", "Кристофер и Гунилла");
        friendsOnTheStreet.toString();
        StreetContains.BoysAtTheEntrance boysAtTheEntrance = new StreetContains.BoysAtTheEntrance("Vulkanusgatan 12", "подъезд", "Мальчишки");
        boysAtTheEntrance.toString();
        littleBoy.fightContinues();
        littleBoy.fightEnded();
        try {
            littleBoy.fightingInTheStreet();
        } catch (FightSupervision e){
            System.out.println(e.getMessage());
            System.out.println("Драка продолжается? " + littleBoy.isFightContinues + "\r\nДрака закончилась? " + littleBoy.isFightEnded);

        }


    }
}