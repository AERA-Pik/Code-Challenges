package main;

public class FizzBuzz {
	public static void main(String[] Args) {
		/*
		 * Crea un bucle 'for' que imprime los números de 1 al 100. 
		 * Para los múltiplos de 3 imprime la palabra "Fizz" en vez del número y para los múltiplos de 5 imprime "Buzz". 
		 * Para los números que son múltiplos de 3 y de 5, imprime “FizzBuzz”.
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
