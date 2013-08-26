/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Setor;

/**
 *
 * @author samuel
 */
public class Setor {
    
    private Bloco bloco;
    private String nome;
    private String chave;

    public Setor(Bloco bloco, String nome, String chave) {
        this.bloco = bloco;
        this.nome = nome;
        this.chave = chave;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
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
