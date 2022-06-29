package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {
		// criar scanner
		// pegar 3 strings usando nextline
		// receber os ultimos 3 salarios
		// calcular a media
		// separar as casas decimas com virgula ou ponto

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salario: ");
		String valor1 = entrada.nextLine();
		
		System.out.print("Digite o segundo salario: ");
		String valor2 = entrada.nextLine();
		
		System.out.print("Digite o terceiro salario: ");
		String valor3 = entrada.nextLine();
		

		
		double salarioDouble1 = Double.parseDouble(valor1.replace(",", "."));
		double salarioDouble2 = Double.parseDouble(valor2.replace(",", "."));
		double salarioDouble3 = Double.parseDouble(valor3.replace(",", "."));

		
		double resultado = salarioDouble1 + salarioDouble2 + salarioDouble3;
		double media = resultado / 3;
		
		System.out.printf("O resultado da soma é %.2f e a média é %.2f", resultado, media);
		
		entrada.close();
	}
	
	
}

