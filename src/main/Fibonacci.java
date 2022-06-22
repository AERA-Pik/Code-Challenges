package main;

public class Fibonacci {
	public static void main(String[] args) {
		long n1 = 0;
		long n2 = 1;
		for (int i = 0; i < 50; i++) {			
			System.out.println(n1);	
			long fib = n1 + n2;
			n1 = n2;
			n2 = fib;
		}
		
	}

}
