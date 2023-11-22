package at.ran.oo.games.framework;

public class GameContainer {
    private BasicGame game;

    public GameContainer(BasicGame game) {
        this.game = game;
        
    }

    public void start(){
        while(true){
            game.update();
            game.rende();;
        }
    }
    
}
