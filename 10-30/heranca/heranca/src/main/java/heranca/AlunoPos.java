package heranca;

public class AlunoPos extends Aluno{
    private Double notaTcc;
    private Double notaArtigo;

    public AlunoPos(String ra,
                    String nome,
                    Double notaEntrega,
                    Double notaPratica,
                    Integer qtdFaltas,
                    Double notaTcc,
                    Double notaArtigo) {
        super(ra, nome, notaEntrega, notaPratica, qtdFaltas);
        this.notaTcc = notaTcc;
        this.notaArtigo = notaArtigo;
    }

    @Override
    public Double calcularMedia() {
        return (notaEntrega + notaPratica + notaArtigo + notaTcc) / 4.0;
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }

    public Double getNotaArtigo() {
        return notaArtigo;
    }

    public void setNotaArtigo(Double notaArtigo) {
        this.notaArtigo = notaArtigo;
    }

     @Override
     public String toString() {
         return """
                %s
                Nota TCC: %.2f
                Nota Artigo: %.2f""".formatted(super.toString(), notaTcc, notaArtigo);
     }
}
