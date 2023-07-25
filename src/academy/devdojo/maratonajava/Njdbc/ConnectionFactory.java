package academy.devdojo.maratonajava.Njdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //java.sql = Connection, Statement, ResultSet, DriverManager
    public static Connection getConnection() throws SQLException {//precisar tratar a exceção.
        String url= "jdbc:postgresql://localhost:5433/anime_store";//jdbc:BD: onde esta o BD:porta/nome_bd
        String usuario="postgres";
        String senha = "1234";

            return DriverManager.getConnection(url, usuario, senha);

    }

}
