package academy.devdojo.maratonajava.CclassesUtilitarias.Fregex;

import java.util.Scanner;

public class ScannerTeste01 {
    public static void main(String[] args) {
        String texto ="Levi,Éren,Mikasa,true,200";
        /*String[] nomes= texto.split(",");
        for (String nome: nomes){
            System.out.println(nome.trim());
        }*/

        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                int i= scanner.nextInt();
                System.out.println("Int: "+i);
            }else if(scanner.hasNextBoolean()){
                boolean bo= scanner.nextBoolean();
                System.out.println("Boolean: "+bo);
            }else{
                System.out.println(scanner.next());
            }
        }
    }
}
