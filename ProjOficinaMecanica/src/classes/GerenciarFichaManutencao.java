package classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author capsi
 */

public interface GerenciarFichaManutencao {

    public void inserirReparo(String nome, double custo,String relato,Categoria categoria,Profissional profissional);

    public String retornarTodosReparos();

    public String retornarFichaManutencaoCompleta();

    public double calcularCustoTotal();

    public int quantidadeDeReparos();
}