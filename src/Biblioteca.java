import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
    List<Livro> livros = new ArrayList<>();
    List<Autor> autores = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();
    LocalDate dataEmpresta = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dataFormatada = dataEmpresta.format(formatter);

    public void listarLivros(){
        for(Livro livros : livros){
            System.out.println("Livros da biblioteca: " + livros.titulo);
        }
    }

    public void listarLivrosDisponiveis(){
        for(Livro livro : livros){
            if(livro.disponivel){
                System.out.println("Livro(s) disponível(s): " + livro.titulo);
            }
        }
    }

    public void retornaLivroEmprestado(Cliente cliente){
        for(Livro livro : livros){
            if(livro.emprestadoCliente == cliente.nome){
                System.out.println("O livro " + livro.titulo + " está emprestado para o cliente " + cliente.nome + " desde o dia " + dataFormatada);
            }
        }
    }
    public void devolverLivro(Livro livro){
        if(livro.disponivel == false){
            livro.livroDisponivel();
        }else{
            System.out.println("Esse livro já está disponivel!");
        }
    }

    public void retornaClientes(){
        for(Cliente cliente : clientes){
            cliente.getClientes();
        }
    }

    public void livroEmprestado(Cliente cliente, Livro livro) {
        if(livro.disponivel == false){
            System.out.println("Livro indisponivel!");
        }else{
            livro.livroIndisponivel(cliente);
            livro.cliente = cliente;
        }
    }

}
