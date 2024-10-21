
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/16/2020 
Assignment: Lab 6
Description: The Use of Loops/Iteration
*/
import java.io.Console;
import java.util.Scanner;

public class GradeStatisticsDriver {

    //Setup the Main Method (this is what will run your code)
    public static void main(String[] args) {

        //Create a way to get console input using the Scanner Class
        Scanner input = new Scanner(System.in); //complete this statment

        //Prompt the User to input the Number of Classes they are inputting
        System.out.print("Please enter the quantity of classes: ");
        int classQuantity = input.nextInt(); //complete this statement

        //Setup a for loop to iterate until the user has been asked for the data for every class
        /*Write a for loop declaration here using the variable i for the value of iteration YOU MUST USE i as the value of iteration*/
        for (int i = 0; i < classQuantity; i++) {
            //Let the user know they are inputting for the next class
            System.out.println("Please Provide input for class: " + i);
            //Declare and Instantiate Variables to Store the Running Calculations for count, sum, average, max & min values your variables must be named: count, sum, average, max & min ... ask a TA if you have questions
            //the type of sum is important ... hint: if our input values are ints and these will be added to the sum then sum is of type _________

            //These will be set in the while loop on the first iteration no matter what
            //but to keep Eclipse from Screaming that there is an error ... these are set to 0
            int max = 0;
            int min = 100;
            int sum = 0;
            int count = 0;
            float average;

            //Use a while loop to look at the items from a scanner:
            /*Write a While loop declaration here that continues to get the next input (refer to the pdf document for help)*/
            while (true) { /*WHILE DECLARATION HERE*/
                //this code is inside the while loop....
                //get the input value
                int inputValue = input.nextInt();

                /*if we recieve a -1.0 then we should "BREAK the loop" Break is a keyword ... do not worry too much about it but know that when
                 this word is seen it instructs the code to exit the while loop ignoring all the code inside the while loop after the word.
                */
                if (inputValue == -1) {
                    break;
                }

                if (inputValue < min) {
                    min = inputValue;
                }

                if (inputValue > max) {
                    max = inputValue;
                }

                // If this is our first item (then the count is zero) we can use this fact to set the max and min to their initial values

                /*Set the max and min to the input value here if it is the first input*/

                //We then check if the current input value is less than our current min and if it is then it becomes our new min
                //We then check if the current input value is greater than our current max and if it is then it becomes our new max

                /* Look at the min example above and complete that for the maximum*/

                //Next we add the value to our running sum: x
                sum = sum + inputValue;
                // sum += inputValue;
                /*Write code for that
                           
                //Next increment the count (see the pdf document for help)
                /*Write code for that */
                count = count+1;
                // count += 1;
                // count ++;


            } //end of while Loop
            if (count != 0) { //so if we iterated over at least one value
                //Calculate the Average here; be sure to do true division NOT integer division

                average=(float)sum/count;


                /* Print the Data to the Screen
                  Now that we have Gathered all the data for the current class we should print it out to the screen
                  DO NOT concern yourself with this code! you will learn this later ... this is just so your data is nicely printed to the screen
                */
                System.out.printf("Class [%d]: Sum=%5d, Average=%5.3f, Max=%5d, Min=%d, Count=%d %n",i,sum,average,max,min,count);

            } else {
                /* do not worry about this line either*/
                System.out.printf("No Values were entered for Class[%d]%n",i);
            }
        }

     //end of for loop
    //Close the scanner
    input.close();
    System.out.println("Finished With all classes");
} //end of main method

} //end of class