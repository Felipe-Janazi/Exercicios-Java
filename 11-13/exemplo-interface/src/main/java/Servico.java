public class Servico implements Tributavel{
    private String descricao;
    private Double valor;

    public Servico () {};

    public Servico(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }


    @Override
    public Double calcularImposto() {
        return valor * 0.2;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
