package at.ran.oo.interf;

import java.util.Random;

import at.ran.oo.java.Summable;

public class Stone extends AbstractWeightable implements Weightable,Paintable, Summable {
    public void lay() {
        System.out.println("I am laying here");
    }

    @Override
    public double getWeight() {

        return calculate();
    }

    @Override
    public void paintYourself() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'paintYourself'");
    }

    @Override
    public int getValue() {
       return 7;
    }
}
