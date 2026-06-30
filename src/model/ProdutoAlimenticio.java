package model;

public class ProdutoAlimenticio extends Produto {
	
	private String informacaoNuticional;
	private String tipoAlimento;
	private String origem;
	
	public ProdutoAlimenticio(int id, String nome, double preco, int categoria, int quantidadeEstoque,
			String informacaoNuticional, String tipoAlimento, String origem) {
		super(id, nome, preco, categoria, quantidadeEstoque);
		this.informacaoNuticional = informacaoNuticional;
		this.tipoAlimento = tipoAlimento;
		this.origem = origem;
		
	}

	public String getInformacaoNuticional() {
		return informacaoNuticional;
	}

	public void setInformacaoNuticional(String informacaoNuticional) {
		this.informacaoNuticional = informacaoNuticional;
	}

	public String getTipoAlimento() {
		return tipoAlimento;
	}

	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	@Override
	public void visualizar() {
		System.out.println("Informação nuticional: " + this.informacaoNuticional);
		System.out.println("Tipo de alimento: " + this.tipoAlimento);
		System.out.println("Produto de origem Nacional ou Internacioal: " + this.origem);
	}
	
}
