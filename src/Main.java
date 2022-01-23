
public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		cc.imprimirExtrato();
		
		Conta cp = new ContaPoupanca();
		cp.depositar(10000);
		cp.imprimirExtrato();
		cp.transferir(50,cc);
		
		cp.imprimirExtrato();
		cc.imprimirExtrato();
	}

}
