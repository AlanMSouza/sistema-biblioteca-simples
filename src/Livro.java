public class Livro {
    static int contadorId = 1;
    int id;
    String titulo;
    boolean disponivel = true;
    String dataCadastro;
    String dataAtualizacao;
    Autor autor;
    Cliente cliente;
    String emprestadoCliente;

    public Livro(String titulo, String dataCadastro, Autor autor, Biblioteca biblioteca){
        this.id = contadorId++;
        this.titulo = titulo;
        this.dataCadastro = dataCadastro;
        this.autor = autor;
        biblioteca.livros.add(this);
    }

    public void livroDisponivel(){
        this.disponivel = true;
    }

    public void livroIndisponivel(Cliente cliente){
        this.disponivel = false;
        this.emprestadoCliente = cliente.nome;
    }

    public void getAll(){
        System.out.println("Livros da biblioteca");
        System.out.println("Id: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Disponibilidade: " + disponivel);
        System.out.println("Data de cadastro: " + dataCadastro);
        System.out.println("Autor: " + autor.nome);
        System.out.println("---------------------------------");
    }
}
