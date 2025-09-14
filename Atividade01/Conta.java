public class Conta {
    private static final int VLSAQUE = 200;
    private static final int VLDEPOSITO = 300;
    private static final float TAXA = 0.5f;
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        conta.cliente = "João";
        conta.num_conta = 12345;
        conta.saldo = 1000.0f;

        System.out.println("---Informações da conta---");
        System.out.println("Cliente: " + conta.cliente);
        System.out.println("Número da conta: " + conta.num_conta);
        System.out.println("Saldo: " + conta.saldo);
        System.out.println(); 
        System.out.println("---Saque---");
        conta.sacar(VLSAQUE);
        System.out.println("Foi sacado da sua conta: " + VLSAQUE + " R$");
        System.out.println("valor Atual na conta: " + conta.saldo);
        System.out.println(); 
        System.out.println("---Deposito---");
        conta.depositar(VLDEPOSITO);
        System.out.println("Foi depositado na sua conta: " + VLDEPOSITO + " R$");
        System.out.println("valor Atual na conta: " + conta.saldo);
        System.out.println();
        System.out.println("---valor Da Poupança---");
        System.out.println("Novo saldo redendo na poupança: " + contaPoupanca.calcularNovoSaldo(TAXA, conta.saldo));
        System.out.println();
        System.out.println("---Valor conta---");
        System.out.println("Novo saldo da conta: " + conta.saldo);
    }
}