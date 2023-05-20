import pessoa.model.Pessoa;
import pessoa.model.PessoaFisica;
import pessoa.model.PessoaJuridica;
import sistema.model.Sistema;
import user.model.Profile;
import user.model.Role;
import user.model.User;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Objects;

public class Main {

        public static PessoaFisica novaPessoa(Long id, String nome, LocalDate nascimento, String CPF ){
            PessoaFisica pf = new PessoaFisica();
            pf.setId(id);
            pf.setNome(nome);
            pf.setNascimento(nascimento);
            pf.setCPF(CPF);
            return pf;

        }

        public static PessoaJuridica novaPessoaJuridica(Long id, String nome, LocalDate fundacao, String CNPJ){
            PessoaJuridica pj = new PessoaJuridica();
            pj.setId(id);
            pj.setNome(nome);
            pj.setNascimento(fundacao);
            pj.setCNPJ(CNPJ);
            return pj;
        }

        public static User novoUsuario(Long ID, String email, String password, Pessoa pessoa){
            User us = new User();
            us.setID(ID);
            us.setEmail(email);
            us.setPassword(password);
            us.setPessoa(pessoa);
            return us;
        }

        public static Profile novoProfile(Long ID, String nome){
            Profile pr = new Profile();
            pr.setID(ID);
            pr.setNome(nome);
            return pr;
        }

        public static Role novoRole(Long ID, String nome, String descricao, Sistema sistema){
            Role rl = new Role();
            rl.setID(ID);
            rl.setNome(nome);
            rl.setDescricao(descricao);
            rl.setSistema(sistema);
            return rl;
        }

        public static Sistema novoSistema(Long ID, String nome, String sigla){
            Sistema si = new Sistema();
            si.setID(ID);
            si.setNome(nome);
            si.setSigla(sigla);
            return si;
        }

        public static void main(String[] args) {

            PessoaFisica ang = novaPessoa(555L, "Angelo", LocalDate.of(2004, 1, 16), "456733");
            PessoaJuridica holding = novaPessoaJuridica(515L, "Holding", LocalDate.of(1999, 5, 17), "6543879/0001-98");
            User angF8 = novoUsuario(777L, "ang.fon@gmail.com", "ANG16", ang);
            Profile gerente = novoProfile(333L, "Gerente Claudio");
            Sistema loja = novoSistema(3456L, "BravoJogos", "Bravogames");
            Role vender_jogo = novoRole(4323L, "vender", "Vender boardgame", loja);
            PessoaFisica marcelo = novaPessoa(432L, "Marcelo", LocalDate.of(2023, 2, 11), "1734447");

            ang.addFilho(marcelo);
            holding.addSocio(ang).addSocio(marcelo);
            angF8.addProfile(gerente);
            gerente.addRole(vender_jogo);
            loja.addResponsavel(ang);


            var login = JOptionPane.showInputDialog("Digite seu email:");
            var senha = JOptionPane.showInputDialog("Digite sua senha:");

            if (Objects.equals(login, angF8.getEmail()) && Objects.equals(senha, angF8.getPassword())) {
                System.out.println("Login concluido");
            } else {
                System.out.println("Email ou senha incorreto");
            }
        }

}
