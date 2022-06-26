public abstract class Conta {
    private int agencia;
    private int conta;
    private double saldo;

    private Cliente cliente;

    public Conta(int agencia, int conta, double saldo, Cliente cliente) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public double sacar(double valor){
        if (valor > this.saldo){
            return -1;
        }
        double saque = this.saldo - valor;
        this.saldo -= valor;
        return saque;
    }

    public String depositar(double valor){
        if (valor <= 0) {
             return "Valor invalido";
        }
        this.saldo += valor;
        return "Deposito realizado";
    }

    public String transferir(double valor, Conta contaDestino){
        if (valor <= 0 && contaDestino == null) {
            return "Não foi possível realizar a transferencia";
        }
        this.saldo -= valor;
        return contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
