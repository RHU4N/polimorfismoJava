package SupDomingo;

public class Gerente extends Funcionario implements Autenticavel{
    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    public Gerente() {
    }

    @Override
    public boolean login(String usuario, String senha) {
        if (usuario.equals("admin") && senha.equals("admin")) {
            return true;
        }else  {
            return false;
        }
    }
    public String gerenciarTarefas() {
        return "4";
    }
}
