package academy.devdojo.maratonajava.BorientacaoObjetos.Iassociacao;

public class Aula20Escola {
    private String nome;
    private Aula20Professor[] professores;

    public Aula20Escola(String nome) {
        this.nome = nome;
    }

    public Aula20Escola(String nome, Aula20Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(professores == null) return;
        for (Aula20Professor professor:professores) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aula20Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Aula20Professor[] professores) {
        this.professores = professores;
    }
}
