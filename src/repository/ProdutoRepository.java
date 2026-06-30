package repository;

import model.Produto;

public interface ProdutoRepository {
	
	//Método CRUD
	
	public void listarTodas();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void procurarPorId(int id);
	public void deletar(int id);

}
