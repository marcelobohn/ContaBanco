package br.com.java.aula;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Cadastro de conta");
		
		System.out.print("Digite o nome: ");
		Scanner s = new Scanner(System.in);
		String nome = s.next();
		String agencia = "";
		String numero = "";
		System.out.println("o nome é " + nome);
		
		Conta conta = new Conta(nome, agencia, numero);
		//implementar
		//conta.ImprimeDados();
		
		//level up
		//array de contas
	}

}
