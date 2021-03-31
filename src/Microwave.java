//*************************************
// Author: Cole, Dameon
// Course: CMIS 242 7383
// Date :  03/30/2021
// Project Desc: A simple program to model a microwave - Updated
// ************************************

import java.util.Scanner;

public class Microwave {
    //       set boolean
    //    attributes
    private int timer;
    private boolean isWarm;

    //    constructor
    public Microwave(int timer, boolean isWarm) {
        this.timer = timer;
        this.isWarm = isWarm;

    }
    public int getTimer(){
        return this.timer;
    }

    public boolean getIsWarm(){

        System.out.println("Food is warm");
        return this.isWarm;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public void setWarm(boolean warm) {
        isWarm = warm;
    }

    public void cookTimer() {
        Scanner cookTime = new Scanner(System.in);
        System.out.println("Enter time(int) for the cook timer");
        timer = cookTime.nextInt();
        setTimer(timer);

        if (timer >= 70) {
            setWarm(true);
            System.out.println("Food is warm");
        } else{
            System.out.println("Food is still too cold");
        }

    }


}