package br.com.jose;

public class Produtos {

	private int cod;
	private String nome;
	private Double peso;
	private Double valor_Venda;
	private Double valor_Custo;
	private int qtd;
	
	

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getValor_Venda() {
		return valor_Venda;
	}

	public void setValor_Venda(Double valor_Venda) {
		this.valor_Venda = valor_Venda;
	}

	public Double getValor_Custo() {
		return valor_Custo;
	}

	public void setValor_Custo(Double valor_Custo) {
		this.valor_Custo = valor_Custo;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

}
