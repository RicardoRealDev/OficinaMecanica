/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author capsi
 */
public class Proprietario {
    private String nome;
    private String cpf;
    private String telefone;

    public Proprietario() {
    }
    
    
    
    public Proprietario(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    @Override
    
    public String toString() {
        return "Proprietario: " +
                "nome: " + nome + "\n" +
                ", cpf: " + cpf + "\n" +
                ", telefone: " + telefone + "\n";
    }
    
        
}
