package at.ran.oo.patterns.singleton;

public class HeatController implements Observer {

    @Override
    public void inform() {
      System.out.println("Heat controller informed");
    }
    
}
