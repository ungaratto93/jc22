package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		// System.out.println(2+3);
	
		// definir variavel e atrbuir valor em java
		// aloca um espaco de memoria e atribui o valor
		// tipo nome = valor
		double raio = 3.4;
		
		// declara uma constante, que nao pode receber novas atribuiçoes de valores
		final double PI = 3.14159;
		
		// formula
		double area = PI * raio * raio;
		System.out.println(area);

		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area + " m2");

	}
	
}
