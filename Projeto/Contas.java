package banco;

import java.util.ArrayList;

public abstract class Contas {
	// Atributos

	/*protected int ID;
	protected String numeroConta;
	protected Pessoa pessoa;
	protected Double saldo;
	protected String senha;*/
	
	private int ID;
	private String numeroConta;
	private Pessoa pessoa;
	private Double saldo;
	private String senha;
	
	// Métodos Personalizados Abstratos:
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
		return this.numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
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

	public void setID(int iD) {
		ID = iD;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
