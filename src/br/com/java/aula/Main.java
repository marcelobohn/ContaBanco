package br.com.java.aula;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Baninstituto");		
		
		banco.AbreConta();		
		Conta ultimaConta = banco.GetUltimaContaAberta();
		ultimaConta.Credito(1000);
		
		banco.AbreConta();
		ultimaConta = banco.GetUltimaContaAberta();
		ultimaConta.Credito(2000);
		
		banco.ImprimeContas();

	}
}
