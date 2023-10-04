package VisibilidadeFaltas;
import java.util.Scanner;

public class notesTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Nota nota = new Nota();

        nota.setNota1(9.8);
        nota.setNota2(5.2);

        double nota1 = nota.getNota1();
        double nota2 = nota.getNota2();

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);

        int faltas = 0;
        int faltasRestantes = 7 - faltas;

        System.out.println("Vamos calcular as suas faltas agora. Digite o número de faltas.");
        faltas = scan.nextInt();
        faltasRestantes = 7 - faltas;
        System.out.println("Você tem " + faltas + " faltas e faltam " + faltasRestantes + " faltas");

    }
}
