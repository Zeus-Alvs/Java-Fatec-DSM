package br.edu.fatecpg.jdbc.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:postgresql://localhost:5432/jdbcjava";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "0555";

    public static Connection pegarConexao(){
        try {
            return DriverManager.getConnection(URL,USUARIO,SENHA);
        }
        catch(SQLException e){
            throw new RuntimeException("Erro ao conectar ao banco de dados! Verifique as credenciais.", e);
        }
    }
}
