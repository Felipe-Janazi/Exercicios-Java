public class Teste {
    public static void main(String[] args) {

        Musica musica01 = new Musica("Billie Jean", "Michael J.", 4.5);
        musica01.curtir();
        musica01.curtir();
        musica01.curtir();

        Musica musica02 = new Musica("Exagerado", "Cazuza", 3.2);
        musica02.curtir();

        System.out.println(musica01);
        System.out.println(musica02);

        Album album01 = new Album("Tops 90s", 3);
        album01.adicionarMusica(musica01);

        Album album02 = new Album("Favoritas", 10);
        album02.adicionarMusica(musica01);
        album02.adicionarMusica(musica02);

        System.out.println("Exibindo por likes:");
        album02.exibirMusicaPorQtdLikes(2);

    }
}
