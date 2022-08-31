/**
 * Fundamentos da L�gica de Programa��o com Java
 * Exemplo de uso da estrutura switch case
 */
package fundamentos;

/**
 * @author Professor Jos� de Assis
 *
 */
public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Menu de op��es:");
		System.out.println("1. Windows");
		System.out.println("2. Linux");
		System.out.println("3. Mac OS");
		System.out.println("Digite a op��o desejada: ");
		int opcao = 3;
		System.out.println("Op��o escolhida: " + opcao);
		switch (opcao) {
		case 1:
			System.out.println("Carregando o Windows........................");
			break;
		case 2:
			System.out.println("Carregando o Linux.........");
			break;
		case 3:
			System.out.println("Carregando o Mac..");
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}
	}

}
