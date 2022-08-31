/**
 * Fundamentos do Java
 * Estruturas de controle
 */
package fundamentos;

/**
 * @author Professor Jos� de Assis
 *
 */
public class EstruturasControle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nome = "Jos� de Assis";
		int idade = 58;
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
		//Exemplo 1
		System.out.println("Exemplo 1 (if)");
		if (idade > 18) {
			System.out.println("Maior de idade");
		}
		
		if (idade < 18) {
			System.out.println("Menor de idade");
		}
		
		if (idade == 18) {
			System.out.println("Maior de idade");
		}
		
		//Exemplo 2 
		System.out.println("Exemplo 2 (if)");
		if (idade >= 18) {
			System.out.println("Maior de idade");
		}
		if (idade < 18) {
			System.out.println("Menor de idade");
		}
		
		//Exemplo 3
		System.out.println("Exemplo 3 (if else)");
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
	}

}
