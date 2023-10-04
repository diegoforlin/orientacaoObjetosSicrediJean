package VisibilidadeFaltas;

public class Nota {
    private double Nota1;
    private double Nota2;

    int faltas;
    public void setNota1(double v) {
        Nota1 = v;
    }

    public void setNota2(double v) {
        Nota2 = v;
    }

    public double getNota1() {
        if (Nota1 >= 9) {
            System.out.println("Aprovado com louvor");
        } else if (Nota1 >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        return Nota1;
    }

    public double getNota2() {
        if (Nota2 >= 9) {
            System.out.println("Aprovado com louvor");
        } else if (Nota2 >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        return Nota2;
    }

    public int faltas() {
        if (faltas > 7) {
            System.out.println("Você foi reprovado por faltas.");
        } else {
            int faltasRestantes = 7 - faltas;
            System.out.println("Você ainda não foi reprovado por faltas. Faltam " + faltasRestantes + " faltas.");
        }
        return faltas;
    }}