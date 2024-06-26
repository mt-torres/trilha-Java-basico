import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void imprimirContas() {
	    System.out.printf("%-20s %-10s %-10s %-15s%n", "Cliente", "Agência", "Número", "Saldo");
	    System.out.println("--------------------------------------------------------------");
		for(int i = 0; i < contas.size(); i ++) {
			String cliente = contas.get(i).getCliente().getNome();
			int agencia = contas.get(i).getAgencia();
			int numero = contas.get(i).getNumero();
			double saldo = contas.get(i).getSaldo();
			
			System.out.printf("%-20s %-10d %-10d %-15.2f%n", cliente, agencia, numero, saldo);		}
	}
	
	

}
