package Projeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public abstract class Contas {
	// "\nID:" + this.getID() Add ID quando criar Login Gerente

	// Atributos
	GeradorSenha g = new GeradorSenha();
	GeradorConta gC = new GeradorConta();
	public static int contadorDeContas = 0;

	String geradorDeContas = gC.getRandomString(7);

	protected int ID;
	protected String numeroConta;
	protected Pessoa pessoa;
	protected Double saldo;
	protected String senha;

	// Métodos Personalizados:
	public abstract void mostrarSaldo();
	public abstract void depositar();
	
	// Tratamento String ArrayList
	public String toString() {
		return "\nNúmero da Conta: " + this.getNumeroConta() + "\nNome: " + this.pessoa.getNome() + "\nCPF: "
				+ this.pessoa.getCpf() + "\nE-mail: " + this.pessoa.getEmail() + "\nSaldo: "
				+ Utils.doubleToString(this.getSaldo()) + "\nSenha: " + this.getSenha() + "\n";
	}

	// Métodos Especiais:
	// Getters and Setters
	public String getNumeroConta() {
		return numeroConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public int getID() {
		return ID;
	}

	private void setID(int iD) {
		ID = iD;
	}

	public String getSenha() {
		return senha;
	}

}
