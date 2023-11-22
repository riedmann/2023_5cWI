package at.ran.oo.patterns.singleton1;

public class Car {
    public static int amountOfTyres = 4;
    private String color;

    public Car(String color){
        this.color = color;
    }

    public String getColor() {
        Counter.getInstance().incrementCounter();
        return color;

    }

    
}
