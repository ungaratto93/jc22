package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro numero:");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo numero:");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		double media = soma / 2;
		
		JOptionPane.showMessageDialog(
				null,
				"A soma é " + soma + "\nA média é " + media,
				"Resultado" ,
				1,
				null
		);
		
		
		
	}
	
}
