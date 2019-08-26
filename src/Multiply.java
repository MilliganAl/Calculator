
/**
 * @author Alec Milligan
 *
 */
public class Multiply implements Numbers {
	//Overridden Calculate method from my Calculate interface
	/**
	 *@param double firstNumber
	 *@param double secondNumber
	 *@return firstNumber * secondNumber
	 */
	@Override
	public double Calculate(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

}
