package br.com.taskboard.taskboard.model;

public class Tarefas {

    private String titulo;
    private String descricao;
    private int id;

    public Tarefas() {
    }

    public Tarefas(String titulo, String descricao, int id) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
