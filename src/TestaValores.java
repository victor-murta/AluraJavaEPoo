public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta(123, 24);

        Conta conta1 = new Conta(124, 15);

        conta.setAgencia(12);
        System.out.println(conta.getAgencia());

        System.out.println(Conta.getTotal());

    }
}
