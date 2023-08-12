import java.util.ArrayList;

public class Disciplina{
    private String nome;
    private int ch;
    private ArrayList<Estudante> estudantesInscritos;

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCh() {
        return ch;
    }
    public void setCh(int ch) {
        this.ch = ch;
    }
    
    
    public Disciplina(String nome, int ch) {
        this.nome = nome;
        this.ch = ch;
        this.estudantesInscritos = new ArrayList<>();
    }
    
    public void adicionarEstudante(Estudante estudante){
        estudantesInscritos.add(estudante);
    }

}