package br.com.generation.exercicio03;

public class ProdutoEletronicoTeste {

	public static void main(String[] args) {
		
		ProdutoEletronico produto1 = new ProdutoEletronico();
		
		produto1.setProduto("Televisão 60 polegadas");	
		produto1.setPreco(3000);
		produto1.setTipo("Smart TV Led");
		
		System.out.println(produto1.getProduto());
		System.out.println("A televisão custa R$ " + produto1.getPreco());
		System.out.println("O tipo da televisão é: " + produto1.getTipo());
		
	}
}
