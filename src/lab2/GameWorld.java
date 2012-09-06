package lab2;

/**
 *
 * @author Jwilliams96
 */
public class GameWorld {
    
    private String characterLocation = "0000x0000";
    private GameCharacter mainCharacter;
    private String savedGameFileName;

    public GameWorld(GameCharacter mainCharacter) {
        this.mainCharacter = mainCharacter;
    }
    
    public void attack(){
        //random attack phase
    }
    
    public void rest(){
        //rejouvinate your stats.
    }
}
