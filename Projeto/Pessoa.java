package Projeto;

public class Pessoa {
	// Atributos
	private static int contador = 0;
	private String nome;
	private String cpf;
	private String email;

	// Métodos Personalizados:
	public String toString() {
		return "\nNome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nE-mail: " + this.getEmail();
	}

	// Métodos Especiais:
	// Constructor
	public Pessoa() {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		contador += 1;
	}

	public Pessoa(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		contador += 1;
	}

	// Getters and Setters
	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String modCpf() {
		StringBuilder strBuilder = new StringBuilder(this.getCpf());
		String a = strBuilder.insert(3, ".").toString();
		StringBuilder str = new StringBuilder(a);
		String b = str.insert(7, ".").toString();
		StringBuilder st = new StringBuilder(b);
		String c = st.insert(11, " - ").toString();

		return c;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
