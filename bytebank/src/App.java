import entitites.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();

        conta.setSaldo(200.00);

        System.out.println(conta.getSaldo());

        conta.adicionarSaldo(100);

        System.out.println(conta.getSaldo());

        conta.removerSaldo(50);

        System.out.println(conta.getSaldo());
    }
}
