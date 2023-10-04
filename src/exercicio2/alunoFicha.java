package exercicio2;

public class alunoFicha {

    public static void main(String[] args) {
        Aluno primeiraFicha = new Aluno();
        primeiraFicha.nome = "Jean Matias";
        primeiraFicha.curso = "Python";
        System.out.println("O discente se chama " + primeiraFicha.nome + " e cursa " + primeiraFicha.curso);

        Aluno segundaFicha = new Aluno();
        segundaFicha.nome = "Patrícia";
        segundaFicha.curso = "Libras";
        System.out.println("A discente se chama " + segundaFicha.nome + " e cursa " + segundaFicha.curso);

        System.out.println(primeiraFicha.nome);
        System.out.println(primeiraFicha.curso);
        System.out.println(segundaFicha.nome);
        System.out.println(segundaFicha.curso);

        primeiraFicha.avaliacao = 6.3;
        primeiraFicha.conceito = "C";

        segundaFicha.avaliacao = 9.8;
        segundaFicha.conceito = "A";

        System.out.println("O aluno " + primeiraFicha.nome + " tirou a nota " + primeiraFicha.avaliacao + " e ficou" +
                " com conceito " + primeiraFicha.conceito);
        System.out.println("A aluna " + segundaFicha.nome + " tirou a nota " + segundaFicha.avaliacao + " e ficou " +
                " com conceito " + segundaFicha.conceito);
    }
}
