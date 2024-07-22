package entities;

public class Produto {
	private String nome;
	private Double preco;
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public static boolean staticProdutoPredicate(Produto p) { // Método estático trabalha com o Produto que passamos como argumeto para ele
		return p.getPreco() >= 100.00;
	}
	
	public boolean nonstaticProdutoPredicate() { // Método não estático é um método da instância, trabalha com o método onde estou. 
		return preco >= 100.00;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + String.format("%.2f", preco) + "]";
	}
	
	
}
