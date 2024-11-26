import java.util.ArrayList;
import java.util.List;

public class RelatorioMetodos {

    Integer buscarQuantidadeVendas(List<Double> precos) {
        Integer tamanhoLista = precos.size();
        return tamanhoLista;
    }

    Double somarVendas(List<Double> precos){

        Double valorFinal = 0.0;

        for (int i = 0; i < precos.size(); i++) {
            valorFinal += precos.get(i);
        }

        return valorFinal;
    }


    Boolean buscarPreco(List<Double> precos, Double valorEscolhido){

        for (int i = 0; i < precos.size(); i++) {

            if (precos.get(i).equals(valorEscolhido)) {
                return true;
            }
        }
        return false;

    }

    Double maiorPreco (List<Double> precos){

        Double maiorValor = 0.0;
        for (int i = 0; i < precos.size(); i++) {

            if(precos.get(i) >  maiorValor){
                maiorValor = precos.get(i);
            }

        }
        return maiorValor;
    }

    Double buscarMenorPreco (List<Double> precos){

        Double menorValor = 99999999999999999999999999999999999999999.9;
        for (int i = 0; i < precos.size(); i++) {

            if(precos.get(i) <  menorValor){
                menorValor = precos.get(i);
            }

        }
        return menorValor;
    }


    List<Double> buscarPorPrecoMinimo(List<Double> precos, Double filtro){

        List<Double> listaFiltrada = new ArrayList<>();
        for (int i = 0; i < precos.size(); i++) {

            if (precos.get(i) >= filtro){
                listaFiltrada.add(precos.get(i));
            }
        }
        return listaFiltrada;
    }
}
