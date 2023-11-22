package at.ran.oo.java;

import java.util.ArrayList;

import at.ran.oo.interf.Weightable;

public class RiedmannSupermanList<E extends Weightable> extends ArrayList<E>{

    public RiedmannSupermanList(){
        super();
    }

    public void printAllItemsWeight(){
        for (E weight : this) {
            System.out.println(weight.getWeight());
        }
    }
   

}
