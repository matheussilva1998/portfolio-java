/**
 * Array simples
 * Exemplo2 - sorteio de uma carta
 */

package array;

import java.util.Random;

public class Array2 {

	public static void main(String[] args) {
		// ALT (esq) 3,4,5,6 (teclado numérico)
		String[] nipes = { "♥", "♦", "♣", "♠" };
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		// Recuperar a carta Áz de ouros
		System.out.println(faces[0] + nipes[1]);
		// Recuperar a carta Dama de copas
		System.out.println(faces[11] + nipes[0]);
		System.out.println("-------------------------");
		System.out.println("Carta sorteada:");
		// Criar um objeto de nome carta para gerar um número aleatório
		Random carta = new Random();
		// Criar uma variável do tipo inteiro que recebe um número aleatório
		// entre 0 e tamanho máximo do vetor faces (faces.lenght)
		int indiceFace = carta.nextInt(faces.length);
		// Criar uma variável do tipo inteiro que recebe um número aleatório
		// entre 0 e tamanho máximo do vetor nipes (nipes.lenght)
		int indiceNipe = carta.nextInt(nipes.length);
		// Exibir o resultado
		System.out.println(faces[indiceFace] + nipes[indiceNipe]);
	}

}
