package Empresa;

public class Main {
    static void main() {
        // Criando um Gerente com salario e bonus
        Gerente gerente = new Gerente(5000, 1500);
        gerente.setNome("Carlos");
        gerente.setIdade(40);

        // Criando um Cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Jorge");
        cliente.setIdade(30);

        // Polimorfismo: usando referencia de Pessoa
        Pessoa p1 = gerente;
        Pessoa p2 = cliente;
        System.out.println("Nome: " + p1.getNome() + ", Idade: " + p1.getIdade());
        System.out.println("Nome: " + p2.getNome() + ", Idade: " + p2.getIdade());

        // Polimorfismo: usando referencia de Autenticavel
        Autenticavel auth1 = gerente;
        Autenticavel auth2 = cliente;
        auth1.login("admin", "admin");

        auth2.login("jorge", "123");

        // Calculando salario do gerente (salario - 300 + bonus)
        System.out.println("Salario do gerente: " + gerente.calcularSalario());
    }
}
