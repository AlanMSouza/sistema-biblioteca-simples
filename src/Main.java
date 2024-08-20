public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Autor autor1 = new Autor("Stephen King", "02/09/1953");
        Autor autor2 = new Autor("Antony Burges", "24/08/1960");
        Livro livro1 = new Livro("Outsider", "20/08/2024", autor1, biblioteca);
        Livro livro2 = new Livro("Misery", "21/08/2024", autor1, biblioteca);
        Livro livro3 = new Livro("Laranja Mecanica", "24/08/2024", autor2, biblioteca);
        Cliente cliente1 = new Cliente("Alan Moreira de Souza", "08/12/2002", "alan@gmail.com", biblioteca);
        Cliente cliente2 = new Cliente("Joao de Souza", "10/109/1990", "joao@gmail.com", biblioteca);
        biblioteca.livroEmprestado(cliente1, livro1);
        biblioteca.livroEmprestado(cliente1, livro2);
        biblioteca.retornaLivroEmprestado(cliente1);
        biblioteca.listarLivros();
        biblioteca.listarLivrosDisponiveis();
    }
}