

/**
 * Write a description of class RollingDice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
 
public class RollingDice
{
   public static void main (String[] args)
   {
          Random generator = new Random();
          int dice1, dice2; 
 
          dice1 = generator.nextInt(7) + 1;
 
          dice2 = generator.nextInt(7) + 1;
 
          System.out.println ("You rolled a " + dice1 + " and " + dice2);
          System.out.println("The sum is " + (dice1 + dice2)); 
        }
}