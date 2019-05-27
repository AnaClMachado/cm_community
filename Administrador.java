/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Gustavo Ferreira
 */
public class Administrador {
    private String nome = "admin";
    private String senha = "admin";
    Exemplar j = new Exemplar();

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void cadastros(){
        j.cadastrar_livro();
        
        
    }
   
    
   
    
}
