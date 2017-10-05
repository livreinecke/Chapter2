//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            Scanner keyboard = new Scanner(System.in);
            
            int legnth, width, height; 
            
            legnth = 15;
            width = 11;
            height = 8;
           
            //declare double totalSqFt;
            
            double totalSqFt;
            totalSqFt = ((legnth * height * 2)+(height*width*2) + (legnth*width*2));
            
            double windows;
            windows = keyboard.nextDouble();
            double doors;
            doors = keyboard.nextDouble();
            
            //declare double paintNeeded;
            double paintNeeded;
            paintNeeded = totalSqFt/350;
            
            
 
            //Declare and initialize the length of the room
 
            //Declare and initialize the width of the room
 
            //Declare and initialize the height of the room
 
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
 
            //Compute the amount of paint needed
 
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            
            System.out.println ("Height:"+ height);
            System.out.println ("Width:"+ width);
            System.out.println ("Legnth:"+ legnth);
            System.out.println ("Paint needed:"+ paintNeeded + "gallons");
        }
}