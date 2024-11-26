public class Teste {
    public static void main(String[] args) {
        Carro carro01 = new Carro("Bob da Silva", "But", 2024, 0.1, false);
        Bicicleta bicicleta01 = new Bicicleta("Xana", "Caloi", 2023, 0.7);
        Moto moto01 = new Moto("Xana da Silva", "Kwl", 2023, false);

        carro01.exibirRelatorio();
        bicicleta01.exibirRelatorio();
        moto01.exibirRelatorio();
    }
}