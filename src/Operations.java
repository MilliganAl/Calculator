import java.util.Scanner;

/**
 * @author Alec Milligan
 * 
 *
 */
public  class Operations {
/**
 * @param Scanner scanner
 * @param String prompt
 * @param String userInputString
 * @param double userInputDouble
 * @return userInputDouble
 */
 // method for taking the users input , this method will be applied to both firstNumber and secondNumber
		public static double takeUserInput(Scanner scanner , String prompt , String userInputString  , double userInputDouble) {
			  
			boolean change = true;
			
			while(change) {
			
		 		System.out.println(prompt);	        	
			    userInputString =scanner.next();//user will enter the first Number they want to calculate	
				
				
				if (userInputString.equalsIgnoreCase("pi")) { 
						
					        userInputDouble = Math.PI;//if the user types "pi" the calculator will use Math.PI
		        }	        	
					
				else {
					if(userInputString.equalsIgnoreCase("help")) { // basic HELP function 
			    			
			    		System.out.println("Please enter a number \n");
			    		change = false;
			    	}
					
					  try {
						   
						  userInputDouble = Double.parseDouble(userInputString);//the calculator will continue to convert whatever string the user entered into a double
					        return userInputDouble;
					  }
					  catch(NumberFormatException e){ 
					   System.out.print(" Enter a VALID NUMBER : \n \n \n \n"); // will activate if the user needs help as well if they enter a letter or an invalid number.
					   change = true;
		
					  }
					  
			    } 
				
			}
			return userInputDouble;
		}
}
