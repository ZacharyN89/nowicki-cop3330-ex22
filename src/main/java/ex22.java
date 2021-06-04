/*
Exercise 22 - Comparing Numbers

Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.
Example Output

Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint

    Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges

    Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
    Modify the program so that it asks for ten numbers instead of three.
    Modify the program so that it asks for an unlimited number of numbers.
*/

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args){
        Scanner cursor = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int first = Integer.parseInt(cursor.nextLine());

        System.out.print("Enter the second number: ");
        int second = Integer.parseInt(cursor.nextLine());

        System.out.print("Enter the third number: ");
        int third = Integer.parseInt(cursor.nextLine());

        if(first != second && second != third && third != first){
            int largest = 0;
            if(first > largest){
                largest = first;
            }
            if(second > largest){
                largest = second;
            }
            if(third > largest){
                largest = third;
            }
            System.out.println("The largest number is " + largest + ".");
        }
    }
}
