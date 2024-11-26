package agregacao;

import heranca.Aluno;
import heranca.AlunoPos;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private List<Aluno> alunos;
    private String nome;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void matricular(Aluno aluno){
        alunos.add(aluno);
    }

    public void exibirAlunos(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void exibirSomenteAlunoPos(){
        for (Aluno aluno : alunos) {

//            Se o aluno atual for usado um aluno pos para ser criado
            if (aluno instanceof AlunoPos) {
                System.out.println(aluno);
            }
        }
    }

    public Double somaNotasDeTcc () {
        Double somaNotas = 0.0;

        for (Aluno aluno : alunos) {

            if (aluno instanceof AlunoPos) {
//               Aqui estamos convertendo o objeto que era só aluno para aluno pós e ai armazenamos no objeto alunoPos
                AlunoPos alunoPosDaVez = (AlunoPos) aluno;

                somaNotas += alunoPosDaVez.getNotaTcc();
            }
        }

        return somaNotas;
    }

}
