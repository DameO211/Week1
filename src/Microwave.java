//*************************************
// Author: Cole, Dameon
// Course: CMIS 242 7383
// Date :  03/20/2021
// Project Desc: A simple program to model a microwave
// ************************************

import java.util.Scanner;

public class Microwave {
    //       set boolean
    //    attributes
    private int timer = 0;
    private boolean isWarm = false;

    //    constructor
    public Microwave(int timer, boolean isWarm) {
        this.timer = timer;
        this.isWarm = isWarm;

    }

    public void cookTimer() {
        Scanner cookTime = new Scanner(System.in);
        timer = cookTime.nextInt();


        if (timer >= 70) {
            isWarm = true;
            System.out.println("Food is warm");
        } else System.out.println("Food is still too cold");
    }


    }