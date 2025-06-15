import javax.swing.JOptionPane;

public class Buscar {

    public static void main(String[] args) {
        		
		JOptionPane.showMessageDialog(null, "         Olá usuário\n       Seja bem-vindo!");
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		String titulo = JOptionPane.showInputDialog("Olá " + nome + ", digite o título do livro que você deseja:");
		String autor = JOptionPane.showInputDialog("Pra facilitar a busca, poderia nos informar o nome do autor?");
		JOptionPane.showMessageDialog(null, "Pelo que pude analisar você está buscando um livro chamado " + titulo + " do autor " + autor + ".");
		String nPaginasStrg = JOptionPane.showInputDialog("Estamos tendo dificuldade em localizar. Você lembra quantas páginas ele possuia?");
		int nPaginasInt = Integer.parseInt(nPaginasStrg);
		JOptionPane.showMessageDialog(null, "LIVRO ENCONTRADO!\nO livro é " + titulo + " do autor " + autor + " que possui um total de " + nPaginasInt + " páginas");
		JOptionPane.showMessageDialog(null, "OBRIGADO PELA ATENÇÃO :)");
		System.out.println("FIyukMFDFV");
    }

}
