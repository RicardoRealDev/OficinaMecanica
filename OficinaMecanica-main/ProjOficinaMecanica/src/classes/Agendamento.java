/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;


/**
 *
 * @author capsi
 */
public class Agendamento {
    private int codigo;
    private String data;
    private String hora;
    private String tipoServico;
    private double valor;
    private Veiculo veiculo;
    private Mecanico mecanico;

    public Agendamento(int codigo, String data, String hora, String tipoServico, double valor, Veiculo veiculo, Mecanico mecanico) {
        this.codigo = codigo;
        this.data = data;
        this.hora = hora;
        this.tipoServico = tipoServico;
        this.valor = valor;
        this.veiculo = veiculo;
        this.mecanico = mecanico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\n" 
                + "Data: " + data + "\n" 
                + "Hora: " + hora + "\n" 
                + "Tipo de Serviço: " + tipoServico + "\n" 
                + "Valor: R$ " + valor + "\n" 
                + "Veiculo: " + veiculo.getModelo() + "\n" 
                + "Mecânico: " + mecanico.getNomeCompleto();
    }
    
    
    
    
    
}
