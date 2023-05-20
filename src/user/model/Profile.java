package user.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Profile {

    private Long ID;
    private String nome;

    private Collection<Role> roles = new Vector<>();



    public Profile addRole(Role role){
        this.roles.add(role);
        return this;
    }

    public Profile removeRole(Role role){
        this.roles.remove(role);
        return this;
    }

    public Collection<Role> getRoles(){
        return Collections.unmodifiableCollection(this.roles);
    }



    public Profile() {
    }


    public Profile(Long ID, String nome, Collection<Role> roles) {
        this.ID = ID;
        this.nome = nome;
        this.roles = roles;
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


    @Override
    public String toString() {
        return "Profile{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", roles=" + roles +
                '}';
    }
}
