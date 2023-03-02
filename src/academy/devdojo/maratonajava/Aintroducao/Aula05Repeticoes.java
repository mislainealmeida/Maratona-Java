package academy.devdojo.maratonajava.Aintroducao;

public class Aula05Repeticoes {
    public static void main(String[] args) {
        int count= 0;
        while(count<10){
            System.out.print(count+" ");
            count +=1;
        }
        System.out.println();
        System.out.println("-----------------------");


        count=12;
        do{
            System.out.println("dentro do do-while");
        }while(count < 10);
        System.out.println();
        System.out.println("-----------------------");

        for(int i=0; i<10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------");

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if(i > 25){
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------");

        double valorTotal= 30000;
        for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal/parcela;
            if(valorParcela<1000){
                continue;
            }
            System.out.println("Parcela "+parcela+ " R$"+valorParcela);


        }
    }
}
