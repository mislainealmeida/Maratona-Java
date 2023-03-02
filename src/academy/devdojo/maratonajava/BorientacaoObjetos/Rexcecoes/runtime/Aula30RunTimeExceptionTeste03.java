package academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.runtime;

public class Aula30RunTimeExceptionTeste03 {
    public static void main(String[] args) {
        abreConexao();
    }
    public static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    public static void abrirConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        }finally{
            System.out.println("Fechando recurso liberado pelo SO");
        }

    }
}
