package main;


/*
 * Enunciado: Crea UNA �NICA FUNCI�N (importante que s�lo sea una) que sea capaz de calcular y retornar el �rea de un pol�gono.
 * - La funci�n recibir� por par�metro s�lo UN pol�gono a la vez.
 * - Los pol�gonos soportados ser�n Tri�ngulo, Cuadrado y Rect�ngulo.
 * - Imprime el c�lculo del �rea de un pol�gono de cada tipo.
 */


public class AreaDePoligono {
	
	public static interface Poligono{
		public double area();
		public void imprimirArea();
	}
	
	public static double area(Poligono poligono) {		
		poligono.imprimirArea();
		return poligono.area();
	}
	
	public static class Triangulo implements Poligono {
		public double base;
		public double altura;		

		public Triangulo(double base, double altura) {			
			this.base = base;
			this.altura = altura;
		}

		@Override
		public double area() {		
			return ((base * altura)/2);
		}

		@Override
		public void imprimirArea() {
			System.out.println("El area del triangulo es: " + area());
			
		}
		
	}
	
	public static class Cuadrado implements Poligono {
		public double lado;		

		public Cuadrado(double lado) {			
			this.lado = lado;
		}

		@Override
		public double area() {			
			return (lado * lado);
		}

		@Override
		public void imprimirArea() {
			System.out.println("El area del cuadrado es: " + area());
			
		}
		
	}
	
	public static class Rectangulo implements Poligono {
		public double base;
		public double altura;	

		public Rectangulo(double base, double altura) {			
			this.base = base;
			this.altura = altura;
		}

		@Override
		public double area() {			
			return (base * altura);
		}

		@Override
		public void imprimirArea() {
			System.out.println("El area del rectangulo es: " + area());
			
		}
		
	}	
	
	public static void main(String[] args) {		
		area(new Triangulo(10, 20));
		area(new Cuadrado(15));
		area(new Rectangulo(12, 7));		
		
	}	

}
