package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {

		// Informacoes do funcionario
		
		// tipos numericos primitivos
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // coloca L para dizer que este literal e long
		
		// tipos numericos reais
		float salario = 11_445_44F; // coloca F para dizer que o literal e float e nao double
		double vendasAcumuladas = 2_991_797_103.01; 
		
		// tipos booleanos
		boolean estaDeFerias = false; // truw
		
		// tipo caractere
		char status = 'A'; // ativo
		
		// usando as variaveis

		// dias de empresa
		System.out.println("Dias de Empresa : " + anosDeEmpresa * 365);
		
		// numero de viagens
		System.out.println("Numero de viagens : " + numeroDeVoos / 2);
	
		// pontos por real
		System.out.println("Pontos por real : " + pontosAcumulados / vendasAcumuladas);
	
		System.out.println(id + " ganha -> " + salario );
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status : " + status);
	}
}
