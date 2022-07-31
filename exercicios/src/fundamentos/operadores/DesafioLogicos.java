package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// trabalho na terca
		// trabalho na quinta
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprarTv50 = trabalho1 && trabalho2;
		boolean comprarTv32 = trabalho1 ^ trabalho2;
		boolean tomarSorvete = comprarTv50 || comprarTv32;
		boolean ficarSaudavel = !tomarSorvete;
		
		// acho que um ternario fica mais legivel de ler
		// boolean ficarSaudavel = tomarSorvete ? false : true;
		
		System.out.println("Comprar TV50 para familia? " + comprarTv50);
		System.out.println("Comprar TV32 para familia? " + comprarTv32);
		System.out.println("Tomar sorvete? " + tomarSorvete);
		System.out.println("Ficar saudavel? " + ficarSaudavel);

		
		// se os dois trabalhos derem certo,
		// vc vai comprar uma tv de 50 pol para familia
		
		// se apenas um dos trabalhos derem certo,
		// vc ira comprar uma tv de 32 pol 
		
		// tanto nos dois casos, vao tomar sorvete
		// para comemorar a compra da tv
	
		// e ta mais saudavel pq nao tomou sorvete
	}
	
}
