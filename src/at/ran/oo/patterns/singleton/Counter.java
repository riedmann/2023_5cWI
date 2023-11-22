package at.ran.oo.patterns.singleton;

public class Counter implements Observer{
    private int count = 0;
    private static Counter instance = null;

    private Counter() {
    }

    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }

        return instance;
    }

    public void incrementCounter() {
        this.count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void inform() {
       incrementCounter();
       System.out.println("Yeah incremented");
    }
}
