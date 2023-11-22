package at.ran.oo.patterns.factory;

public class AlgoFactory {
    
    public static Algorithm geAlgorithm(String os) {
        if (os.equals("Windows")) {
            return new BillGatesAlgo();
        } else {
            return new LinusAlgo();
        }
    }
}
