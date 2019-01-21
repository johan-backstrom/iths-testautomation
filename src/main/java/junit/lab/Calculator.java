package junit.lab;

public class Calculator {

	public int add(int number1, int number2)
	{
		return number1 + number2;
	}

	public int subtract(int number1, int number2)
	{
		return number1 - number2;
	}

	public int multiply(int number1, int number2)
	{
		return number1 * number2;
	}

	public int divide(int number1, int number2)
	{
		return number1 / number2;
	}

	public double percent(int number1, int asPercentageOf){
	    return 100 * (double)number1 / asPercentageOf;
    }
}