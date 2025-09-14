public class ContaPoupanca {
    ContaBancaria conta = new ContaBancaria();
    int diaDeRendimento;

    public float calcularNovoSaldo(float taxa, float saldo) {
        return saldo + (saldo * taxa);
    }
}