public class Matricula {
    private Disciplina disciplina;
    private float nota1;
    private float nota2;
    private float nota3;
    private float frequencia;
    private float media;
    
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public Matricula(Disciplina disciplina, float nota1, float nota2, float nota3, float frequencia) {
        this.disciplina = disciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.frequencia = frequencia;
    }

    public float calcularMedia(){
        this.media = (nota1+nota2+nota3)/3;
        return this.media;
    }
   
    public boolean verificarAprovacao(){
        if(calcularMedia()>=5f&&frequencia>=0.75f){
            return true; 
        }
    return false;
    }

    

}
