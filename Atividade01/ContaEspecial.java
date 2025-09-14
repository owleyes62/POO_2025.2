public class ContaEspecial {
    ContaBancaria conta = new ContaBancaria();
    float limite = conta.saldo / 2;

    public boolean sacar(float valor) {
        if (valor > 0 && valor <= conta.saldo + limite) {
            conta.saldo -= valor;
            return true;
        }
        return false;
    }
}
