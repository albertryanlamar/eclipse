package day1;

import java.util.Scanner;

public class print_tutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* System.out.println("Hello world");
        System.out.println("This is tutorial in java");
        System.out.println("Thanks");*/
      
        
       /* int num1 = 10;
        String name = "JUDE";
        char c = 'c';
        double quotient = 12323.0000;
        float myFloat = 3.14f;
        
        System.out.println(num1);
        
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter an fist number: ");

        // Read an integer from the user
        int userInput1 = scanner.nextInt();
        
        System.out.print("Enter an second number: ");

        // Read an integer from the user
        int userInput2 = scanner.nextInt();
        
      

        // Display the input
       // System.out.println("You entered: " + userInput);

        // Close the Scanner to release resources (not mandatory, but good practice)
        scanner.close();  */


       /* make a program that input first name, middle name and last name
        and display/output your full name 
        
        Example Output: My full name is firstname middlename lastname */
        
        
        // arithmetic operations
        
        //subtraction
        
        
		/*  int num12 = 2;
        int num2 = 3;
        
        System.out.println(num12 / num2);
        //other way
        
        int result = num12 + num2;//declare a varibale that store the result of two numbers
        int result2 = 4;
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter  a day:");

        // Read an integer from the user
      //int day1 = scanner.nextInt();
        
       // scanner.close();

        // if statement
        //and operator
        
        //(condition1=true) and (condition2 =true) == true 
        //(condition1=false) and (condition2 =false) == false
        
        // OR operator ||
       // (condition1=true) || (condition2=true) = true
        //(condition1=true) || (condition2=false) = true	
        //(condition1=false) || (condition2=false) = false
        
        
        if(result <= 2 && result2 == 4) {
            System.out.println(result + " " + result2);
        }

        else {
        	System.out.println("Result is not <= 2");
        }
        
      int a = 0;  
      while(a < 5) {
    	  System.out.println(a);
    	  a++;  	  
      }
        
        
        
        }*/

	
	// Write a program that prompts the user to input a number from 0-10. It should then print 
	 //  the multiplication table of that number. Use any loops. Incorporate the if else / switch condtion.
		
          Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter a number or letter: ");
		String Name = " ";
		
		if (scanner.hasNextInt()) 
		{
			int a = scanner.nextInt();
			if (a <= 10) 
			{
				if (a % 2 == 0)//even numbers
				{
					switch(a) 
					{
					case 2:
						Name ="Two";
						 break;
					case 4:
						Name ="Four";
						 break;
					case 6:
						Name = "Six";
						 break;
					case 8:
						Name ="Eight";
						 break;	
					case 10:
						Name = "Ten";
						 break;	 
						 
						 default:
						 System.out.println("Invalid Input");
					}
					System.out.println(""+ "Even number is " + Name);
				}
				else {  //for odd numbers
					System.out.println("Odd number" + a);
				}
			}
			else {
				System.out.println("Invalid input");
			}
			
		}
		
		else // if the input was letter
		{
            // If it's not a number, check if it's a letter  
            String userInput = scanner.next(); 
                            
            char letter = userInput.toUpperCase().charAt(0);
            
            if (letter >= 'A' && letter <= 'Z') 
            {
            	for(char currentletter ='A'; currentletter <= letter; currentletter++) {
            		System.out.print(currentletter + " ");
            	}
            }
		}
			
			
			
			
			 

				
	}
}
