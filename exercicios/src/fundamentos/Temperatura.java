package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//FORMULA
		// ( F - 32 ) * ( 5/9 ) = C
		final int CORRELACIONAL = 32;
		final double FATOR = 5.0 / 9.0;

		double fahrenheit = 86;
		double celsius = ((fahrenheit - CORRELACIONAL) * (FATOR));
		System.out.println(fahrenheit + " F = " + celsius + " C");
		
		fahrenheit = 150;
		celsius = ((fahrenheit - CORRELACIONAL) * (FATOR));
		System.out.println(fahrenheit + " F = " + celsius + " C");

	}
}
