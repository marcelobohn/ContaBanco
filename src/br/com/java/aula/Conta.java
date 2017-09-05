package br.com.java.aula;

public class Conta {	
	private String agencia;
	private String conta;
	private Correntista titular;
	private double saldo;
	
	public Conta(String titular, String agencia, String conta) {
		this.titular = new Correntista(titular, "");
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = 0;
	}
	
	public String GetTitular() {
		return this.titular.GetNome();
	}
	
	public double GetSaldo() {
		return this.saldo;
	}
	
	public double Credito(double valor) {
		return this.saldo += valor;
	}
	
	public double Debito(double valor) {
		return this.saldo -= valor;
	}	
	
	public void ImprimeDados() {
		System.out.println("Dados da conta");
		System.out.println("Nome: " + this.titular.GetNome());
		System.out.println("Agência: " + this.agencia);
		System.out.println("Conta: " + this.conta);
		System.out.println("Saldo: " + this.saldo);		
	}
}
