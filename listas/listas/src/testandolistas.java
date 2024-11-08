import java.util.ArrayList;

public class testandolistas {


    public static void main(String[] args) {

        String aula1 = "conhecendo mais de listas";
        String aula2 = "modelando a classe aula";
        String aula3 = "trabalhando com cursos e sets";


        ArrayList<java.lang.String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);


        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (java.lang.String aula : aulas) {
            System.out.println("aula:" + aula);


            java.lang.String primeiraaula = aulas.get(0);
            System.out.println("a primeira aula é" + primeiraaula);

            for (int i = 0; i < aulas.size(); i++) {
                System.out.println("aula:" + aulas.get(i));
            }
            aulas.add("aumentando nosso conhecimento");
            System.out.println(aulas);


        }
    }
}




