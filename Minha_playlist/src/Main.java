import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("Seleção de músicas");
        Musicas m1 = new Musicas("Musica1", "Artista1", "Doido",
                LocalTime.of(0,10,03));
        Musicas m2 = new Musicas("Música2", "Artist2", "Miudinho",
                LocalTime.of(0,5,30));

        Playlist play1 = new Playlist("Sortidas");
        play1.adicionarMusicas(m1,m2);
        System.out.println("Mostrar playlist: \n");
        play1.mostraDados();
        System.out.println();
        System.out.println("Tempo de duração desta playlist: ");
        System.out.println(play1.calcularDuracao());


    }
}