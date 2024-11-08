import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class testecurso2 {
    public static void main(String[] args) {

        curso javacolecoes = new curso("dominando  coleções do java paulo silveira");


        javacolecoes.adiciona(new aula("trabalhando com arraylist", 21));
        javacolecoes.adiciona(new aula("criando uma aula", 20));
        javacolecoes.adiciona(new aula("modelando com coleções", 24));

        List<aula> aulasImutaveis = javacolecoes.getaulas();
        System.out.println(aulasImutaveis);

         List<aula> aulas = new ArrayList<>(aulasImutaveis);


        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javacolecoes.getempototal());

        System.out.println(javacolecoes);



    }
}