package br.com.java.aula;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Baninstituto");		
		
		Conta conta = banco.AbreConta();		
		conta.Credito(1000);
				
		banco.ImprimeContas();
	}
}
