package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dominio.Produto;

public class DaoProduto {
	static final String bd = "jdbc:postgresql://localhost/abito21";
	public void incluir(Produto prod){
		String operacao = "INSERT INTO estoque( nome, preco_compra, data_compra, preco_venda) VALUES('"+
				prod.getNome()+ "','" + prod.getPreco_compra()+ "','"+prod.getData_compra()+"','"+prod.getPreco_venda()+"')";
		try {
			Connection conexao = DriverManager.getConnection(bd, "root","postgre");
			PreparedStatement inclusao = conexao.prepareStatement(operacao);
			inclusao.execute();
		}
		catch(SQLException e) {
			System.out.println("Erro de operação em BD");
		}
	}
	public void consultar() {
		
	}

}
