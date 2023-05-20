package user.model;

import sistema.model.Sistema;

public class Role {

    private Long ID;
    private String nome;
    private String descricao;
    private Sistema sistema;


    public Role() {
    }

    public Role(Long ID, String nome, String descricao, Sistema sistema) {
        this.ID = ID;
        this.nome = nome;
        this.descricao = descricao;
        this.sistema = sistema;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }


    @Override
    public String toString() {
        return "Role{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", sistema=" + sistema +
                '}';
    }
}
