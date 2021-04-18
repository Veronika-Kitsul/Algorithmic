import java.math.BigInteger;
import java.util.Scanner;

public class BigFib {

	
	public BigFib(BigInteger number) {
		// TODO Auto-generated constructor stub
	}

	public BigInteger BigFib(BigInteger n) 
	{
		BigInteger fib = new BigInteger("1");
		BigInteger mult;
		if (n.equals(1) || n.equals(2))
		{
			System.out.println(fib);
			return fib;
		}
		else 
		{
			BigInteger mult1 = (BigFib(new BigInteger("n/2 - 1"))).multiply(new BigInteger("2"));
			BigInteger two = BigFib(new BigInteger("n/2")).add(mult1);
			fib = two.multiply((BigFib(new BigInteger("n/2")).add(mult1)));
		}
		return fib;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		BigInteger number = BigInteger.valueOf(scan.nextInt());
		BigFib result = new BigFib(number);
		System.out.println(result);
		scan.close();
	}
}
