import java.util.Scanner;


/** 
 * Java program to find if number is even or odd in Java or not. This Java program
 * example demonstrate two ways to check if number is even or odd or not, first example
 * uses modulas or remainder operator denoted by % to see if number is even or not
 * and second operator uses Bitwise AND operator to find if number is even or odd in Java.
 *
 *@author Chaithanya
 */


public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("Enter any number: ");
		
		int number = console.nextInt();
		
		if(number % 2 == 0){
		System.out.printf("Number %d entered is a Even number %n", number);	
		}else{
			System.out.printf("Number %d entered is a Odd number %n", number);
		}
		
        //Finding Even and Odd number using Bitwise AND operator in Java.
        
        System.out.printf("Finding number if its even or odd using bitwise AND operator %n"); 
        //For Even numbers 
        //XXX0 
        //0001 AND 
        //0000 
        
        if( (number&1) == 0){ 
            System.out.printf("Number %d is a even number %n" , number); 
        }else{ 
            System.out.printf("Number %d is a odd number %n", number); 
        } 

	}

}
