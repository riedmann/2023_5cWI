package at.ran.oo.games;

import java.util.stream.BaseStream;

import at.ran.oo.games.framework.BasicGame;
import at.ran.oo.games.framework.GameContainer;

public class MyGame implements BasicGame{

    @Override
    public void update() {
     System.out.println("update");
    }

    @Override
    public void rende() {
      System.out.println("render");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        MyGame game = new MyGame();
        GameContainer gc = new GameContainer(game);
        gc.start();
    }
    
}
