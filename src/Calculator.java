

	
import java.util.*;
	/**
	 * @author Alec Milligan
	 * 
	 */
	public class Calculator  {	
		
      // class level variables
                    
                     double firstNumber ;//will be the userInput1 converted to a double
		             double secondNumber ; //will be the userInput2 converted to a double
		             int operator;
		             String userInputOne ; // blank string will hold the users first number
		             String sign;   //blank String will hold the operator the user wants to use
		             String userInputTwo; //blank string will hold the users first number
		             String errorMessage = "Im sorry, but the operator you have entered is invalid \nplease try again";	//for exception handling and nothing more 		                     	     
		             Scanner scanner = new Scanner(System.in);
		             boolean startOver = true;
		             String promptOne = "Please enter first number : ";
		             String promptTwo = "Please your next number : ";
		             
		             String keepGoing ;
               
               
		    
		       
		        
		       
		     
		    /**
		     * 
		     */
		  
		    public void operations () {
		    	
		    	
		    	
		    	
			   while (startOver) { 
				
					//getting the users first number.
					firstNumber=Operations.takeUserInput(scanner, promptOne, userInputOne, firstNumber);
							
						
					System.out.println("Please enter one of the following: \n + \n - \n / \n % (get remainder) \n ^ (to the power of) \n N (Get any root)");
			        sign = scanner.next();//getting users operator
					
					
			        //using an array of the type of my interface and creating the correct object for the corresponding char
					final Numbers[] operatorArray = new Numbers[1000];
					 operatorArray['+'] = new Add();
					 operatorArray['-'] = new Subtract();
					 operatorArray['*'] = new Multiply();
					 operatorArray['/'] = new Divide();
					 operatorArray['%'] = new ModuloDivision();
					 operatorArray['^'] = new ToThePowerOf();
					 operatorArray['n'] = new NthRoot();
					 
					 
					//setting the operator = to the first Char of the sign variable (which should only have 1 char anyway)
				    operator = sign.charAt(0);
				    //getting users second number.
					secondNumber = Operations.takeUserInput(scanner,promptTwo, userInputTwo , secondNumber);
					
					try {
						System.out.println((operatorArray[operator]).Calculate(firstNumber, secondNumber));//passing operator into the array will allow the array to decide what opeator/sign the user has chosen
						
																													
		            System.out.println("Would you like to go again Y for yes N for no : ");
		            	 keepGoing = scanner.next();
						//operator = scanner.nextInt();
					 
						startOver = true; //running the while loop again.
					    
						
		            
		             	if(keepGoing.equalsIgnoreCase("n"))//if the operator = 2 the program will stop
		             		startOver=false;
		             	
		             	else if (keepGoing.equalsIgnoreCase("y")){
						startOver = true;
		             	 }
		             	
		             	
					  }
								
						
						catch(ArrayIndexOutOfBoundsException e) {
							System.out.println(errorMessage); //will fire if they choose an invalid char
						}
						catch(NullPointerException e) {
							System.out.println(errorMessage); 
						}
						catch(InputMismatchException e) {
							System.out.println("Okay then");
							startOver = false; //ending while loop
		
						}
					
		        }
			   
	            scanner.close();
	            System.out.println("Signing off.........");
	          
		        }
		    
		    



			
		 
		 
				    
 }
	 // end of class
	
	
	
	



