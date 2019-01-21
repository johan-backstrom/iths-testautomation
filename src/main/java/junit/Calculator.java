package junit;

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

	public String reverse(String original)
	{
		String reverse = "";
		int length = original.length();
		for ( int i = length - 1 ; i >= 0 ; i-- )
	    {
			reverse = reverse + original.charAt(i);
	    }
		return reverse;

	}
}