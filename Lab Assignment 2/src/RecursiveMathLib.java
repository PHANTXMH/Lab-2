											//MARCAL HARRISON ID# 1703882

public class RecursiveMathLib extends MathLib
{
	public int Gcd(int x, int y) //Greatest Common Divisor
	{
		if(y == 0)
		{
			return x;
		}
		if (x >= y && x != 0)
		{
			return Gcd(y, x % y);
		}
		
		return 0;
	}
	
	public int Ack(int x, int y) //Ackermann's Function
	{
		if(x==0)
		{
			return y + 1;
		}
		if (y==0)
		{
			return Ack(x-1,1);
		}
		if (x!= 0 && y!= 0)
		{
			return Ack(x-1, Ack(x,y-1));
		}
		return 0;
	}
	
	public int Fib(int x)			//Fibonacci
	{
		if(x==0)
		{
			return 0;
		}
		if(x==1)
		{
			return 1;
		}
		if(x>1)
		{
			return Fib(x-1 ) + Fib(x-2);
		}
		
		return 0;
	}
	
	public int Hanoi(int n)			//Tower of Hanoi Problem
	{
		if(n==1)
		{
			return 1;
		}
		if(n>1)
		{
			return 2 * Hanoi(n-1) + 1;
		}
		return 0;
	}

}
