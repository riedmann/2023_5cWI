package at.ran.oo.patterns.singleton1;

public class Main {
    public static void main(String[] args) {
        Counter c1 = Counter.getInstance();
       

        c1.incrementCounter();

        Car car1 = new Car("orange");
        car1.getColor();
      

        System.out.println(c1.getCounter());

     
    }
}
