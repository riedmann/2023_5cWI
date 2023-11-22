package at.ran.oo.patterns.factory;

public class BillGatesAlgo implements Algorithm {

    @Override
    public String encrypt(String text) {
       return text + " Bill";
    }
    
}
