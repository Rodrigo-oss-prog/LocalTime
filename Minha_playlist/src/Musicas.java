import java.time.LocalTime;

public class Musicas
{
    private String titulo;
    private String artista;
    private String estilo;
    private LocalTime duracao;

    public Musicas(String titulo, String artista, String estilo, LocalTime duracao) {
        this.setTitulo(titulo);
        this.setArtista(artista);
        this.setEstilo(estilo);
        this.setDuracao(duracao);
    }


    public void mostrarDados(){
        System.out.println("\nTítulo: " + getTitulo() +
                            "\n Artista: " + getArtista() +
                            "\nEstilo: " + getEstilo() +
                            "\nDuração: " + getDuracao());
    }




    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }
}

