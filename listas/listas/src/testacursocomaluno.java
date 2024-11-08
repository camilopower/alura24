import java.util.Iterator;
import java.util.Set;

public class testacursocomaluno {

    public static void main(String[] args) {
        curso javacolecoes = new curso("dominando  coleções do java paulo silveira");


        javacolecoes.adiciona(new aula("trabalhando com arraylist", 21));
        javacolecoes.adiciona(new aula("criando uma aula", 20));
        javacolecoes.adiciona(new aula("modelando com coleções", 24));

        aluno a1 = new aluno("rodrigo", 34672);
        aluno a2 = new aluno("guilherme silveira", 5617);
        aluno a3 = new aluno("mauricio aniche", 17645);


        javacolecoes.matricula(a1);
        javacolecoes.matricula(a2);
        javacolecoes.matricula(a3);


        System.out.println("todos os aluno matriculados:");
        Set<aluno> alunos = javacolecoes.getAlunos();
        Iterator<aluno> iterador = alunos.iterator();
        while(iterador.hasNext()) {
            aluno proximo = iterador.next();
            System.out.println(proximo);
        }

        //for(aluno a: javacolecoes.getAlunos()) {
          //  System.out.println(a);
       // }


        System.out.println("O aluno " + a1 + "está matriculado?");
        System.out.println(javacolecoes.estamatriculado(a1));


        aluno turini = new aluno("rodrigo turini", 34672);
        System.out.println("E esse turini , está matriulado?");
        System.out.println(javacolecoes.estamatriculado(turini));


        System.out.println("0 a1 é == ao turini?");
        System.out.println(a1.hashcode() == turini.hashcode());


        System.out.println(a1.hashcode() == turini.hashcode());
    }
}
