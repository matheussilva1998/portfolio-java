package banco;

public class Cliente {

	/**
	 * M�todo principal -> Ponto de partida
	 * Observa��o: S� pode existir um m�todo principal
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("==========================");
		//Acessar os m�todos e vari�veis de outra classe
		Agencia agencia = new Agencia();
		//m�todo simples
		agencia.metodoSimples();
		//m�todo com passagem de valor
		agencia.depositar(3000);
		
	}

}
