/**
 * Fundamentos do Java
 * estudo do array de duas dimens�es (MATRIZ)
 */

package array;

public class Array4 {

	public static void main(String[] args) {
		// [][] 
		String[][] agenda = { { "Bill Gates", "99999-1234", "bill@outlook.com" },
				{ "Bruce Wayne", "9999-6666", "batman@gmail.com" },
				{ "Linus Torvalds", "9999-4321", "tux@gmail.com" } };
		// recuperar o Email do Bruce Wayne
		//System.out.println(agenda[1][2]);
		// recuperar o Telefone do Bill Gates
		//System.out.println(agenda[0][1]);
		//Percorrendo a matriz com o la�o for
		System.out.println("================================");
		System.out.println("====== Agenda de contatos ======");
		System.out.println("================================");
		System.out.println("");
		//1o la�o faz a varredura das linhas
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("____________________________");
			//2o la�o faz a varredura dsa colunas
			for (int j = 0; j < agenda[i].length; j++) {
				System.out.println(agenda[i][j]);
			}
		}
	}

}
