package at.ran.oo.interf;

import java.util.ArrayList;
import java.util.List;

public class Scale {
    private List<Weightable> weightables = new ArrayList<>();

    public void addWeightable(Weightable weightable) {
        this.weightables.add(weightable);
    }

    public double getSum(){
        double sum = 0;
        for (Weightable weightable : weightables) {
            sum += weightable.getWeight();
        }
        return sum;
    }

}
