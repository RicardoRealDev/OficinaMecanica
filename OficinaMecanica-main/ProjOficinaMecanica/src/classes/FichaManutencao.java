/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author capsi
 */
public class FichaManutencao implements GerenciarFichaManutencao{
    private int codigo;
    private Veiculo veiculo;
    private ArrayList<Reparo> listaReparos;
    private int proximoCodigoReparo;

    public FichaManutencao(int codigo, Veiculo veiculo) {
        this.codigo = codigo;
        this.veiculo = veiculo;
        this.listaReparos = new ArrayList();
        this.proximoCodigoReparo = 1;
    }

    public int getCodigo() {
        return codigo;
    }


    public Veiculo getVeiculo() {
        return veiculo;
    }

    public ArrayList<Reparo> getListaReparos() {
        return listaReparos;
    }

    @Override
    public void inserirReparo(String nome, double custo, String relato, Categoria categoria, Profissional profissional) {

        Reparo novoReparo = new Reparo(
                proximoCodigoReparo,
                nome,
                custo,
                relato,
                categoria,
                profissional
        );

        listaReparos.add(novoReparo);
        proximoCodigoReparo++;
    }
    
    
    @Override
    public String retornarTodosReparos() {
        String texto = "";

        if (listaReparos.isEmpty()) {
            return "Nenhum reparo cadastrado.";
        }

        for (Reparo r : listaReparos) {
            texto += "Código: " + r.getCodigo()
                    + " | Nome: " + r.getNome()
                    + " | Profissional: " + r.getProfissional().getNomeCompleto()
                    + " | Categoria: " + r.getCategoria().getNome()
                    + " | Data: " + r.getData()
                    + "\n";
        }

        return texto;
    }
    
    @Override
    public String retornarFichaManutencaoCompleta() {
        String texto = "";

        texto += "===== FICHA DE MANUTENÇÃO =====\n";
        texto += "Código da ficha: " + codigo + "\n\n";

        texto += "VEÍCULO:\n";
        texto += veiculo.toString() + "\n\n";

        texto += "REPAROS:\n";

        if (listaReparos.isEmpty()) {
            texto += "Nenhum reparo cadastrado.\n";
        } else {
            for (Reparo r : listaReparos) {
                texto += "-----------------------------\n";
                texto += r.toString() + "\n";
            }
        }

        texto += "\nQuantidade de reparos: " + quantidadeDeReparos();
        texto += "\nCusto total: R$ " + calcularCustoTotal();

        return texto;
    }

    @Override
    public double calcularCustoTotal() {
        double total = 0;

        for (Reparo r : listaReparos) {
            total += r.getCusto();
        }

        return total;
    }

    @Override
    public int quantidadeDeReparos() {
        return listaReparos.size();
    }

    @Override
    public String toString() {
        return "Código da ficha: " + codigo
                + "\nVeículo: " + veiculo.getPlaca()
                + "\nQuantidade de reparos: " + quantidadeDeReparos()
                + "\nCusto total: R$ " + calcularCustoTotal();
    }

}
