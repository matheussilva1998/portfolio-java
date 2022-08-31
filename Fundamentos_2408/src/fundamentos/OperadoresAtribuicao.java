package fundamentos;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		double x = 5;
		System.out.println("Operadores de Atribui��o");
		System.out.println(" ---------------------------------");
		System.out.println("| Operador  | Exemplo | Resultado |");
		System.out.println("|    =      | x = 5   | " + x);
		System.out.println("|    +=     | x += 5  | " + (x += 5));
		System.out.println("|    -=     | x -= 4  | " + (x -= 4));
		System.out.println("|    *=     | x *= 3  | " + (x *= 3));
		System.out.println("|    /=     | x /= 2  | " + (x /= 2));
		x++; //soma 1 a vari�vel (x = x + 1)
		System.out.println("|    ++     | x++     | " + x);
		x--; //subtrair 1 da vari�vel (x = x - 1)
		System.out.println("|    --     | x--     | " + x);
		System.out.println(" ---------------------------------");
	}

}
