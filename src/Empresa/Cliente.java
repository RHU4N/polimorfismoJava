package Empresa;

public class Cliente extends Pessoa implements Autenticavel {
    private  double limiteCredito;

    @Override
    public void login(String login, String senha) {
        if (login.equals("jorge") && senha.equals("1123")) {
            System.out.println("Logado com sucesso");
        }else  {
            System.out.println("Login ou senha invalido");
        }
    }
}
