package at.ran.oo.interf;

public class Main {
    public static void main(String[] args) {
        Stone s = new Stone();
        Tree tree = new Tree();
        Tree tree2 = new Tree();

        Scale scale = new Scale();

        scale.addWeightable(tree);
        scale.addWeightable(s);
        scale.addWeightable(tree2);

        System.out.println(scale.getSum());
        
    }
}
