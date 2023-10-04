package exercicio3;

public class Conta {
    int numero;
    String titular;
    double saldo;
    double limite;

    void deposita (double valor) {
    this.saldo = this.saldo + valor;
    }

    public boolean sacar (double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }
}
