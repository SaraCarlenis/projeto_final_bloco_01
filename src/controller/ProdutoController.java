package controller;

import java.util.ArrayList;
import java.util.List;

import model.Produto;
import repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;

	@Override
	public void listarTodas() {
		
		for(var produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nProduto Cadastrado com sucesso!");		
	}

	@Override
	public void atualizar(Produto produto) {
		var buscarProduto = buscarNaCollection(produto.getId());
		
		if(buscarProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto);
			System.out.printf("\nO Produto id: %d foi atualizado com sucesso!%n", produto.getId());
		}else {
			System.out.printf("\nO Produto id: %d não foi encontradoa!%n", produto.getId());
		}
		
	}

	@Override
	public void procurarPorId(int id) {
		var produto = buscarNaCollection(id);
		
		if(produto != null) {
			produto.visualizar();
		}else {
			System.out.printf("\nO Produto id: %d não foi encontrado!%n", id);
		}
				
	}
	
	public int gerarId() {
		return ++ id;
	}

	private Produto buscarNaCollection(int id2) {
		for(var produto : listaProdutos) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		
		return null;
	}

	@Override
	public void deletar(int id) {
		var produto = buscarNaCollection(id);
		
		if(produto != null) {
			if(listaProdutos.remove(produto) == true) {
				System.out.printf("\nO produto id %d foi deletado com sucesso!%n", id);
			}
		}else {
			System.out.printf("\nO Produto id: %d não foi encontrado!%n", id);
		}		
	}
}
