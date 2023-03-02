package academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.runtime;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Aula30RunTimeExceptionTeste04 {
    public static void main(String[] args) {
        try{
            throw new IllegalArgumentException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException ");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RunTimeException");
        }

        System.out.println("-----------------------");
        try{
            talvezLanceException();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("-----------------------");
        try{
            talvezLanceException1();
        }catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        }
    }


    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }

    private static void talvezLanceException1() throws SQLException, FileNotFoundException{

    }
}
