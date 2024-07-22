package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		Double min = 100.00;
		
		Predicate<Produto> pred = p -> p.getPreco() >= min;
		
		// list.removeIf(p -> p.getPreco() >= 100.00);
		/*
		 * quando colocamos uma função Lambda como argumento, estamos subtituindo a criação de uma classe  para implementar esse Predicate ( ou o Comparator
		 * na Aula passada). A Classe ProdutoOredicate é uma Classe Abstrata que vai implementar uma Interface Funcional. no caso Predicate.
		 */
		// list.removeIf(new ProdutoOredicate()); // Chamando a Classe criada implemetando a Interface Funcional
		
		// Reference Method com método estático
		//list.removeIf(Produto::staticProdutoPredicate); 
		// É chamado de Method Reference: Nome da Classe + : : + nome do método dentro da classe que tem de ser estático.
		
		// Reference Method com método não estático
		//list.removeIf(Produto::nonstaticProdutoPredicate);
		
		// Com expressão Lambda declarada
		//list.removeIf(pred);
		
		// Com expressão Lambda inline
		list.removeIf(p -> p.getPreco() >= min);
		
		for (Produto p : list) {
			System.out.println(p);
		}
	}

}
