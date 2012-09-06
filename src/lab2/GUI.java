package lab2;

/**
 *
 * @author Jwilliams96
 */
public class GUI {

    private int resolutionHeight;
    private int resolutionWidth;
    
    //amount of blocks of graphics to dev. the map with
    private int heightBlockAmount = 8;
    private int widthBlockAmount = 6;

    private void calculateBlockAmount() {
        
        //you would use a much more sophisticated method to figure out how many 
        if (this.resolutionHeight / this.resolutionWidth == 4 / 3) {
            //use the amount of resolution to decide how many blocks of images
        } else{
            
        }
    }

    public void generateMap() {

        this.calculateBlockAmount();
        for (int i = 0; i < this.resolutionHeight
                / this.heightBlockAmount; i++) {

            for (int j = 0; j < this.resolutionWidth
                    / this.widthBlockAmount; j++) {
            }
        }
    }
    
    public void generateUserInterface(){
        /*
         * put a picture of a 4 directional path, two action bottons and 
         * intentory with customizable options for each item
         */ 
    }
    
    public void choseClassType(){
        
        /*
         * lets user chose class type if they want
         */
    }
}
