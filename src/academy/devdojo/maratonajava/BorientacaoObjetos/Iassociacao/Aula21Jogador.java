package academy.devdojo.maratonajava.BorientacaoObjetos.Iassociacao;

public class Aula21Jogador {
    private String nome;
    private Aula21Time time;

    public Aula21Jogador(String nome) {
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

    public Aula21Time getTime() {
        return time;
    }

    public void setTime(Aula21Time time) {
        this.time = time;
    }
}

