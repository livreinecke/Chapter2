
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            int length, width, height;//declare integers length, width, and height;
            double totalSqFT;//declare double totalSqFt;
            double paintNeeded;//declare double paintNeeded;
 
            length = 15;//Declare and initialize the length of the room
 
            width = 11;//Declare and initialize the width of the room
 
            height = 8;//Declare and initialize the height of the room
 
            totalSqFT = (2*(length * height)) + (2*(width*height)) +(width*length);//Compute the total square feet to be painted--think
            paintNeeded = totalSqFT / 350;//about the dimensions of each wall
 
            paintNeeded = Math.ceil(paintNeeded);//Compute the amount of paint needed
             
            System.out.print("You will need " + paintNeeded + "gallons of paint."); //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
        }
}
