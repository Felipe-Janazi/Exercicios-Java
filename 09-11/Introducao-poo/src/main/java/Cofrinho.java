import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {

    private String meta;
    private Double valorTotal;
    private Boolean inteiro;

    public Cofrinho(String meta) {
        this.meta = meta;
        this.valorTotal = 0.0;
        this.inteiro = true;
    }

//    Nesse caso, se a pessoa não passar a meta ela vai ser automáticamente não possui
//    O java vê quais os argumentos que estão sendo passados e seleciona qual construtor vai ser utilizado
//    pela quantidade de parametros.

    public Cofrinho(Double valorTotal, Boolean inteiro) {
        this.meta = "Não possui";
        this.valorTotal = valorTotal;
        this.inteiro = inteiro;
    }


    public void depositarValor (Double deposito){
        if (inteiro && deposito > 0.0){
            valorTotal += deposito;
            System.out.println("Depósito efetuado com sucesso!");
        } else {
            System.out.println("Erro ao depositar !");
        }
    }


//    Com o metodo abaixo criamos um metdoo que vai ser utilizado por outras classes, mas caso eu
//    precise de um metodo para apenas um metodo criamos ele de forma privada
//    Boolean podeDepositar(Double valorTotal){
//        if (inteiro && deposito > 0.0) {
//        return true;
//        }
//        return false;
//        }
//    }
//  Metodo sobrecarregado
    public void depositarValor (Double deposito, Double valorDesconto){
        if (inteiro && deposito > 0.0){
            valorTotal += (deposito - valorDesconto);
            System.out.println("Depósito efetuado com sucesso!");
        } else {
            System.out.println("Erro ao depositar !");
        }
    }

    public Double agitar (){
        if (inteiro){
            Double agitado = ThreadLocalRandom.current().nextDouble(0, valorTotal);
            valorTotal -= agitado;
            return agitado;
        }
        return null;
    }


    public Double quebrar (){
        if (inteiro){
            inteiro = false;
            Double antesZerar = valorTotal;
            valorTotal = 0.0;
            return antesZerar;
        }
        return null;
    }

    public Double retornaValorGuardado(){
        return valorTotal;
    }

    public void  alteraMeta(String meta){
        this.meta = meta;
    }

}
