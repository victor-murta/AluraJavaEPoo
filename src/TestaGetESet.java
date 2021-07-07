public class TestaGetESet {
    public static void main(String[] args){
        Conta conta = new Conta(123,2);
        //conta.numero = 1234
        System.out.println(conta.getNumero());

        Cliente victor  = new Cliente();
        victor.setNome("Victor");
        victor.setCpf("1257369");
        victor.setProfissao("Developer");

        conta.setTitular(victor);

        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Aqui é senior");
        System.out.println(conta.getTitular().getProfissao());

    }
}
