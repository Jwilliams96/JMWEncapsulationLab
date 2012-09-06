package lab2;

import java.util.Random;

/**
 *
 * @author Jwilliams96
 */
public class GameCharacter {

    private enum ClassType {

        WOOD_ELF, DRUID, HUMAN, DWARF, ORC, DARK_ELF
    }
    private String characterName;
    private double characterHealth;
    
    //Whether or not the character is a male.
    private boolean isMale; 
    
    //Whether or not the all info will be randomized.
    private boolean randomAll; 
    
    //stat info
    private int characterStrength;
    private int characterIntelligence;
    private int characterCharisma;
    private int characterEndurance;
    private int characterDexterity;
    private int characterSpeechCraft;
    private double characterMagicka;
    private int skillPoints = 60;
    
    private ClassType characterClass;
    private Random randomValue = new Random(System.nanoTime());

    public GameCharacter(String characterName, boolean isMale,
            boolean randomAll) {
        this.characterName = characterName;
        this.isMale = isMale;
        this.randomAll = randomAll;

        this.randomStats();
        this.chooseCharacterType();
    }

    /*
     * you would first start out by randomizing each of your stats with
     * in 6-10 points. then add each point that was not added in 
     * immediately randomly to the rest of the choices till no more 
     * skill points remain.
     */
    private void randomStats() {
        characterSpeechCraft = randomValue.nextInt(6) + 6;
        skillPoints -= characterSpeechCraft;

        characterDexterity = randomValue.nextInt(6) + 6;
        skillPoints -= characterDexterity;

        characterEndurance = randomValue.nextInt(6) + 6;
        skillPoints -= characterEndurance;

        characterCharisma = randomValue.nextInt(6) + 6;
        skillPoints -= characterCharisma;

        characterIntelligence = randomValue.nextInt(6) + 6;
        skillPoints -= characterIntelligence;

        characterStrength = randomValue.nextInt(6) + 6;
        skillPoints -= characterStrength;

        while (skillPoints > 0) {
            characterStrength = randomValue.nextInt(skillPoints + 1);
            skillPoints -= characterStrength;

            characterIntelligence = 
                    randomValue.nextInt(skillPoints + 1);
            skillPoints -= characterIntelligence;

            characterCharisma = randomValue.nextInt(skillPoints + 1);
            skillPoints -= characterCharisma;

            characterEndurance = randomValue.nextInt(skillPoints + 1);
            skillPoints -= characterEndurance;

            characterDexterity = randomValue.nextInt(skillPoints + 1);
            skillPoints -= characterDexterity;

            characterSpeechCraft =
                    randomValue.nextInt(skillPoints + 1);
            skillPoints -= characterSpeechCraft;
        }

    }

    private void chooseCharacterType() {
        if (randomAll) {
            int i = randomValue.nextInt(7);
            
            //you would do the class types then add or sub attributes
            switch (i){
                case 1:
                    characterClass = ClassType.WOOD_ELF;
                    this.characterDexterity++;
                    this.characterStrength--;
                case 2:
                    //and so on and so on
            }
        } else {
            /*this is where you would load the GUI for the user
             * to chose his class from the GUI class
             */
        }
    }
}
