package br.edu.fatecpg.jdbc.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TarefaSQL {
    private Connection conexao;

    public TarefaSQL(){
        this.conexao = Conexao.pegarConexao();
    }

    public void adicionar(Tarefa tarefa){
        String sql = "INSERT INTO tarefas(titulo, descricao, categoria_id) VALUES (?,?,?)";

        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, tarefa.getTitulo());
            stmt.setString(2, tarefa.getDescricao());
            stmt.setInt(3, tarefa.getCategoriaId());

            stmt.execute();
            stmt.close();

            System.out.println("Tarefa '" + tarefa.getTitulo() + "' salva com sucesso!");
        } catch (SQLException e){
            throw new RuntimeException("Erro ao salvar a tarefa!", e);
        }
    }

    public void excluir(int id){
        String sql = "DELETE FROM tarefas WHERE id = ?";

        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.execute();
            stmt.close();

            System.out.println("Tarefa '" + id + "' excluida com sucesso!");
        } catch (SQLException e){
            throw new RuntimeException("Erro ao excluir a tarefa!", e);
        }
    }

    public void marcarConcluida(int id){
        String sql = "UPDATE tarefas SET concluida = true WHERE id = ?";

        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.execute();
            stmt.close();
        } catch (SQLException e){
            throw new RuntimeException("Erro ao atualizar a tarefa!", e);
        }
    }

    public List<Tarefa> listarTodas(){
        List<Tarefa> listaDeTarefas = new ArrayList<>();

        String sql = "SELECT * FROM tarefas";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                Tarefa tarefa = new Tarefa();

                tarefa.setId(rs.getInt("id"));
                tarefa.setTitulo(rs.getString("titulo"));
                tarefa.setDescricao(rs.getString("descricao"));
                tarefa.setConcluida(rs.getBoolean("concluida"));
                tarefa.setCategoriaId(rs.getInt("categoria_id"));

                listaDeTarefas.add(tarefa);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e){
            throw new RuntimeException("Erro ao listar as tarefas!", e);
        }
        return listaDeTarefas;
    }

    public List<Tarefa> listarPorStatus(boolean status) {
        List<Tarefa> lista = new ArrayList<>();
        String sql = "SELECT * FROM tarefas WHERE concluida = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setBoolean(1, status);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Tarefa tarefa = new Tarefa();
                tarefa.setId(rs.getInt("id"));
                tarefa.setTitulo(rs.getString("titulo"));
                tarefa.setDescricao(rs.getString("descricao"));
                tarefa.setConcluida(rs.getBoolean("concluida"));
                tarefa.setCategoriaId(rs.getInt("categoria_id"));

                lista.add(tarefa);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao filtrar por status!", e);
        }
        return lista;
    }

    public List<Tarefa> listarPorCategoria(int categoriaId) {
        List<Tarefa> lista = new ArrayList<>();
        String sql = "SELECT * FROM tarefas WHERE categoria_id = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, categoriaId); // Troca a interrogação pelo ID da categoria
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Tarefa tarefa = new Tarefa();
                tarefa.setId(rs.getInt("id"));
                tarefa.setTitulo(rs.getString("titulo"));
                tarefa.setDescricao(rs.getString("descricao"));
                tarefa.setConcluida(rs.getBoolean("concluida"));
                tarefa.setCategoriaId(rs.getInt("categoria_id"));

                lista.add(tarefa);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao filtrar por categoria!", e);
        }
        return lista;
    }

}
