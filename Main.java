import java.util.Scanner;
/**
 * a program that will populate a 10 element array (put values into an array) with integers. Once the array is full, have your program find the largest value inside of that array.
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner 
		Scanner input = new Scanner(System.in);
		//output the message to user
		System.out.println("Please enter in 10 integers to put into the array");
		//make an array
		int [] integers = new int[10];
		//loops the code 10 times
		for(int i = 0; i < 10; i++){
			//loops code to get the value 10 times
			integers[i] = input.nextInt();
		}
    //initialize biggest value
		int biggestvalue = 0;
		//loops code until the biggest number is identified and then prints it accordingly
		for(int j = 0; j < integers.length; j++){
			if (biggestvalue < integers[j])
				biggestvalue = integers[j];
			} 
		System.out.println("The largest number is " + biggestvalue);
  }
}
