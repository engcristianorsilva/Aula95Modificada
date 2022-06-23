package application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import entities.Product;

public class Program {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US); // tipo formatação numérica
		Scanner sc = new Scanner(System.in); // objeto sc

		// modificação
		JFrame janela = new JFrame();

		String nun = JOptionPane.showInputDialog(janela, "Número de Produtos", "Escrita de Arquivos",
				JOptionPane.QUESTION_MESSAGE);

		int n = Integer.parseInt(nun);

		JOptionPane.showMessageDialog(janela, "Produtos informado com sucesso!", "Escrita de Arquivos",
				JOptionPane.INFORMATION_MESSAGE);

		Product[] vect = new Product[n]; // Classe Product -> vetor de produtos

		for (int i = 0; i < n; i++) {
			String name = JOptionPane.showInputDialog(janela, "Nome", "Nome do Produto", JOptionPane.QUESTION_MESSAGE);

			String preco = JOptionPane.showInputDialog(janela, "Preço", "Preço do Produto",
					JOptionPane.QUESTION_MESSAGE);
			double price = Double.parseDouble(preco);

			System.out.print(name + " ");
			System.out.println(price);

			vect[i] = new Product(name, price);

		}

		// cálculo da média dos preços

		// USAR SEMPRE TOSTRING
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		sc.close(); // Fecha a classe Scanner
	}

}
