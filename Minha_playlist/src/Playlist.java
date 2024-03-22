
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musicas> musicas = new ArrayList<>();

    public Playlist(String nome) {
        this.setNome(nome);
        this.setMusicas(musicas);
    }

    public LocalTime calcularDuracao(){
        LocalTime soma = LocalTime.of(0,0,0);
        for (Musicas m: musicas)
            soma = soma.plusHours(m.getDuracao().getHour()).plusMinutes(m.getDuracao()
                    .getMinute()).plusSeconds(m.getDuracao().getSecond());
        return soma;
    }
    public void  adicionarMusicas(Musicas...m){
        Collections.addAll(musicas, m);
    }

    public void mostraDados(){
        System.out.println("Nome da playlist: " + nome +
                            "\nMúsicas: ");
        for (Musicas m: musicas){
            m.mostrarDados();

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musicas> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musicas> musicas) {
        this.musicas = musicas;
    }
}
