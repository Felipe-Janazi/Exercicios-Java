public abstract class Veiculo {

    protected String nomeCliente;
    protected String marca;
    protected Integer anoFabricacao;

    public Veiculo(String nomeCliente, String marca, Integer anoFabricacao) {
        this.nomeCliente = nomeCliente;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    public abstract void exibirRelatorio();

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
