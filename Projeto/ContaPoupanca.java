package Projeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ContaPoupanca extends Contas {
	private String numConta;

	public ContaPoupanca() {

	}

	public ContaPoupanca(Contas conta) {

		this.ID = conta.getID();
		StringBuffer sb = new StringBuffer(conta.getNumeroConta());
		String a = sb.insert(6, "-").toString();
		this.numeroConta = a;
		this.pessoa = conta.getPessoa();
		this.senha = conta.getSenha();
		this.saldo = 0.0;
	}

	// Não esquecer de definir ArrayList do tipo ContaPoupanca como objeto principal
	private static ContaPoupanca encontrarConta(String numeroConta, ArrayList<ContaPoupanca> contasBancarias) {
		ContaPoupanca conta = null;
		if (contasBancarias.size() > 0) {
			for (ContaPoupanca c : contasBancarias) {
				if (c.getNumeroConta().equals(numeroConta)) {
					conta = c;
				}
			}
		}
		return conta;
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

	public void transferir(ArrayList<ContaPoupanca> contasBancarias) {
		String destinatario = JOptionPane.showInputDialog("Conta Poupanca Destinatário: ");
		ContaPoupanca cp = encontrarConta(destinatario, contasBancarias);

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

	public void resgatar(ContaCorrente destino) {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja resgatar: "));
		if (valor > 0 && valor <= this.getSaldo()) {
			this.saldo = getSaldo() - valor;
			destino.setSaldo(valor + destino.getSaldo());
			JOptionPane.showMessageDialog(null,
					"O valor de " + Utils.doubleToString(valor) + " foi resgatado na Conta Corrente com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Valor não resgatado. Verique o saldo e/ou valor inserido!");
		}
	}

	public String getNumConta() {
		return this.numConta;
	}

	public void setNumConta(String numConta) {

		this.numConta = numConta;
	}

}
