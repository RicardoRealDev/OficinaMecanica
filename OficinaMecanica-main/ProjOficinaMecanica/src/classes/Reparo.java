/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalDate;

public class Reparo {
    private int codigo;
    private String nome;
    private LocalDate data;
    private double custo;
    private String relato;
    private Categoria categoria;
    private Profissional profissional;

    public Reparo(int codigo, String nome, double custo, String relato,
                  Categoria categoria, Profissional profissional) {
        this.codigo = codigo;
        this.nome = nome;
        this.data = LocalDate.now();
        this.custo = custo;
        this.relato = relato;
        this.categoria = categoria;
        this.profissional = profissional;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }

    public double getCusto() {
        return custo;
    }

    public String getRelato() {
        return relato;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setRelato(String relato) {
        this.relato = relato;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\n"
                + "Nome: " + nome + "\n"
                + "Data: " + data + "\n"
                + "Custo: R$ " + custo + "\n"
                + "Relato: " + relato + "\n"
                + "Categoria: " + categoria.getNome() + "\n"
                + "Profissional: " + profissional.getNomeCompleto();
    }
}
