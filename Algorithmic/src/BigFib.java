import java.math.BigInteger;
import java.util.Scanner;

public class BigFib {


	public static BigInteger Fib(int n) 
	{
		BigInteger fib = new BigInteger("0");
		if (n == 0)
		{
			//return fib;
		}
		else if (n == 1)
		{
			fib = new BigInteger("1");
		}
		else 
		{
			if (n % 2 == 0)
			{
				BigInteger mult = Fib(n / 2 - 1);
				BigInteger two = Fib(n / 2 + 1).add(mult);
				fib = two.multiply((Fib(n/2)));
			}
			else 
			{
				BigInteger first = Fib(n / 2).pow(2);
				BigInteger second = Fib(n / 2 - 1).pow(2);
				fib = first.add(second);
			}
		}
		System.out.println(fib);
		return fib;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		BigInteger result = Fib(number);
		System.out.println("hmghjg " + result);
		scan.close();
	}
}
