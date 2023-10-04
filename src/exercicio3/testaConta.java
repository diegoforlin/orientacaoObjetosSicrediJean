package exercicio3;

public class testaConta {
    public static void main(String[] args) {
        Conta narutoConta = new Conta();
        narutoConta.saldo = 1000;
        narutoConta.deposita(1000);

        System.out.println("O saldo da conta de Naruto é: " + narutoConta.saldo);
        System.out.println(narutoConta.sacar(5000));
        System.out.println(narutoConta.saldo);




    }
}
