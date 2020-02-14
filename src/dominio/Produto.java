package dominio;

public class Produto {
	
		private int codigo, quantidade;
		private String nome, data_compra;
		private float preco_compra, preco_venda;
		
		public Produto(){
			
		}
		
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		
		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public float getPreco_compra() {
			return preco_compra;
		}
		public void setPreco_compra(float preco_compra) {
			this.preco_compra = preco_compra;
		}
		public String getData_compra() {
			return data_compra;
		}
		public void setData_compra(String data_compra) {
			this.data_compra = data_compra;
		}
		public float getPreco_venda() {
			return preco_venda;
		}
		public void setPreco_venda(float preco_venda) {
			this.preco_venda = preco_venda;
		}
	}
