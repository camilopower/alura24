public class aluno {

    private String nome;
    private int numeroMatricula;

    public static void get(int i) {
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public aluno(String nome, int numeroMatricula) {
        if(nome ==null) {
            throw new NullPointerException("nome nao pode ser null");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String toString() {
        return "[aluno: " + this.nome + " , matricula: " + this.numeroMatricula + "]";
    }

    public boolean equals(Object obj) {
        aluno outro = (aluno) obj;
        return this.nome.equals(outro.nome);
    }
    public int hashcode() {
        return this.nome.charAt(0);
    }
  }

