public class aula implements  Comparable<aula> {


    public aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }


    private String titulo;
    private int tempo;


    public String getTitulo() {
        return titulo;

    }

    public int getTempo() {
        return tempo;
    }

    public String toString() {
        return "[aula:" + this.titulo + "," + this.tempo + "minutos]";

    }

    @Override
    public int compareTo(aula outraAula) {

        return this.titulo.compareTo(outraAula.titulo);
    }
}







