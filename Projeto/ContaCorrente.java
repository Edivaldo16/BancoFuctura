package banco;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ContaCorrente extends Contas{
	//private static int contadorDeContas = 0;
	public ContaCorrente() {
	}
	
	public ContaCorrente(Pessoa pessoa) {
		GeradorSenha g = new GeradorSenha();
		GeradorConta gC = new GeradorConta();

		this.setID(0);
		this.setNumeroConta(gC.getRandomString(7));
		this.setPessoa(pessoa);
		this.setSenha(g.getRandomString(5));
		this.setSaldo(0.0);
		this.setID(this.getID() + 1);
		
		/*this.ID = contadorDeContas;
		this.numeroConta = gC.getRandomString(7);
		this.pessoa = pessoa;
		this.senha = g.getRandomString(5);
		this.saldo = 0.0;
		contadorDeContas += 1*/
	}

	private static ContaCorrente encontrarConta(String numeroConta, ArrayList<ContaCorrente> contasBancarias) {
		ContaCorrente conta = null;
		if (contasBancarias.size() > 0) {
			for (ContaCorrente c : contasBancarias) {
				if (c.getNumeroConta().equals(numeroConta)) {
					conta = c;
				}
			}
		}
		return conta;
	}

	public void sacar() {
		Double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar: "));
		if (valor > 0 && valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			JOptionPane.showMessageDialog(null,
					"Seu saque de " + Utils.doubleToString(valor) + " foi realizado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Impossível sacar valores maiores que o saldo disponível!");
		}
	}

	@Override
	public void depositar() {
		Double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar: "));
		if (valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
			JOptionPane.showMessageDialog(null,
					"Seu depósito de " + Utils.doubleToString(valor) + " foi realizado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Depósito não realizado. Verique o valor inserido!");
		}
	}
	
	@Override
	public void mostrarSaldo() {
		JOptionPane.showMessageDialog(null, "Saldo Atual: " + Utils.doubleToString(this.getSaldo()));
	}

	public void aplicar(ContaPoupanca destino) {
		Double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja aplicar: "));
		if (valor > 0 && this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			destino.setSaldo(valor + destino.getSaldo());
			JOptionPane.showMessageDialog(null,
					"O valor de " + Utils.doubleToString(valor) + " foi aplicado na Conta Poupança com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Valor não aplicado. Verique o saldo e/ou valor inserido!");
		}
	}

	public void transferir(ArrayList<ContaCorrente> contasBancarias) {
		String destinatario = JOptionPane.showInputDialog("Digite a Conta Corrente Destinatário: ");
		ContaCorrente cp = encontrarConta(destinatario, contasBancarias);
		if (cp != null) {
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Tranferência de: "));
			if (valor > 0 && valor <= this.getSaldo()) {
				this.setSaldo(this.getSaldo() - valor);
				cp.setSaldo(cp.getSaldo() + valor);
				JOptionPane.showMessageDialog(null, "Valor de " + Utils.doubleToString(valor)
						+ " depositado com sucesso na conta " + cp.getNumeroConta());
			} else {
				JOptionPane.showMessageDialog(null, "Impossível transferir. Verique saldo e/ou o valor inserido!");
			}

		} else {
			JOptionPane.showMessageDialog(null, "A conta destinatário não foi encontrada!");
		}

	}

}
