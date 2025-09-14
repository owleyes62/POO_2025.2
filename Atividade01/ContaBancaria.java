public class ContaBancaria {
    String cliente;
    int num_conta;
    float saldo;

    boolean sacar(float valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    boolean depositar(float valor){
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }
}
