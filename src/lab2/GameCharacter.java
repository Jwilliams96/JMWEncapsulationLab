package lab2;

/**
 *
 * @author Jwilliams96
 */
public class GameCharacter {
    private String characterName;
    private double characterHealth;
    private boolean isMale; //Whether or not the character is a male.
    private int characterStrength;
    private int characterIntelligence;
    private int characterCharisma;
    private int characterEndurance;
    private int characterDexterity;
    private int characterSpeechCraft;
    private double characterMagicka;

    public GameCharacter(String characterName, boolean isMale) {
        this.characterName = characterName;
        this.isMale = isMale;
        this.randomStats();
    }
    
    
    private void randomStats(){
        
    }
}
