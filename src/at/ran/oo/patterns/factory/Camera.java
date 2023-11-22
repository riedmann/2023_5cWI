package at.ran.oo.patterns.factory;

public class Camera {
   
    

    public void saveImage(String image){
        Algorithm algorithm =  AlgoFactory.geAlgorithm("Win");

        System.out.println(algorithm.encrypt(image));
    }
}
