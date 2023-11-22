package at.ran.oo.patterns.singleton;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Counter c1 = Counter.getInstance();
        Counter c2 = Counter.getInstance();


        List<Observer> observers = new ArrayList<Observer>();
        observers.add(c1);
        observers.add(c2);
        observers.add(new HeatController());

        for (Observer observer : observers) {
            observer.inform();
        }

        System.out.println(c2.getCount());

    }
}
