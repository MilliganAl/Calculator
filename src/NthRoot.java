
public class NthRoot implements Numbers {

	@Override
	public double Calculate(double firstNumber, double secondNumber) {
		
	        return Math.pow(Math.E, Math.log(firstNumber)/secondNumber);
	    }
	}


