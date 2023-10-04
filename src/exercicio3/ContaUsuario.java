package exercicio3;


public class ContaUsuario {

    public static void main(String[] args) {

        Conta narutoConta = new Conta();

        narutoConta.titular = "Uzumaki Naruto";
        narutoConta.numero = 424242;
        narutoConta.saldo = 1000;
        narutoConta.limite = 2000;

        System.out.println(narutoConta.titular);
        System.out.println(narutoConta.saldo);


    }
}