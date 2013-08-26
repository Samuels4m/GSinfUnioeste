/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Pessoa;

/**
 * Classe pessoa
 * @version 0.1
 * @author samuel
 */
public class Funcionario extends Pessoa {
    
    private String cargo;

    public Funcionario(String cargo, String nome, String cpf, String rg, String email, String login, String senha, String telefone) {
        super(nome, cpf, rg, email, login, senha, telefone);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
        
}
