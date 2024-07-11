import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario userOne = new Usuario("Junior", "44 9 94562831", "11111111111");
        Usuario userTwo = new Usuario("Mateus", "44 9 95684215", "22222222222");
        Usuario userThree = new Usuario("Lucas", "44 9 84567548", "33333333333");
    
        Aluno aluno = new Aluno(userOne, "20230005421");
        Professor professor = new Professor(userTwo);
        Funcionario funcionario = new Funcionario(userThree);
        
        Livro livro = new Livro("Robinson Crusoé",
         "Daniel Defoe",
          "Positivo",
           new Categoria("Aventura", "Essa categoria trata de livros sobre aventuras diversas, geralmente fictícias"));

        Emprestimo emprestimo = new Emprestimo(userOne, new Date(), livro);
        String[][] dados = new String[3][2];
        Relatorio relatorio = new Relatorio("Relatório total de empréstimos de Abril", 6, dados);
    }
}
