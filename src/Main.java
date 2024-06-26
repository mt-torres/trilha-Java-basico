
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		Cliente marcos = new Cliente();
		Cliente lilian = new Cliente();
		venilton.setNome("Venilton");
		marcos.setNome("Marcos");
		lilian.setNome("Xuxu");
		
		Conta cc = new ContaCorrente(venilton);
		Conta ccMarcos = new ContaCorrente(marcos);
		Conta ccLilian = new ContaCorrente(lilian);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		ccMarcos.depositar(500);
		ccLilian.depositar(1500);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Banco banco = new Banco();
		banco.adicionarConta(poupanca);
		banco.adicionarConta(cc);
		banco.adicionarConta(ccMarcos);
		banco.adicionarConta(ccLilian);
		banco.imprimirContas();
		
		
	}

}
