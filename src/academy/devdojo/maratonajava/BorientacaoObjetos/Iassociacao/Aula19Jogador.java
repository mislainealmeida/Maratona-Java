package academy.devdojo.maratonajava.BorientacaoObjetos.Iassociacao;

public class Aula19Jogador {
    private String nome;
    //unilateral
    private Aula19Time time;

    public Aula19Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(time != null){
            System.out.println(time.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aula19Time getTime() {
        return time;
    }

    public void setTime(Aula19Time time) {
        this.time = time;
    }
}
