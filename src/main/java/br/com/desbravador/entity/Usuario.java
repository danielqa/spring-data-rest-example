package br.com.desbravador.entity;

import javax.persistence.Entity;

/**
 * @author Daniel Queiroz
 */
@Entity
public class Usuario extends Model<Integer> {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
