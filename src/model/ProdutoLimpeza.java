package model;

public class ProdutoLimpeza extends Produto {
	
	private String instrucoesDeUso;
	
	
	public ProdutoLimpeza(int id, String nome, double preco, int categoria, int quantidadeEstoque, String instrucoesDeUso) {
		super(id, nome, preco, categoria, quantidadeEstoque);
		this.instrucoesDeUso = instrucoesDeUso;
	}


	public String getInstrucoesDeUso() {
		return instrucoesDeUso;
	}


	public void setInstrucoesDeUso(String instrucoesDeUso) {
		this.instrucoesDeUso = instrucoesDeUso;
	}
	
	@Override
	public void visualizar() {
		System.out.println("Instruções de uso: " + this.instrucoesDeUso);
	}
	
}
