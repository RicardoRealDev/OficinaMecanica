/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author capsi
 */
public class Veiculo{
    private String placa;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String cor;
    private Proprietario proprietario;

    public Veiculo(String placa, String marca, String modelo, int anoFabricacao, String cor, Proprietario proprietario) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.proprietario = proprietario;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Veiculo: " +
                "placa: " + placa + "\n" +
                ", marca: " + marca + "\n" +
                ", modelo: " + modelo + "\n" +
                ", ano de fabricacao: " + anoFabricacao +
                ", cor: " + cor + "\n" +
                ", proprietario: " + proprietario;
    }
    
    
    
}
