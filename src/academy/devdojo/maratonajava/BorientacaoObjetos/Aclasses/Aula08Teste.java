package academy.devdojo.maratonajava.BorientacaoObjetos.Aclasses;

public class Aula08Teste {
    public static void main(String[] args) {
        Aula08Estudante estudante = new Aula08Estudante();
        estudante.nome= "Mislaine";
        estudante.idade= 29;

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

        Aula08Estudante estudante1= new Aula08Estudante();
        estudante1.nome= "Larissa";
        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);


        
    }
}
