/**
 * Estudo das vari�veis
 */
package fundamentos;

/**
 * @author Professor Jos� de Assis
 *
 */
public class Variaveis {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Criando(declarando) uma vari�vel no Java
		String nome;
		nome = "Jos� de Assis";
		System.out.println("Nome: " + nome);
		// � poss�vel criar a vari�vel e ao mesmo tempo atribuir um valor
		int idade = 54;
		System.out.println("Idade: " + idade);
		// � poss�vel criar em uma �nica linha 2 ou mais vari�veis do mesmo tipo
		double peso, altura;
		peso = 62;
		altura = 1.63;
		System.out.println("Peso: " + peso + " Kg");
		System.out.println("Altura: " + altura + " m");
		char sexo;
		sexo = 'M';
		System.out.println("Sexo: " + sexo);
		boolean vip;
		vip = true;
		System.out.println("Aluno VIP? " + vip);
	}

}
