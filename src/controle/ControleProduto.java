package controle;

import dao.DaoProduto;
import dominio.Produto;

public class ControleProduto {
	private Produto prod = new Produto();
	private DaoProduto daoProd = new DaoProduto();
	
	public void cadastraProduto(String nome, String data_compra, int quantidade, float preco_compra, float preco_venda) {
		prod.setNome(nome);
		prod.setData_compra(data_compra);
		prod.setQuantidade(quantidade);
		prod.setPreco_compra(preco_compra);;
		prod.setPreco_venda(preco_venda);
		
		daoProd.incluir(prod);
	}
	public void consultarProduto() {
		
	}

}
