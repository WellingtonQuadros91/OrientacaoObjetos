package br.com.generation.exercicio01;

public class Cliente {

	private String nome;
	private int idade;
	private String profissao;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, int idade, String profissao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", profissao=" + profissao + "]";
	}
	
}
