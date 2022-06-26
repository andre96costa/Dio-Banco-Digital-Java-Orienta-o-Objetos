public class ContaPoupanca extends Conta {

    private final String tipo = "P";

    public ContaPoupanca(int agencia, int conta, double saldo, Cliente cliente) {
        super(agencia, conta, saldo, cliente);
    }

    public String getTipo() {
        return tipo;
    }
}
