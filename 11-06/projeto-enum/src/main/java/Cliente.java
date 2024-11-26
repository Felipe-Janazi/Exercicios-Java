public class Cliente {

    private String nome;
    private Integer qtdEstrelas;
    private Plano plano;

    public Cliente(String nome, Integer qtdEstrelas, Plano plano) {
        this.nome = nome;
        this.qtdEstrelas = qtdEstrelas;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdEstrelas() {
        return qtdEstrelas;
    }

    public void setQtdEstrelas(Integer qtdEstrelas) {
        this.qtdEstrelas = qtdEstrelas;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
}
