public enum Plano {
    BRONZE("Plano mais em conta", 80.99),
    PRATA("Plano ideal", 90.80),
    OURO("Plano perfeito", 100.80);

    private final String descricao;
    private final Double valor;

    Plano(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}
