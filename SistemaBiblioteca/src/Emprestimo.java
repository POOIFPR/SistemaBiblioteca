import java.util.Date;

public class Emprestimo {
    Usuario usuario;
    Date dataEmprestimo;
    Livro livro;
    public Emprestimo(Usuario usuario, Date dataEmprestimo, Livro livro) {
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.livro = livro;
    }
    
}
