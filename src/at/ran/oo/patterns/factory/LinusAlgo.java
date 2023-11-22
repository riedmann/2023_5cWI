package at.ran.oo.patterns.factory;

public class LinusAlgo implements Algorithm {

    @Override
    public String encrypt(String text) {
        return text + " Linus";
    }

}
