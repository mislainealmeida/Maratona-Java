package academy.devdojo.maratonajava.Aintroducao.exercicios;

public class Ex02Condicionais {
    public static void main(String[] args) {

        double salarioAnual = 70000;
        double imposto = 0;
        double salarioAtual=0;
        if(salarioAnual>0 && salarioAnual <= 34.712){
            imposto = (salarioAnual * 9.70)/100;
            salarioAtual= salarioAnual - imposto;
            
        } else if (salarioAnual >=3.713 && salarioAnual<= 37.35) {
            imposto = (salarioAnual * 37.35)/100;
            salarioAtual= salarioAnual - imposto;
            
        } else if(salarioAnual>= 68.588){
            imposto = (salarioAnual * 49.50)/100;
            salarioAtual= salarioAnual - imposto;
        }else{
            System.out.println("Valor inválido. Digite um maior que 0");
            
        }
        System.out.println("Seu salário anual é $"+salarioAnual+ " e o imposto a ser pago é de $"+imposto+ ", portanto vocÊ terá $"+ salarioAtual);

    }
}
