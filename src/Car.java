public class Car {

    public String Make;
    public String Model;

    Car(String Make, String Model){
        Model = Model;
        Make = Make;
    }

    public void  Horn(){
        System.out.println("Beep");

    }


    public static void main(String []args){
        Car Ford = new Car("Ford", "Mustang");
        Ford.Horn();
    }
}

/*Model a real life object as a Java class with at least one attribute and an instance method.
    Write a main method to create an instance of the class, assign a value to the attribute, call your method,
    and demonstrate that the value of the attribute changed and that the method successfully completed what
    it was supposed to do. Submit your program as an attached  .java file and post a screen shot to show that
    you have been able to successfully run that program.*/