

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.HashSet;
import java.util.*;

public class curso {

    private string nome;

    private string instructor;

    private List<aula> aulas = new LinkedList<aula>();

    private Set<aluno> alunos = new HashSet<>();
    private Map<Integer, aluno> matriculaparaluno = new HashMap<>();

    public curso(String nome) {
    }


    public string getnome() {
        return nome;

    }

    public string getInstructor;

    {

    }

    public List<aula> getaulas() {
        return Collections.unmodifiableList(aulas);

    }

    public void adiciona(aula aula) {
        this.aulas.add(aula);
    }


    public curso(string nome, string instructor) {
        this.nome = nome;
        this.instructor = instructor;
    }

    public int getempototal() {
        return this.aulas.stream().mapToInt(aula::getTempo).sum();
    }

    public String toString() {
        return "[curso:" + nome + ", tempo total:" + this.getempototal() + "," +
                "aulas: " + this.aulas + "]";
    }

    public void matricula(aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaparaluno.put(aluno.getNumeroMatricula(), aluno);
    }


    public Set<aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estamatriculado(aluno aluno) {
        return this.alunos.contains(aluno);

    }

    public  aluno buscamatriculado(int numero) {
        return matriculaparaluno.get(numero);
    }











}


