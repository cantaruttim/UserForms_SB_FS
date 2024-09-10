package com.cantaruttim.fullstack.dto;

import com.cantaruttim.fullstack.domain.User;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;

    public UserDTO() {}

    public UserDTO(User obj) {
        id = obj.getId();
        nome = obj.getNome();
        email = obj.getEmail();
        senha = obj.getSenha();
        telefone = obj.getTelefone();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
