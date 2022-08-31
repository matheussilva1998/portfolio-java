/**
 * Fundamentos do Java
 * Estudo do array - Array List (din�mico)
 */
package array;

import java.util.ArrayList;

public class Array3 {

	public static void main(String[] args) {
		//a linha abaixo cria um vetor din�mico
		//O ArrayList aceita o tipo String ou uma classe
		ArrayList<String> contatos = new ArrayList<>();
		contatos.add("Jos� de Assis");
		contatos.add("99999-1234");
		contatos.add("jose@email.com");
		contatos.add("Bill Gates");
		contatos.add("98765-1234");
		contatos.add("bill@email.com");
		//a linha abaixo exibe o conte�do do vetor
		System.out.println(contatos);
		//a linha abaixo exibe o tamanho do vetor (size())
		System.out.println("Tamanho do array: " + contatos.size());
		//a linha abaixo recupera um valor do vetor (�ndice 2)
		System.out.println("�ndice2: " + contatos.get(2));
		System.out.println("------------------------------------");
		System.out.println("Removendo um valor do array (�ndice 4)");
		//a linha abaixo remove um valor da lista
		contatos.remove(4);
		System.out.println(contatos);
		System.out.println("Tamanho do array: " + contatos.size());
		//usando um la�o for para percorrer o array
		System.out.println("Agenda de contatos");
		for (int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i));
		}
	}

}
