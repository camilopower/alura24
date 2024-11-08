import java.util.ArrayList;
import java.util.Collections;

public class testelistadeaula {
    public static void main(String[] args) {

        aula a1 = new aula("revistando as arraylists", 21);
        aula a2 = new aula("lista de objetos", 15);
        aula a3 = new aula("relacionamento de lista e objetos", 15);


        ArrayList<aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

    }
}
