package at.ran.oo.java;

import at.ran.oo.interf.Tree;

public class Main {
        public static void main(String[] args) {
                RiedmannSupermanList<Tree> myList = new RiedmannSupermanList<Tree>();

                myList.add(new Tree());
                myList.add(new Tree());

                myList.printAllItemsWeight();
               

                

        }
}
