package br.com.java.aula;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Cadastro de conta");				
		
		System.out.print("Digite o nome: ");
		String nome = s.next();
		
		System.out.print("Digite a agência: ");
		String agencia = s.next();
		
		System.out.print("Digite o número da conta: ");
		String numero = s.next();
		
		Conta conta = new Conta(nome, agencia, numero);
		conta.Credito(1000);
		conta.ImprimeDados();
		
	}

}
