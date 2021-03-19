import java.util.Scanner;

public class Microwave {
//    attributes
    public int timer;
    public boolean isWarm;

//    constructor
    public Microwave() {
        this.timer = timer;

//        if food is warm or cold
        isWarm = false;
    }

    public void cookTimer(){
        Scanner cookTime = new Scanner(System.in);
        timer = cookTime.nextInt();


        if(this.timer>=70) {
            isWarm = true;
            System.out.println("Food is warm");
        }
        else System.out.println("Food is still too cold");
    }

    public static class Driver{
        public static void main(String[] args){
            Microwave GE = new Microwave();
            GE.cookTimer();
        }
    }
}
