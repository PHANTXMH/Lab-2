											//MARCAL HARRISON ID# 1703882

public class IterationMathLib extends MathLib
{

	public int Gcd(int x, int y) 
	{
		
		while(y != 0 && x >= y && x != 0)
		{
			y = x%y;
			return y;
		}
		return x;
	}
	
	public int Ack(int x, int y)
	{		
		while (x == 0) 
		{
			y= y + 1;
			return y;
		}
		while (y == 0) 
		{
			x = x - 1;
			return 1;
		}
		x = x -1;
		x = y-1;
		return x;
	}
	
	public int Fib(int x)
	{		
		while (x == 1)
		{
			x = x-1;
			return 1;
		}
		while (x > 1) 
		{
			x = x-1 + x - 2;
			return x;
		}
		return 0;
	}
	
	public int Hanoi(int n)
	{		
		while (n > 1)
		{
			n = 2 * n * (n-1) + 1;
			return n;
		}
		return 1;
	}
}
