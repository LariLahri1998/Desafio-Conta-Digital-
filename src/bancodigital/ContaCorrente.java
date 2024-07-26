package bancodigital;

public class ContaCorrente extends Conta{

	
	private int SEQUENCIAL;

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
		super.agencia = Conta.AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
		

	}

	@Override
	public void imprimirExtrato() {
			System.out.println(" === Extrato Conta Corrente ===");
			super.imprimirInfocomuns();
			

		
	}

	
}
