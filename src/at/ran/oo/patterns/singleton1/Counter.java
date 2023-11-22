package at.ran.oo.patterns.singleton1;

public class Counter {
    private static Counter instance = null;
    private int counter = 0;

    private Counter() {

    }
    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }

    public int getCounter() {
        return counter;
    }

    public void incrementCounter(){
        this.counter++;
    }
}
