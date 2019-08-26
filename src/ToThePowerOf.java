
/**
 * @author Alec Milligan
 *
 *
 *
 *
 *///  
public class ToThePowerOf implements Numbers {
	//Overridden Calculate method from my Calculate interface
	/**
	 * @param double firstNumber
	 * @param double secondNumber
	 * @return the power of
	 */
	@Override
	public double Calculate(double firstNumber, double secondNumber) {
	
		return Math.pow (firstNumber, secondNumber);
	}

}
