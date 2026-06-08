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
public class Atendente extends Profissional {
    private int senhaAcesso;


    public Atendente(int codigo, String nomeCompleto, ArrayList<String> telefones, int senhaAcesso) {
        super(codigo, nomeCompleto, telefones);
        this.senhaAcesso = senhaAcesso;
    }

    
    public int getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(int senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }

    @Override
    public String toString() {
        return super.toString().replace("Profissional", "Atendentes")+ ", " + "senha de Acesso: " + senhaAcesso;
    }
    
    
}
