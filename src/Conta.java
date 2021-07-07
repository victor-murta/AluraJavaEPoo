//double saldo == atributo

public class Conta {
    // não pode ser lido nem modificado além da classe Conta
    private double saldo ;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    //cada conta tem um saldo , agencia e ....
    //ao colocar o static o total não se refencia mais `refereência de objeto e sim à classe

    public Conta(int agencia, int numero){
        // this = referente à essa instância da classe (referência do objeto)
        // Conta = referente à classe conta
        Conta.total++;
        System.out.println("O total de contas é : " + total);
        System.out.println("Criando conta: "+ numero);
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor){
        this.saldo += valor;
        System.out.println("Depositado: " + this.saldo);
    }

    public boolean sacar(double valor){
        if ( this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Sacando: " + this.saldo);
            return true;
        }else{
            System.out.println("Salndo insuficiente!");
            return false;
        }
    }

    public boolean transferir( double valor, Conta destino){
        if ( this.saldo < valor){
            return false;
        }else{
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public int setNumero(int novoNumero){
        if( (Integer.toString(novoNumero)).length() > 3 ){
            System.out.println("Números inválidos, insira-os novamente!!! ");
        }
        return this.numero = novoNumero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Número da agência inserida de forma errada!!! ");
        }else{
            this.agencia = agencia;
        }
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal(){
        // não se pode usar o "this",pois o static é referente à classe e não à referencia de objeto intanciado
        // System.out.println(this.saldo);
        return Conta.total;
    }

}
