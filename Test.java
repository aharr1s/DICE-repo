import java.util.Arrays;
/**
* @author Asia Harris
* @version 10/5/2024
*/
public class Test {
    public static void main (String[] args){
        //create two dice objects with 6 sides numbered 1-6
        Dice firstDice = new Dice(6);
        Dice secondDice = new Dice(6);

        System.out.println("Risk Simulator Experiment");
        ///Call static method with a parameter of 10,000
        Test.RiskSim(10000);

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
        public static void RiskSim(int times){
            int attackerScore =  0;
            int defenderScore = 0;
            int[] attackerArr = new int[3];
            int[] defenderArr = new int[2];
            for(int i = 0; i < 3; i++){
                attackerArr[i] = firstDice.RollOnce(); //Stores all three of the attacker's rolls
            }
            Arrays.sort(attackerArr); //Sorts rolls low to high
            for(int i = 0; i < 2;  i++){
                defenderArr[i] = secondDice.RollOnce(); //Stores all three of the defender's rolls
            }
            Arrays.sort(defenderArr); //Sorts rolls low to high
            for(int j = 2; j > 0; j++){ //Comparing dice rolls from high to low
                if(attackerArr[j] > defenderArr[j]){
                    attackerScore += 1;  //If attacker has a high roll, they get one point
                }
                else if(attackerArr[j] < defenderArr[j]){
                    defenderScore += 1; //If defender has a high roll, they get one point
                }
            }
            System.out.println("Attacker Score: " + attackerScore); //Print attackerScore
            System.out.println("Defender Score: " + defenderScore);  //Print defenderScore

            if(attackerScore > defenderScore){
                System.out.println("Attacker wins!"); //Prints out winner
            }
            else if(attackerScore < defenderScore){
                System.out.println("Defender wins!");  // Prints out winner
            }
            else{
                System.out.println("It's a tie!")  //Prints out tie in case neither score is higher than the other
            }
        }

        /* Distribution Experiment
          Write a static method that will roll the two Dice objects once each and add the two dice. Run this experiment
          10,000 times and then print the results. (See output example in the project guide) You will call the RollOnce
          Method you created in the Dice Class. Hint: Keep your counts in an array instead of separate variables as
          the output will vary with the number of sides.
        */
    }
}
