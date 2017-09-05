package br.com.java.aula;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Cadastro de conta");
		
		System.out.print("Digite o nome: ");
		Scanner s = new Scanner(System.in);
		String nome = s.next();
		String agencia = "123-4";
		String numero = "99999-9";
		
		Conta conta = new Conta(nome, agencia, numero);
		conta.Credito(1000);
		conta.ImprimeDados();
		
	}

}
