package Empresa;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(double salario, double bonus) {
        super(salario);
        this.bonus = bonus;
    }


    @Override
    public double calcularSalario() {
        return super.calcularSalario()+this.bonus;
    }

    @Override
    public void login(String login, String senha) {
        if (login.equals("admin") && senha.equals("admin")) {
            System.out.println("Logado com sucesso");
        }else {
            System.out.println("Login ou senha invalido");
        }
    }
}
