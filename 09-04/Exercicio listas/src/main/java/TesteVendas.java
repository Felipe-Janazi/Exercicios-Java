import java.util.ArrayList;
import java.util.List;

public class TesteVendas {
    public static void main(String[] args) {

        RelatorioMetodos metodo = new RelatorioMetodos();

        List<Double> precos = new ArrayList<>(
                List.of(3.0, 1.99, 4.2, 7.89, 4.78, 1.34, 11.1, 5.6, 7.89, 4.10, 9.11, 1.0, 0.3)
        );

        Integer qtdValores =
                metodo.buscarQuantidadeVendas(precos);
        System.out.println(qtdValores);

        Double valorTotal =
                metodo.somarVendas(precos);
        System.out.println(valorTotal);

        Double valorEscolhido = 3.0;
        Boolean temOuNao =
                metodo.buscarPreco(precos, valorEscolhido);
        System.out.println(temOuNao);

        Double maiorPreco =
                metodo.maiorPreco(precos);
        System.out.println(maiorPreco);

        Double menorPreco =
                metodo.buscarMenorPreco(precos);
        System.out.println(menorPreco);

        Double filtro = 5.0;
        List<Double> precosAcima =
                metodo.buscarPorPrecoMinimo(precos, filtro);
        System.out.println(precosAcima);
    }
}
