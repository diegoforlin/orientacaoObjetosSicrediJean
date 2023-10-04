package exercicio1;

import java.util.Scanner;

public class avaliacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo/a à calculadora de média aritmética");
        System.out.println("Digite o primeiro número");
        float nota1 = scanner.nextFloat();
        System.out.println("Digite o segundo número");
        float nota2 = scanner.nextFloat();
        System.out.println("Digite o terceiro número");
        float nota3 = scanner.nextFloat();
        System.out.println("A média aritmética entre os três números é " + (nota1 + nota2 + nota3) / 3);

        System.out.println("Bem-vindo/a à calculadora de média ponderada");
        System.out.println("Digite o primeiro número");
        float nota1P = scanner.nextFloat(); // observação: nota1P = P é abreviação de ponderada;
        System.out.println("Digite o segundo número");
        float nota2P = scanner.nextFloat();
        System.out.println("Digite o terceiro número");
        float nota3P = scanner.nextFloat();
        System.out.println("A média ponderada entre os três números é " + ((nota1P * 2 + nota2P * 3 + nota3P* 4) / (2 + 3 + 4)));

        scanner.close();
    }
}