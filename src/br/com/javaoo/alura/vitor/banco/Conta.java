package br.com.javaoo.alura.vitor.banco;



public class Conta {
    private double saldo;
    private Long agencia;
    private Long numero;
    private Cliente titular;
    private static int totalSaques;

    public Conta() {

    }

    public Conta(double saldo, Long agencia, Long numero, Cliente titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Long getAgencia() {
        return agencia;
    }

    public void setAgencia(Long agencia) {
        this.agencia = agencia;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotalSaques() {
        return totalSaques;
    }

    public static void setTotalSaques(int totalSaques) {
        Conta.totalSaques = totalSaques;
    }

    public void transferir(Conta contaRemetente , double valor, Conta contaDestino){
        if(this.saldo < valor){
            System.out.println("Valor informado ultrapassa o saldo da conta remetente");
            return;
        }else{
            contaRemetente.setSaldo(this.saldo  - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.printf("Saldo da conta Remetente: %s%n", contaRemetente.getSaldo());
            System.out.printf("Saldo conta destino: %s%n", contaDestino.getSaldo());

        }

    }

    public void depositar( double valor){
            this.saldo = (this.saldo   + valor);
            System.out.printf("Saldo da conta Remetente: %s%n", this.saldo );
    }

    public void sacar( double valor){
        totalSaques ++;
        if(this.saldo  < valor){
            System.out.println("Valor informado ultrapassa o saldo da conta remetente");
            return;
        }else{
            this.saldo = (this.saldo -  valor);
            System.out.printf("Saldo da conta Remetente: %s%n", this.saldo );
            System.out.println("Total de saques feitos: " + totalSaques);
        }

    }
}
