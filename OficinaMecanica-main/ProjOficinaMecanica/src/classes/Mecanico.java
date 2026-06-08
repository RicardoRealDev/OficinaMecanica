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
public class Mecanico extends Profissional {
    private int numCertificacao;
    private String areaEspec;


    public Mecanico(int codigo, String nomeCompleto, ArrayList<String> telefones, int numCertificacao, String areaEspec) {
        super(codigo, nomeCompleto, telefones);
        this.numCertificacao = numCertificacao;
        this.areaEspec = areaEspec;
    }
    
    public int getNumCertificacao() {
        return numCertificacao;
    }

    public void setNumCertificacao(int numCertificacao) {
        this.numCertificacao = numCertificacao;
    }

    public String getAreaEspec() {
        return areaEspec;
    }

    public void setAreaEspec(String areaEspec) {
        this.areaEspec = areaEspec;
    }

    @Override
    public String toString() {
        return super.toString().replace("Profissional", "Mecanicos")
                + ", " + "número de certificação: " + numCertificacao + "\n" +
                ", area de especialização: " + areaEspec;
    }

   
}
