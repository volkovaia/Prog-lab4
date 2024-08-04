package characters;

import action.LittleBoyMoovies;
import exceptions.*;

public class LittleBoy implements LittleBoyMoovies {
    /*
    public void sitInRoom();
    public void openDoor();
    public void tryToUnderstandWhatTheySaid();
    public void goToTheWindow();
     */
    public void sitInRoom(){
        System.out.println("Малыш сидел в своей комнате, и притом совершенно бесплатно");
    }
    public void tryToUnderstandWhatTheySaid(){
        System.out.println("Малыш постарался уловить, о чём они говорят, но это ему не удалось");
    }
    public void goToTheWindow(){
        System.out.println("Тогда он подошёл к окну");
    }
    /*public class OpenDoor() {
        public void openDoor() {
            System.out.println("Когда он приоткрывал дверь, ");
            class BehindDoor {
                public void GibberingWasHeard() {
                    System.out.println("до него донеслось невнятное бормотание из столовой");
                }
            }
                BehindDoor behindDoor = new BehindDoor();
                behindDoor.GibberingWasHeard();

        }
    }*/

    String name;
    public boolean isFightContinues;
    public boolean isFightEnded;

    public LittleBoy(String name) {
        this.name = name;
    }

    public void fightContinues() {
        System.out.println("Драка продолжается");
        isFightContinues = false;
    }

    public void fightEnded() {
        System.out.println("Драка закончилась");
        isFightEnded = true;
    }

    public void fightingInTheStreet() throws FightSupervision {
        System.out.println("Не скучно ли Малышу?");
        if (isFightContinues) {
            System.out.println("Малышу интересно");
        } else {
            throw new FightSupervision(name + " потерял интерес");
        }
    }
    public void forgotToCreateClass() throws RuntimeException {
        System.out.println("Вы забыли создать класс");
    }
}