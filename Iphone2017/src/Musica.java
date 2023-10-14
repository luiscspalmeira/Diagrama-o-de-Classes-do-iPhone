public class Musica {
    private String artista;
    private String musica;

    public Musica(String artista, String musica){
        this.artista = artista;
        this.musica = musica;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    @Override
    public String toString() {
        return " Musica:\n [Artista: " + artista + ", Musica: " + musica + "]\n\n";
    }

}
