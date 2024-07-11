public interface Sistema {
    public Usuario cadastrarUsuario();

    public Livro cadastrarLivro();

    public Emprestimo efetuarEmprestimo();

    public void RenovarEmprestimo();

    public String enviarLembrete();

    public Relatorio gerarRelatorio();
}
