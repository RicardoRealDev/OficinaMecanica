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
public abstract class Profissional {
    private int codigo;
    private String nomeCompleto;
    private ArrayList<String> telefones = new ArrayList<>();

    public Profissional() {
    }
    
    public Profissional(int codigo, String nomeCompleto, ArrayList<String> telefones) {
        this.codigo = codigo;
        this.nomeCompleto = nomeCompleto;
        this.telefones = telefones;
    }
    
    public void addTelefone(String telefone){
        telefones.add(telefone);
    }
    
    public String mostrarTelefones(){
        String todosTelefones = "";
        for(String tel : telefones){
           todosTelefones += tel + " ";
        } return todosTelefones;
    }
    
    public ArrayList<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<String> telefones) {
        this.telefones = telefones;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

 

    @Override
    public String toString() {
        return "Profissional: " + 
                "código: " + codigo + "\n" + 
                ", nome completo: " + nomeCompleto + "\n" +
                ", telefones: " + mostrarTelefones();
    }
    
    
}
