public class ContaCorrente extends Conta {

    private final String tipo = "C";

    public ContaCorrente(int agencia, int conta, int saldo, Cliente cliente) {
        super(agencia, conta, saldo,cliente);
    }

    public String getTipo() {
        return tipo;
    }
}
