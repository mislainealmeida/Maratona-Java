package academy.devdojo.maratonajava.BorientacaoObjetos.Cmetodos;

public class Aula11Teste {
    public static void main(String[] args) {
        Aula11Estudante estudante1 = new Aula11Estudante();
        Aula11Estudante estudante2= new Aula11Estudante();
        Aula11ImpressoraEstudante impressora = new Aula11ImpressoraEstudante();

        estudante1.nome= "Mislaine";
        estudante1.idade= 29;
        estudante1.sexo='F';

        estudante2.nome= "Larissa";
        estudante2.idade= 23;
        estudante2.sexo='F';

        impressora.imprimir(estudante1);
        impressora.imprimir(estudante2);
        System.out.println("----------------");
        impressora.imprimir(estudante1);
        impressora.imprimir(estudante2);

        System.out.println("----------------");
        System.out.println("****This****");
        estudante1.imprimir();
        System.out.println();
        estudante2.imprimir();



        
    }
}
