package com.example.biblioteca.model;

public class Emprestimo {
    private String livro;
    private String usuario;
    private String dataEmprestimo;
    private String dataDevolucao;

    public String getLivro() { return livro; }
    public void setLivro(String livro) { this.livro = livro; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getDataEmprestimo() { return dataEmprestimo; }
    public void setDataEmprestimo(String dataEmprestimo) { this.dataEmprestimo = dataEmprestimo; }

    public String getDataDevolucao() { return dataDevolucao; }
    public void setDataDevolucao(String dataDevolucao) { this.dataDevolucao = dataDevolucao; }
}
