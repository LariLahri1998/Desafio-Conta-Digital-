package bancodigital;

public class Main {

    public static void main(final String[] args) {
    	Conta cc= new ContaCorrente();
    	Conta poupanca = new ContaPoupanca();
    	
        System.out.println("Contas criadas com sucesso!");

      cc.imprimirExtrato();
      poupanca.imprimirExtrato();
        
    }
}
