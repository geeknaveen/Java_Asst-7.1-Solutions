/* 1) Write a program to convert an int variable to String using an inbuilt function of String class.  */

/*We can convert integer to String in java using String.valueOf() and Integer.toString() methods.

   String.valueOf():::
   The String.valueOf() method converts int to String. The valueOf() is the static method of String class. 
   The signature of valueOf() method is given below:
   public static String valueOf(int i)  */

package asst7_1;     //This java file is inside package named asst7_1 inside src folder.

import java.util.*; //importing all classes from java's util library

public class IntToStringDemo    //Class declaration containing main function. 
{  
private static Scanner sc;
public static void main(String args[])
{  
int i;  //initializing variable i.

//Asking user to enter the integer value.
System.out.println("Enter the integer you want to convert into String: ");

	// For taking input from the user, we have to make the object of Scanner class.
	//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
sc = new Scanner(System.in);
i=sc.nextInt();      //Initializing the int variable by user input values.

//String class has a static method valueOf() which takes dint as argument and converts into string. 
String s=String.valueOf(i);  

System.out.println("\n *********** Converting Integer variable to Integer ********");
System.out.println("Value of Variable i is "+ (i+100)); //300 because + is binary plus operator  
System.out.println("\n *********** Converting Int variable to String using String class ********");
System.out.println("Value of String is " + (s+100));   //200100 because + is string concatenation operator  
sc.close();
}
}  