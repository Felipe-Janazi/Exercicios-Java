import java.util.ArrayList;
import java.util.List;

public class RevisaoListas {
    public static void main(String[] args) {


//        List<String> frutasImutaveis = new ArrayList<>();
//
//        frutasImutaveis.add("Laranja");
//        frutasImutaveis.add("Goiaba");
//
//        System.out.println(frutas);

//        List<String> frutasImutaveis = List.of("laranja", "Goiada", "Limão");
//        System.out.println(frutasImutaveis);

        List<String> frutasImutaveis = new ArrayList<>(
                List.of("laranja", "Goiaba", "Limão")
        );

        frutasImutaveis.add("Uva");
        frutasImutaveis.add("Goiaba");


        System.out.println(frutasImutaveis);

        frutasImutaveis.set(2, "Melancia");
        System.out.println(frutasImutaveis);

        System.out.println(frutasImutaveis.get(0));

        frutasImutaveis.remove(0);
        System.out.println(frutasImutaveis);

        frutasImutaveis.remove("Goiaba");
        System.out.println(frutasImutaveis);


        for (int i = 0; i < frutasImutaveis.size(); i++) {
            System.out.println(frutasImutaveis.get(i));
        }

        System.out.println("Iterando listas com for aprimorado");
        for (String frutaDaVez : frutasImutaveis){
            System.out.println(frutaDaVez);
        }

//        frutasImutaveis.fori = for seguinte do 0 até o tamanho da lista
//        frutasImutaveis.for = for aprimorado
//        frutasImutaveis.forr = for ao contrario
    }
}
