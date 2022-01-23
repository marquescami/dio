
public class ContaPoupanca extends Conta{
	
	private static int SEQUENCIAL = 100;
	
	public ContaPoupanca() {
		super.agencia = Conta.AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
		Cliente cliente;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("******** Extrato Conta Poupança ********");
		System.out.println(String.format("Agencia: %d", super.agencia));
		System.out.println(String.format("Número: %d", super.numero));
		System.out.println(String.format("Saldo: %.2f", super.saldo));
	}
}
