package academy.devdojo.maratonajava.BorientacaoObjetos.exercicios.ex04;

public class Teste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras, 152");
        Aluno aluno1 = new Aluno("Ana",20);
        Aluno aluno2 = new Aluno("José", 17);
        Professor professor = new Professor("Willian", "Java");
        Aluno[] alunosSeminario={aluno1, aluno2};
        Seminario seminario = new Seminario("Como funciona o Java", alunosSeminario,local);
        Seminario[] seminaiosDisponiveis={seminario};
        professor.setSeminarios(seminaiosDisponiveis);

        professor.imprime();



    }
}
