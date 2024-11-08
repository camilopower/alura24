import java.util.ArrayList;
import java.util.List;

public class testacurso{
    public static <list> void main(String[] args) {
        curso javacolecoes = new curso ("dominando as coleções do java paulo silveira");
        List<aula> aulas = javacolecoes.getaulas();
        System.out.println(aulas);

        javacolecoes.adiciona(new aula("trabalhando com arraylist", 21));
        javacolecoes.adiciona(new aula("criando uma aula", 21));
        javacolecoes.adiciona(new aula("modelando com coleções", 22));


     List<aula> aulasImutavel = javacolecoes.getaulas();
     List<aula> Aulas = new ArrayList<>(aulasImutavel);


        System.out.println(aulas);
        System.out.println(javacolecoes.getnome());
    }


}


