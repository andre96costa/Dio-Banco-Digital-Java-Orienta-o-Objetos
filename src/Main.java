public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("BancoDio");
        System.out.println(banco.getNome());

        Cliente cliente1 = new Cliente("Andre");
        Cliente cliente2 = new Cliente("Micaela");
        Cliente cliente3 = new Cliente("Pedro");

        Conta contaAndre = new ContaCorrente(00001, 01, 5000, cliente1);
        Conta contaMicaela = new ContaPoupanca(00001, 02, 8000, cliente2);
        Conta contaPedro = new ContaCorrente(00002, 02, 10000, cliente3);

        banco.novaConta(contaAndre);
        banco.novaConta(contaMicaela);
        banco.novaConta(contaPedro);


        System.out.println(contaAndre.getCliente().getNome());
        System.out.println("Conta: " + contaAndre.getConta());
        System.out.println("Agencia: " + contaAndre.getAgencia());
        System.out.println("Saldo: " + contaAndre.getSaldo());
        System.out.println("=====================================================");

        System.out.println(contaMicaela.getCliente().getNome());
        System.out.println("Conta: " + contaMicaela.getConta());
        System.out.println("Agencia: " + contaMicaela.getAgencia());
        System.out.println("Saldo: " + contaMicaela.getSaldo());
        System.out.println("=====================================================");

        System.out.println(contaPedro.getCliente().getNome());
        System.out.println("Conta: " + contaPedro.getConta());
        System.out.println("Agencia: " + contaPedro.getAgencia());
        System.out.println("Saldo: " + contaPedro.getSaldo());
        System.out.println("=====================================================");

        System.out.println(contaAndre.getCliente().getNome());
        System.out.println("Conta: " + contaAndre.getConta());
        System.out.println("Agencia: " + contaAndre.getAgencia());
        System.out.println("Saldo anterior: " + contaAndre.getSaldo());
        System.out.println(contaAndre.transferir(4000, contaMicaela));
        System.out.println("Saldo atual: " + contaAndre.getSaldo());
        System.out.println("=====================================================");

        System.out.println(contaMicaela.getCliente().getNome());
        System.out.println("Conta: " + contaMicaela.getConta());
        System.out.println("Agencia: " + contaMicaela.getAgencia());
        System.out.println("Saldo: " + contaMicaela.getSaldo());
        System.out.println("=====================================================");

        System.out.println(contaAndre.getCliente().getNome());
        System.out.println("Conta: " + contaAndre.getConta());
        System.out.println("Agencia: " + contaAndre.getAgencia());
        System.out.println("Saldo anterior: " + contaAndre.getSaldo());
        System.out.println(contaAndre.depositar(1000));
        System.out.println("Saldo atual: " + contaAndre.getSaldo());
        System.out.println("=====================================================");

    }
}
