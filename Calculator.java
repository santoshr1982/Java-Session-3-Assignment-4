package Calculator;
// This program has been written to make calculator.
import java.util.Scanner;

public class Calculator {

	double dG;									//initialization of variables.
	double dH;
	double dC;
	
	public void Add(double dE, double dF)		// Method to add two numbers.
	{
	
		dG = dE;								//initialization of variables.
		dH = dF;
		
		dC = dE + dF;
		
		System.out.println("The some of two numbers entered by you is : " + dG + " + " + dH + " = " + dC);
		
	}
	
	public void Multiply(double dE, double dF) // Method to multiply.
	{
	
		dG = dE;							//initialization of variables.
		dH = dF;
		
		dC = dE * dF;
		
		System.out.println("The some of two numbers entered by you is : " + dG + " * " + dH + " = " + dC);
		
	}
	
	
	public void Subtract(double dE, double dF)			// Method to Subtract.
	{
	
		dG = dE;										//initialization of variables.
		dH = dF;
		
		dC = dE - dF;
		
		System.out.println("The some of two numbers entered by you is : " + dG + " - " + dH + " = " + dC);
		
	}
	
	
	public void Divide(double dE, double dF)		// Method to divide.
	{
	
		dG = dE;									//initialization of variables.
		dH = dF;
		
		dC = dE / dF;
		
		System.out.println("The some of two numbers entered by you is : " + dG + " / " + dH + " = " + dC);
		
	}
	
	public static void main(String[] args) {
		
		int iChoice = 0;							//initialization of variables.
		double dA;
		double dB;
		
		
		Scanner C = new Scanner(System.in);			// Creating an object for scanner.
		Calculator Calci = new Calculator();		// Creating an object for class. 
		
		while (iChoice < 5)								// while loop to keep the program running until the user exits it.
		{
		System.out.println("1. To add two numbers.");		//Displaying Menu.
		System.out.println("2. To subtract two numbers.");
		System.out.println("3. To divide two numbers.");
		System.out.println("4. To multyply two numbers.");
		System.out.println("5. Exit.");
		
		System.out.println("Enter your choice here (The numbers should be with in 1 - 5 ):");
		iChoice = C.nextInt();							// Accepting the input.

		switch(iChoice)									// Switch case statement.
		
		{
			case 1: System.out.println("Please enter the two number to be added :");
					dA = C.nextDouble();				// Calling add method.
					dB = C.nextDouble();
					Calci.Add(dA,dB);
					break;
					
			case 2: System.out.println("Please enter the two number to be subtracted :");
					dA = C.nextDouble();				// Calling subtract method.
					dB = C.nextDouble();
					Calci.Subtract(dA,dB);	
					break;
					
			case 3: System.out.println("Please enter the two number to be divided :");
					dA = C.nextDouble();			// Calling divide method.
					dB = C.nextDouble();
					Calci.Divide(dA,dB);
					break;
									
			case 4: System.out.println("Please enter the two number to be multyplied :");
					dA = C.nextDouble();		// Calling multiply method.
					dB = C.nextDouble();
					Calci.Multiply(dA,dB);
					break;
					
			case 5: break;						// To exit program.
			
			default: System.out.println("Enter a valid number and rerun the program again.");
					 break;
		}
	}
	}	
	
}
