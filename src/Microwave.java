//*************************************
// Author: Cole, Dameon
// Course: CMIS 242 7383
// Date :  03/20/2021
// ************************************

import java.util.Scanner;

public class Microwave {
    //       set boolean
    //    attributes
    public int timer = 0;
    public boolean isWarm = false;

    //    constructor
    public Microwave() {

    }

    public void cookTimer() {
        Scanner cookTime = new Scanner(System.in);
        timer = cookTime.nextInt();


        if (timer >= 70) {
            isWarm = true;
            System.out.println("Food is warm");
        } else System.out.println("Food is still too cold");
    }

    public static class Driver {
        public static void main(String[] args) {
            Microwave GE = new Microwave();
            GE.cookTimer();
        }
    }
}