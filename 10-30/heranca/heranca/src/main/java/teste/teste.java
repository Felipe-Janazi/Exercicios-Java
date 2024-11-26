package teste;

import agregacao.Faculdade;
import heranca.Aluno;
import heranca.AlunoPos;

public class teste {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno("RA123", "Bob da Silva", 5.6, 9.9, 4);
        AlunoPos alunoPos01 = new AlunoPos("RA234", "Xampson", 4.6, 2.4, 3, 4.7, 10.0);

        Faculdade faculdade01 = new Faculdade("SPTech");
        faculdade01.matricular(aluno01);
        faculdade01.matricular(alunoPos01);

        System.out.println("Exibindo todos os alunos");
        faculdade01.exibirAlunos();

        System.out.println("Exibindo notas do TCC");
        System.out.println(faculdade01.somaNotasDeTcc());
    }
}
