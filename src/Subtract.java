
/**
 * @author Alec Milligan
 *
 */
public class Subtract implements Numbers{
	//Overridden Calculate method from my Calculate interface
	/**
	 * @param firstNumber
	 * @param secondNumber
	 * @return firstNumber - secondNumber
	 */
	@Override // method to do subtraction
	public double Calculate(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber; 
	}

}
