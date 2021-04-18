import java.math.BigInteger;
import java.util.Scanner;

public class BigFib {

	
	public BigInteger BigFib(BigInteger n) 
	{
		BigInteger fib = new BigInteger("1");
		if (n.equals(1) || n.equals(2))
		{
			System.out.println(fib);
			return fib;
		}
		else 
		{
			BigInteger mult = new BigInteger(BigFib(new BigInteger("n/2 - 1")).multiply(new BigInteger("2")));
			BigInteger two = new BigInteger(BigFib(new BigInteger("n/2")).add(mult));
			fib = two.multiply((BigFib(new BigInteger("n/2")).add(mult)));
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BigInteger number = new BigInteger("n");
		new BigFib(number);
	}
}
