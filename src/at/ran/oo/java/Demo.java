package at.ran.oo.java;

public class Demo {
    public static void main(String[] args) {
        Car c1 = new Car(123, "green");
        Car c2 = new Car(123, "red");

        if (c1.equals(c2)){
            System.out.println("True");
        }

        Car c3 = c2;

        if (c3==c2){
            System.out.println("eauql");
        }

        String t1 = "Hans";
        String t2 = "Hans";

        t2 = "susi";
        t2 += "-";
        t2 +="-";

        if (t1==t2){
            System.out.println("Jippi");
        }

        // primitves
        /// byte short int long float double boolean char
    }

}
