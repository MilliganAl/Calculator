
/**
 * @author Alec Milligan
 *
 */
public class ModuloDivision implements Numbers {
	//Overridden Calculate method from my Calculate interface
	/**
	 *@param double firstNumber
	 *@param double secondNumber
	 *@return firstNumber % secondNumber
	 */
	 //method to get the remainder of any 2 numbers.
	@Override
	public double Calculate(double firstNumber, double secondNumber) {
		return firstNumber % secondNumber;
	}

}
