public class Funcionario implements Sistema{
    Usuario usuario;

    public Funcionario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public Usuario cadastrarUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarUsuario'");
    }

    @Override
    public Livro cadastrarLivro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarLivro'");
    }

    @Override
    public Emprestimo efetuarEmprestimo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'efetuarEmprestimo'");
    }

    @Override
    public void RenovarEmprestimo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'RenovarEmprestimo'");
    }

    @Override
    public String enviarLembrete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enviarLembrete'");
    }

    @Override
    public Relatorio gerarRelatorio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gerarRelatorio'");
    }
}
