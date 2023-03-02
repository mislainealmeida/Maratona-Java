package academy.devdojo.maratonajava.Aintroducao;

public class Aula04Condicionais {
    public static void main(String[] args) {

        //If-else
        int idad= 20;
        boolean isAutorizado= idad >=18;

        if(isAutorizado){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        System.out.println("Fora do if");
        System.out.println("------------------");

        int idade = 17;
        String categoria;
        if(idade <15){
            categoria = "Categoria Infantil";
        }else if(idade >=15 && idade< 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
        System.out.println("------------------");

        double salario = 4000;
        String mensagemDoar= "Eu vou doar R$ 500,00 pro DevDojo";
        String mensagemNaoDoar= "Ainda não tenho condições, mas vou ter!";
        String resultado = salario >5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
        //System.out.println(salario >5000 ? mensagemDoar : mensagemNaoDoar);
        System.out.println("------------------");

        //Switch
        byte dia=5;
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.println("----------------");
        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");

        }

    }
}
