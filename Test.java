/**
* @author Asia Harris
* @version 10/5/2024
*/
public class Test {
    public static void main (String[] args){
        
        //create two dice objects with 6 sides numbered 1-6

        System.out.println("Risk Simulator Experiment");
        ///Call static method with a parameter of 10,000

        System.out.println("DIstribution Experiment with 2 standard dice 1-6");
        //Call static method with a prameter of 10,000

        System.out.println("Distribution Experiment with 2 non-standard dice 1-8");
        //Mutate existing two dice to be eight sides
        //Call static method with a parameter of 10,000

        /*Risk Simulator Experiment
          Write a static method that will roll the first Dice object three times (attacker) and store the results in a sorted
          array. Then roll the second Dice object two times (defender). The winner is decided by comparing the
          results of the highest roll of defender vs attacker and awarding the winner a point and then comparing the
          second highest roll of defender vs attacker and awarding the winner a point. Should the dice results be
          equal, it is a tie with no winner. Run this experiment 10,000 times and then print the results (See output
          example in the project guide) You will call the DiceArray Method you are created in the Dice Class
          */
        /* Distribution Experiment
          Write a static method that will roll the two Dice objects once each and add the two dice. Run this experiment
          10,000 times and then print the results. (See output example in the project guide) You will call the RollOnce
          Method you created in the Dice Class. Hint: Keep your counts in an array instead of separate variables as
          the output will vary with the number of sides.
        */
    }
}
