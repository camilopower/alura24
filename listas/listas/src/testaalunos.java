import java.util.*;

public class testaalunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("rodrigo turini");
        alunos.add("nico steppat");
        alunos.add("sergio lopes");
        alunos.add("renan sagiio");
        alunos.add("mauricio aniche");
        alunos.add("alberto souza");

        boolean pauloestamatriculado=  alunos.contains("paulo silveira");
        System.out.println(pauloestamatriculado);


        System.out.println(alunos.size());



        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {
                    System.out.println(aluno);
                });



        System.out.println(alunos);

        List<String> alunsosEmLista = new ArrayList<>(alunos);
    }
}

