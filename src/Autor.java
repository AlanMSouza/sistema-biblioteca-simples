import java.util.Date;

public class Autor {
    static int contadorId = 1;
    int id;
    String nome;
    String dataNascimento;

    public Autor(String nome, String dataNascimento){
        this.id = contadorId++;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
