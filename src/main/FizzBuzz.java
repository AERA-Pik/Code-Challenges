package main;

public class FizzBuzz {
	public static void main(String[] Args) {
		/*
		 * Crea un bucle 'for' que imprime los n�meros de 1 al 100. 
		 * Para los m�ltiplos de 3 imprime la palabra "Fizz" en vez del n�mero y para los m�ltiplos de 5 imprime "Buzz". 
		 * Para los n�meros que son m�ltiplos de 3 y de 5, imprime �FizzBuzz�.
		 * */
		
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if(i % 5 == 0) {
				System.out.println("buzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else {
				System.out.println(i);
			}
		}
		
	}

}
