package Empresa;

public abstract class Funcionario extends Pessoa implements Autenticavel{
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public  double calcularSalario(){
        return salario-300;
    };


    @Override
    public abstract void login(String login, String senha);
}
