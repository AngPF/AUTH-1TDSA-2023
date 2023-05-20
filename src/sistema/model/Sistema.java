package sistema.model;

import user.model.Role;
import pessoa.model.Pessoa;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Sistema {

    private Long ID;
    private String nome;
    private String sigla;

    private Collection<Pessoa> responsaveis = new Vector<>();

    public Sistema addResponsavel(Pessoa responsavel){
        this.responsaveis.add(responsavel);
        return this;
    }
    public Sistema removeResponsavel(Pessoa responsavel){
        this.responsaveis.remove(responsavel);
        return this;
    }


    public Collection<Pessoa> getResponsaveis(){
        return Collections.unmodifiableCollection(this.responsaveis);
    }




    public Sistema() {
    }

    public Sistema(Long ID, String nome, String sigla, Collection<Pessoa> responsaveis) {
        this.ID = ID;
        this.nome = nome;
        this.sigla = sigla;
        this.responsaveis = responsaveis;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }


    @Override
    public String toString() {
        return "Sistema{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", responsaveis=" + responsaveis +
                '}';
    }
}
