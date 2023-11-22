package at.ran.oo.interf;

import java.util.Random;

public abstract class AbstractWeightable implements Weightable{
    
    public double calculate(){
        Random random = new Random();;
        return random.nextDouble();
    }

   
    
    
}
