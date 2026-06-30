package model;

public class Produto {
	
	private int id;
	private String nome;
	private double preco;
	private int categoria;
	private int quantidadeEstoque;
	
	
	
	public Produto(int id, String nome, double preco, int categoria, int quantidadeEstoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
		this.quantidadeEstoque = quantidadeEstoque;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public int getCategoria() {
		return categoria;
	}



	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}



	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}



	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public void visualizar() {
	    String categoriaTexto = " ";

	    // Categoria é String, pode usar switch com texto
	    switch (this.categoria) {
	        case 1 -> categoriaTexto = "Limpeza";
	        case 2 -> categoriaTexto = "Alimento";
	        default -> categoriaTexto = "Inválido";
	    }

	    System.out.println("\n*****************************************");
	    System.out.println("Dados do Produto");
	    System.out.println("*******************************************");
	    System.out.printf("Id do produto: %d%n", this.id);
	    System.out.printf("Categoria do produto: %s%n", categoriaTexto);
	    System.out.printf("Nome do produto: %s%n", this.nome);
	    System.out.printf("Preço do produto: R$ %.2f%n", this.preco);
	    System.out.printf("Quantidade em estoque: %d%n", this.quantidadeEstoque);
	}

}
