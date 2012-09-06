package lab2;

/**
 *
 * @author Jwilliams96
 */
public class Game {

    public Game(String firstCharacter, boolean isMale, boolean randomAll) {

        GameCharacter mainCharacter = new GameCharacter(firstCharacter, 
                isMale, randomAll);
        GameWorld myGame = new GameWorld(mainCharacter);
    }

    //where you load your previous saved game
    public void loadSavedGame(){
        
    }
    
    public void deleteSavedGame(){
        
    }
}
