											//MARCAL HARRISON ID# 1703882

public class MathLib{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RecursiveMathLib objR = new RecursiveMathLib();
		IterationMathLib objI = new IterationMathLib();
		
		System.out.println("---- Iteration ----");
		System.out.println("GCD(2, 1) = " +objI.Gcd(2, 1));
		System.out.println("ACK(2, 1) = " +objI.Ack(2, 1));
		System.out.println("FIB(4) = " +objI.Fib(4));
		System.out.println("HANOI(6) = " +objI.Hanoi(6));
		System.out.println();
		System.out.println("---- Recursion ----");
		System.out.println("GCD(2, 1) = " +objR.Gcd(2, 1));
		System.out.println("ACK(2, 1) = " +objR.Ack(2, 1));
		System.out.println("FIB(4) = " +objR.Fib(4));
		System.out.println("HANOI(6) = " +objR.Hanoi(6));
		System.out.println();
	}
}

