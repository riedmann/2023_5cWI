package at.ran.oo.patterns.singleton;

public class Counter1 implements Observer{
    private static int count;

    public static void incrementCounter(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void inform() {
        count++;
    }
}
