package br.edu.fatecpg.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:postgresql://localhost:5432/AtvCnpj";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "fatec777";


    public static Connection pegarConexao(){
        try {
            return DriverManager.getConnection(URL,USUARIO, SENHA);
        }
        catch(SQLException e){
            throw new RuntimeException("Erro ao conectar ao banco de dados.", e);
        }
    }
}
