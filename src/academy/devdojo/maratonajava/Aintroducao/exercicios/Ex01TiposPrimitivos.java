package academy.devdojo.maratonajava.Aintroducao.exercicios;

public class Ex01TiposPrimitivos {
    public static void main(String[] args) {
        String nome= "Mislaine";
        String endereco= "Rua 10";
        double salario = 2500.53;
        String dataRecebimento = "29/12/2022";
        String relatorio = "Eu "+ nome + ", morando no endereço "+ endereco + ",\nconfirmo que recebi o salário de R$"+ salario + ", na data "+ dataRecebimento+".";

        //System.out.println("Eu "+ nome + ", morando no endereço "+ endereco + ",\nconfirmo que recebi o salário de R$"+ salario + ", na data "+ dataRecebimento+".");
        System.out.println(relatorio);
    }
}
