public class Bicicleta extends Veiculo{

    private Double calibragemPneu;

    public Bicicleta(String nomeCliente, String marca, Integer anoFabricacao, Double calibragemPneu) {
        super(nomeCliente, marca, anoFabricacao);
        this.calibragemPneu = calibragemPneu;
    }

    @Override
    public void exibirRelatorio() {
        System.out.println("Relatório da bicicleta de: " + nomeCliente);

        if (calibragemPneu < 0.2){
            System.out.println("Precisa calibrar o pneu da bike.");
        } else {
            System.out.println("Pneu já está calibrado");
        }
    }


    public Double getCalibragemPneu() {
        return calibragemPneu;
    }

    public void setCalibragemPneu(Double calibragemPneu) {
        this.calibragemPneu = calibragemPneu;
    }
}
