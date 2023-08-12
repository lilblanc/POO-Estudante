import java.util.ArrayList;


public class Estudante{
    
    private String nome;
    private String email;
    private String curso;
    private ArrayList<Disciplina> disciplinas;
    private int numeroMatricula;



   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }


   
    
    public Estudante(String nome, String email, String curso, int numeroMatricula) {
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.numeroMatricula = numeroMatricula;
        this.disciplinas = new ArrayList<>();
    
    }

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
  

    


}




  
    


