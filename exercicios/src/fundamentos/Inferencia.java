package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		// declaracao e inicializacao
		double a = 4.5;
		System.out.println(a);
		
		// R = Z
		a = 12; // funciona pois inteiros sao convertiso nos reais adicionando a casa decimal .0
		System.out.println(a);
		
		// a = "..."; nao podemos atribuir outro tipo
		
		// declara e infere o tipo
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);

		c = "outro texto";
		System.out.println(c);
		
		// c = 4.5 nao podemos mudar o tipo
		
		// declara e inicializa posteriormente
		double d;
		d = 123.45;
		System.out.println(d);
		
		// declara e infere o tipo
		var e = 123.45;
		System.out.println(e);

		// Z != R
		var f = 12;
		// f = 12.01; nao funciona pois nao e permitido armazenar reais dentro de inteiros no java 
		System.out.println(f);
	}
}
