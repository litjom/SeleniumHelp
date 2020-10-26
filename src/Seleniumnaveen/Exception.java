package Seleniumnaveen;

import java.util.InputMismatchException;

public class Exception {

	public static void main(String[] args) {
/*Exception -	Eception is abnormal condition
	In java also exception is abnormal scenario will stop the execution of the current progrma
In plain defintino excption is a class*/
		
//Exception is hadinling is way  to handle  runtime/compile time errors such as
//IOException, arithmeticException and so on
//Excetion handing is to maintain the flow	
//# types of EXCEPTION
//CHECKED EXCEPTION- checked exceptions are checked at compile time/Or writiin the code
//Unless you handle them, you wont be able to compile the code itself
//UNCHECKED EXCEPTIONS- exceptions that are not checked at at compile-time
//rather they are cheked at run time meaning when you write code theres no exception
//but when you run it theres is exception eg nullpointer , indexoutofbond exception
//ERROR-out of memory error, vitual machinerror, assertion error
		

//TRY - CATCH are reserve words that will help you  handle exception

		
//TRY BLOCK- You need write the code that might throw the exception
//JAVA TRY blcok must be followed by either catch or finally block

//CATCH BLOCK -You need write whic class or which exception if you dont know the exception
//You need show whci parent class of class it is
		
		System.out.println("Start");
	
	try {
		int c = 10/0;	
		System.out.println("Div result is"+c );
//Within try catch you should write piece of code that throws exception
	} catch (ArithmeticException e) 
	{
//Imside catch bracket write what exception its throwing
//After writing what exception itis . Store it in an object
		// TODO: handle exception
	System.out.println("Something wnet wront check the exception+"+e.getMessage());
System.out.println("Seems you have entered zero, Please provied value grater than 0");
	}
	//What if you dont know the name of exception- you should give CATCH
	catch(InputMismatchException e)
	{
		System.out.println("Please enter only integer values");
	}
	
	catch (Exception e) {
		System.out.println("Something went wront");
		//PARENT CLASS- ALways last other wise rest of the code will be DEAD CODE
		//Meaning non of them get excetuted everything will be handled by parent code
	}
	
	
	finally {
		//Finall yis imp so everytime you run something you have to close it
		System.out.println("Finally blocked");
		System.out.println("End");
	}
	
	
	
	System.out.println("End");
//10 divide by 0 is infinite and we cannot store in variable c so exception will be trhown
	
//Arithmetic expction will be thrown
//So you code is completing
	//DEAD CODE is code that will never get exceuted becasue it will be exceuted by parent class
	//Make sure parent class comes last


	}

}
