package banco;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Banco {
	static ArrayList<ContaCorrente> contasCorrente;
	static ArrayList<ContaPoupanca> contasPoupanca;

	public static void main(String[] args) {
		contasCorrente = new ArrayList<ContaCorrente>();
		contasPoupanca = new ArrayList<ContaPoupanca>();

		menuInicial();
	}

	public static void menuInicial() {
		String m = JOptionPane.showInputDialog(
				"                                   ------------------------------------------------------"
						+ "                                            \n                                   |-----Bem vindos ao Banco Fuctura-----|"
						+ "                                            \n                                   |----------------------------------------------------|"
						+ "                                            \n                                   |------Escolha uma das operações-------|"
						+ "                                            \n                                   |----------------------------------------------------|"
						+ "                                            \n                                   |            Opção 1 - Criar Conta               |"
						+ "                                            \n                                   |            Opção 2 - Login                         |"
						+ "                                            \n                                   |            Opção 3 - Sair                            |"
						+ "                                            \n                                   ------------------------------------------------------");

		if (m == null) {
			JOptionPane.showMessageDialog(null, "Cancelado!");
			menuInicial();
		} else if (m.equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Campo Vazio!");
			menuInicial();
		} else {
			try {
				int menuInicial = Integer.parseInt(m);
				switch (menuInicial) {
				case 1:
					criarConta();
					break;
				case 2:
					logarConta();
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Obrigado por usar os serviços da nossa agência!");
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					menuInicial();
					break;
				}
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(null, "Cancelado!");
				menuInicial();
			}
		}

	}

	// Provavelmente tem que inserir ContaCorrente e ContaPoupanca pra dar certo
	public static void menuCliente(ContaCorrente b, ContaPoupanca c) {
		String m = JOptionPane.showInputDialog(
				"                                   -----------------------------------------------------------------------"
						+ "                                            \n                                   |--------------Bem vindo/a ao Banco Fuctura--------------|"
						+ "                                            \n                                    Cliente: "
						+ b.getPessoa().getNome() + "                                                           "
						+ "                                            \n                                    CPF: "
						+ b.getPessoa().modCpf() + "                                              "
						+ "\n                                    E-mail: " + b.getPessoa().getEmail()
						+ "                                    "
						+ "                                            \n                                   |-----------------------------------------------------------------------|"
						+ "                                            \n                                   |---------------Escolha uma das operações----------------|"
						+ "                                            \n                                   |-----------------------------------------------------------------------|"
						+ "                                            \n                                   |            Opção 1 - Mudar Dados Cadastrais               |"
						+ "                                            \n                                   |            Opção 2 - Acessar Conta Corrente                |"
						+ "                                            \n                                   |            Opção 3 - Acessar Conta Poupança               |"
						+ "                                            \n                                   |            Opção 4 - Sair                                                    |"
						+ "                                            \n                                   -----------------------------------------------------------------------");
		int menu = Integer.parseInt(m);
		if (m == null) {
			JOptionPane.showMessageDialog(null, "Cancelado!");
			menuInicial();
		} else if (m.equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Campo Vazio!");
			menuInicial();
		}
		switch (menu) {
		case 1:
			modificarCadastro(b, c);
			break;
		case 2:
			acessarContaCorrente(b, c);
			break;
		case 3:
			acessarContaPoupanca(b, c);
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Obrigado por usar os serviços da nossa agência!");
			menuInicial();
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!!");
			menuInicial();
			break;

		}
	}

	// Método Gerente
	public static void menuGerente(ContaCorrente b, ContaPoupanca c) {

		int menu = Integer.parseInt(JOptionPane.showInputDialog(
				"                                   -------------------------------------------------------------------"
						+ "                                            \n                                   |---------------Gerência Banco Fuctura-----------------|"
						+ "                                            \n                                   |------------------------------------------------------------------|"
						+ "                                            \n                                   |-------------Escolha uma das operações--------------|"
						+ "                                            \n                                   |------------------------------------------------------------------|"
						+ "                                            \n                                   |            Opção 1 - Criar Conta                                 |"
						+ "                                            \n                                   |            Opção 2 - Mudar Dados Cadastrais          |"
						+ "                                            \n                                   |            Opção 3 - Listar                                           |"
						+ "                                            \n                                   |            Opção 4 - Sair                                              |"
						+ "                                            \n                                   -------------------------------------------------------------------"
						+ ""));

		switch (menu) {
		case 1:
			criarConta();
			break;
		case 2:
			modificarCadastro(b, c);
			break;
		case 3:
			listarContas(b, c);
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Obrigado por usar os serviços da nossa agência!");
			menuInicial();
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!!");
			menuGerente(b, c);
			break;
		}
	}

	public static void criarConta() {

		Pessoa pessoa = new Pessoa();

		pessoa.setNome(JOptionPane.showInputDialog("Nome: "));
		if (pessoa.getNome() == null) {
			JOptionPane.showMessageDialog(null, "Cancelado!");
			menuInicial();
		} else if (pessoa.getNome().equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Campo Vazio!");
			menuInicial();
		} else if (!pessoa.getNome().matches("[A-Z]*")) {
			JOptionPane.showMessageDialog(null, "Nome deve ser composto por letras!");
			menuInicial();
		}
		pessoa.setCpf(JOptionPane.showInputDialog("CPF: "));
		if (pessoa.getCpf() == null) {
			JOptionPane.showMessageDialog(null, "Cancelado!");
			menuInicial();
		} else if (pessoa.getCpf().equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Campo Vazio!");
			menuInicial();
		} else if (pessoa.getCpf().length() != 11) {
			JOptionPane.showMessageDialog(null, "CPF deve ser composto por 11 digitos numéricos!");
			menuInicial();
		} else if (!pessoa.getCpf().matches("[0-9]*")) {
			JOptionPane.showMessageDialog(null, "CPF deve ser composto por 11 digitos numéricos!");
			menuInicial();
		} else if (encontrarCpf(pessoa.getCpf(), contasCorrente)) {
			JOptionPane.showMessageDialog(null, "CPF já existente no banco de dados!");
			menuInicial();
		}
		pessoa.setEmail(JOptionPane.showInputDialog("E-mail: "));
		if (pessoa.getEmail() == null) {
			JOptionPane.showMessageDialog(null, "Cancelado!");
			menuInicial();
		} else if (pessoa.getEmail().equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Campo Vazio!");
			menuInicial();
		}

		ContaCorrente cc = new ContaCorrente(pessoa);
		ContaPoupanca cp = new ContaPoupanca(cc);

		contasCorrente.add(cc);
		contasPoupanca.add(cp);

		JOptionPane.showMessageDialog(null,
				"Confira seus dados!" + "\nConta Corrente: " + cc.getNumeroConta() + "\nConta Poupança: "
						+ cp.getNumeroConta() + "\nSenha: " + cc.getSenha() + "\nNome: " + cc.getPessoa().getNome()
						+ "\nCPF: " + cc.getPessoa().modCpf() + "\nE-mail: " + cc.getPessoa().getEmail());
		// Futuramente senha randômica
		JOptionPane.showMessageDialog(null, "Sua conta foi criada com sucesso!");

		menuInicial();
		// menu();
	}

	public static void logarConta() {
		
		ContaCorrente cc = null;
		ContaPoupanca cp = null;

		String numCPF = JOptionPane.showInputDialog("CPF: ");
		if (numCPF == null) {
			JOptionPane.showMessageDialog(null, "Cancelado!");
			menuInicial();
		} else if (numCPF.equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Campo Vazio!");
			menuInicial();
		} else if (numCPF.length() != 11) {
			JOptionPane.showMessageDialog(null, "CPF deve ser composto por 11 digitos numéricos!");
			menuInicial();
		} else if (!numCPF.matches("[0-9]*")) {
			JOptionPane.showMessageDialog(null, "CPF deve ser composto por 11 digitos numéricos!");
			menuInicial();
		}
		String senha = JOptionPane.showInputDialog("Senha: ");
		if (senha == null) {
			JOptionPane.showMessageDialog(null, "Cancelado!");
			menuInicial();
		} else if (senha.equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Campo Vazio!");
			menuInicial();
		}

		cc = encontrarLogi(numCPF, senha);
		cp = encontrarLog(numCPF, senha);
		// Login Gerente
		if (numCPF.equals("00011122233") && senha.equals("FUCTURA")) {
			menuGerente(cc, cp);
			// Login Cliente
		} else if (cc != null && cp != null) {
			menuCliente(cc, cp);
		} else {
			JOptionPane.showMessageDialog(null, "CPF e/ou senha incorreto(s)!");
			menuInicial();
		}

	}

	// Provavelmente tem que inserir ContaCorrente e ContaPoupanca pra dar certo
	public static void modificarCadastro(ContaCorrente b, ContaPoupanca c) {

		Pessoa pessoa = new Pessoa();

		pessoa.setNome(JOptionPane.showInputDialog("Nome: "));
		if (pessoa.getNome() == null) {
			JOptionPane.showMessageDialog(null, "Cancelado!");
			menuCliente(b, c);
		} else if (pessoa.getNome().equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Campo Vazio!");
			menuCliente(b, c);
		} else if (!pessoa.getNome().matches("[A-Z]*")) {
			JOptionPane.showMessageDialog(null, "Nome deve ser composto por letras!");
			menuCliente(b, c);
		}
		pessoa.setCpf(JOptionPane.showInputDialog("CPF: "));
		if (pessoa.getCpf() == null) {
			JOptionPane.showMessageDialog(null, "Cancelado!");
			menuCliente(b, c);
		} else if (pessoa.getCpf().equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Campo Vazio!");
			menuCliente(b, c);
		} else if (pessoa.getCpf().length() != 11) {
			JOptionPane.showMessageDialog(null, "CPF deve ser composto por 11 digitos numéricos!");
			menuCliente(b, c);
		} else if (!pessoa.getCpf().matches("[0-9]*")) {
			JOptionPane.showMessageDialog(null, "CPF deve ser composto por 11 digitos numéricos!");
			menuCliente(b, c);
		} else if (!b.getPessoa().getCpf().equals(pessoa.getCpf())) {
			if (encontrarCpf(pessoa.getCpf(), contasCorrente)) {
				JOptionPane.showMessageDialog(null, "CPF já existente no banco de dados!");
				menuCliente(b, c);
			}
		}
		pessoa.setEmail(JOptionPane.showInputDialog("E-mail: "));
		if (pessoa.getEmail() == null) {
			JOptionPane.showMessageDialog(null, "Cancelado!");
			menuCliente(b, c);
		} else if (pessoa.getEmail().equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Campo Vazio!");
			menuCliente(b, c);
		}

		double saldoCc = b.getSaldo();
		double saldoCp = c.getSaldo();

		// IMPORTANTE
		b = new ContaCorrente(pessoa);
		c = new ContaPoupanca(b);

		b.setSaldo(saldoCc);
		c.setSaldo(saldoCp);

		contasCorrente.set(b.getID() - 1, b);
		contasPoupanca.set(c.getID() - 1, c);

		JOptionPane.showMessageDialog(null,
				"Confira seus dados!" + "\nConta Corrente: " + b.getNumeroConta() + "\nConta Poupança: "
						+ c.getNumeroConta() + "\nSenha: " + b.getSenha() + "\nNome: " + b.getPessoa().getNome() + "\nCPF: "
						+ b.getPessoa().modCpf() + "\nE-mail: " + b.getPessoa().getEmail());

		JOptionPane.showMessageDialog(null, "Sua conta foi modificada com sucesso!");
		menuCliente(b, c);

	}

	private static boolean encontrarCpf(String numeroCpf, ArrayList<ContaCorrente> contasCorrente) {
		ContaCorrente conta = null;
		for (ContaCorrente c : contasCorrente) {
			if (c.getPessoa().getCpf().equals(numeroCpf)) {
				conta = c;
			}
		}
		if (conta == null) {
			return false;
		} else {
			return true;
		}
	}

	// encontrarLogin tipo "ContaCorrente"
	private static ContaCorrente encontrarLogi(String numeroCPF, String numeroSenha) {

		ContaCorrente conta = null;
		if (contasCorrente.size() > 0) {
			for (ContaCorrente c : contasCorrente) {
				if (c.getPessoa().getCpf().equals(numeroCPF) && c.getSenha().equals(numeroSenha)) {
					conta = c;
				}
			}
		}
		return conta;
	}

	// encontrarLogin tipo "Contas"
	private static ContaPoupanca encontrarLog(String numeroCPF, String numeroSenha) {
		ContaPoupanca conta = null;
		if (contasPoupanca.size() > 0) {
			for (ContaPoupanca c : contasPoupanca) {
				if (c.getPessoa().getCpf().equals(numeroCPF) && c.getSenha().equals(numeroSenha)) {
					conta = c;
				}
			}
		}
		return conta;
	}

	public static void listarContas(ContaCorrente b, ContaPoupanca c) {
		if (contasCorrente.size() > 0) {
			for (ContaCorrente cc : contasCorrente) {
				StringBuffer sb = new StringBuffer(cc.getNumeroConta());
				String a = sb.insert(6, "-").toString();
				JOptionPane.showMessageDialog(null, "\nConta Corrente: " + cc.getNumeroConta() + "\nConta Poupança: "
						+ a + "\nSenha: " + cc.getSenha() + "\nNome: " + cc.getPessoa().getNome()
						+ "\nCPF: " + cc.getPessoa().modCpf() + "\nE-mail: " + cc.getPessoa().getEmail());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Não há contas cadastradas!");
		}
		menuGerente(b, c);
	}

	public static void acessarContaCorrente(ContaCorrente cc, ContaPoupanca cp) {
		{
			int menu = Integer.parseInt(JOptionPane.showInputDialog(
					"                                   ------------------------------------------------------"
							+ "                                            \n                                   |-----Bem vindo/a ao Banco Fuctura-----|"
							+ "                                            \n                                    Cliente: "
							+ cc.getPessoa().getNome()
							+ "                  \n                                   ContaCorrente:  "
							+ cc.getNumeroConta()
							+ "                                            \n                                    CPF: "
							+ cc.getPessoa().modCpf() + " "
							+ "                                            \n                                   |-----------------------------------------------------|"
							+ "                                            \n                                   |-------Escolha uma das operações-------|"
							+ "                                            \n                                   |-----------------------------------------------------|"
							+ "                                            \n                                   |            Opção 1 - Saldo                           |"
							+ "                                            \n                                   |            Opção 2 - Sacar                           |"
							+ "                                            \n                                   |            Opção 3 - Depositar                    |"
							+ "                                            \n                                   |            Opção 4 - Transferir                   |"
							+ "                                            \n                                   |            Opção 5 - Aplicar                         |"
							+ "                                            \n                                   |            Opção 6 - Sair                              |"
							+ "                                            \n                                   ------------------------------------------------------"));
			switch (menu) {
			case 1:
				cc.mostrarSaldo();
				acessarContaCorrente(cc, cp);
				break;
			case 2:
				cc.sacar();
				acessarContaCorrente(cc, cp);
				break;
			case 3:
				cc.depositar();
				acessarContaCorrente(cc, cp);
				break;
			case 4:
				cc.transferir(contasCorrente);
				acessarContaCorrente(cc, cp);
				break;
			case 5:
				cc.aplicar(cp);
				acessarContaCorrente(cc, cp);
				break;
			case 6:
				menuCliente(cc, cp);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!!");
				menuCliente(cc, cp);
				break;
			}
		}
	}

	public static void acessarContaPoupanca(ContaCorrente cc, ContaPoupanca cp) {
		{
			int menu = Integer.parseInt(JOptionPane.showInputDialog(
					"                                   ------------------------------------------------------"
							+ "                                            \n                                   |-----Bem vindo/a ao Banco Fuctura-----|"
							+ "                                            \n                                    Cliente: "
							+ cp.getPessoa().getNome()
							+ "                  \n                                   ContaCorrente:  "
							+ cp.getNumeroConta()
							+ "                                            \n                                    CPF: "
							+ cp.getPessoa().modCpf() + " "
							+ "                                            \n                                   |-----------------------------------------------------|"
							+ "                                            \n                                   |-------Escolha uma das operações-------|"
							+ "                                            \n                                   |-----------------------------------------------------|"
							+ "                                            \n                                   |            Opção 1 - Saldo                           |"
							+ "                                            \n                                   |            Opção 2 - Transferir                   |"
							+ "                                            \n                                   |            Opção 3 - Resgatar                      |"
							+ "                                            \n                                   |            Opção 4 - Sair                              |"
							+ "                                            \n                                   ------------------------------------------------------"));
			switch (menu) {
			case 1:
				cp.mostrarSaldo();
				acessarContaPoupanca(cc, cp);
				break;
			case 2:
				cp.transferir(contasPoupanca);
				acessarContaPoupanca(cc, cp);
				break;
			case 3:
				cp.resgatar(cc);
				acessarContaPoupanca(cc, cp);
				break;
			case 4:
				menuCliente(cc, cp);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!!");
				menuCliente(cc, cp);
				break;
			}
		}
	}

}
