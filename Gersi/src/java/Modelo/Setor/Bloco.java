/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Setor;

/**
 *
 * @author samuel
 */
public class Bloco {
    
    private String nome;
    private String chave;

    public Bloco(String nome, String chave) {
        this.nome = nome;
        this.chave = chave;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }
    
}
