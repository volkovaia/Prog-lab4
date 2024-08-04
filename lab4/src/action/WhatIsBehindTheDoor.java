package action;

public class WhatIsBehindTheDoor{
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
}