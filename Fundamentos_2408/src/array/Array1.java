/**
 * estudo do array
 * Exemplo 1 - Array simples(vetor)
 */

package array;

public class Array1 {

	public static void main(String[] args) {
		// Array simples (vetor)
		//                      [0]           [1]        [2]         [3]
		String[] times = { "Corinthians", "São Paulo", "Santos", "Palmeiras" };
		// Recuperar o valor do índice [1]
		System.out.println(times[1]);
		// A linha abaixo informa o tamanho do array (lenght())
		System.out.println("Tamanho do array: " + times.length);
		// Uso do laço for para "percorrer" o Array
		System.out.println("=============================");
		System.out.println("Times:");
		for (int i = 0; i < times.length; i++) {
			System.out.println(times[i]);
		}
	}

}
