package br.edu.fatecpg.jdbc.controller;
import br.edu.fatecpg.jdbc.model.*;
import java.util.List;

public class TarefaController {
    private TarefaSQL sql;

    public TarefaController() {
        this.sql = new TarefaSQL();
    }

    public void adicionarTarefa(String titulo, String descricao, int categoriaId){
        Tarefa novaTarefa = new Tarefa();
        novaTarefa.setTitulo(titulo);
        novaTarefa.setDescricao(descricao);
        novaTarefa.setCategoriaId(categoriaId);

        sql.adicionar(novaTarefa);
    }

    public List<Tarefa> listarTarefas(){
        return sql.listarTodas();
    }

    public List<Tarefa> listarPorStatus(boolean status) {
        return sql.listarPorStatus(status);
    }

    public List<Tarefa> listarPorCategoria(int categoriaId) {
        return sql.listarPorCategoria(categoriaId);
    }

    public void concluirTarefa(int id){
        sql.marcarConcluida(id);
        System.out.println("Tarefa " + id + " marcada como concluida!");
    }

    public void excluirTarefa(int id){
        sql.excluir(id);
    }
}
