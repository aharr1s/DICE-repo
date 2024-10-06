import java.util.Arrays;
import java.util.Random;
/**
* @author Asia Harris
* @version 10/5/2024
*/

public class Dice {
    private int sides;
    private Random random;

    public Dice (int sides){
        this.sides=sides;
        this.random = new Random(); //Intializes the Random object
    }

    //Write a mutator method for the instance variable
    public void setSides(int sides){
        this.sides = sides;
    }
    //Write an accessor method for the instance variable
    public int getSides(){
        return sides;
    }
    //Write a DiceArray Method to roll your Dice object once
    //Parameter will be the number of rolls;
    //The return with be an array holding the results sorted from low to high
    public int[] DiceArray(int numRolls){
        int[] result = new int[numRolls];

        for(int i = 0;  i < numRolls; i++){
            result[i]= RollOnce(); //Rolls the dice and stores the result
        }
        Arrays.sort(result); //Sorts the result array from low to high
        return result;  //Returns sorted result
    }
    //Write a RollOnce Method to roll your Dice object once
    //No parameter
    //Return will be the integer Dice value
    public int RollOnce(){
        return random.nextInt(sides) + 1; //Generate a random number between 1 and sides
    }
}
