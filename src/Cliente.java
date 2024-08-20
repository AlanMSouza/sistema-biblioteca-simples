import java.util.ArrayList;
import java.util.List;

public class Cliente {
    static int contadorId = 1;
    int id;
    String nome;
    String dataNascimento;
    String email;
    public Cliente(String nome, String dataNascimento, String email, Biblioteca biblioteca){
        this.id = contadorId++;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        biblioteca.clientes.add(this);
    }

    public void getClientes(){
        System.out.println("Clientes cadastrados:");
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Email: " + email);
        System.out.println("---------------------------------");
    }
}
