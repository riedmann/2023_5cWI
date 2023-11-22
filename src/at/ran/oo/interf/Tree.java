package at.ran.oo.interf;

import java.util.Random;

public class Tree extends AbstractWeightable implements Weightable{
    public void stand(){
        System.out.println("I am standing");
    }



    @Override
    public double getWeight() {
        return calculate();
    }


}
