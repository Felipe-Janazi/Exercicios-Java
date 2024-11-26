import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(
                List.of(1, 2, 10, 25, -6, 12)
        );

        Integer valor = 10;
        numeros.remove(valor);
        System.out.println(numeros);

    }
}
