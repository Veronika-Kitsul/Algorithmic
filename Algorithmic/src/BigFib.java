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
				BigInteger one = Fib(n / 2);
				BigInteger two = (mult.multiply(new BigInteger("2"))).add(one);
				fib = two.multiply(one);
			}
			else 
			{
				BigInteger first = Fib((n - 1) / 2).pow(2);
				BigInteger second = Fib((n + 1) / 2).pow(2);
				fib = first.add(second);
			}
		}
		return fib;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		BigInteger result = Fib(number);
		System.out.println(result);
		scan.close();
	}
}
