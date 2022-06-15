package br.com.generation.exercicio01;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Leonardo");
		cliente1.setIdade(22);
		cliente1.setProfissao("Engenheiro de Software");
		
		System.out.println("Nome: "+ cliente1.getNome());
		System.out.println("Idade: "+ cliente1.getIdade());
		System.out.println("Profissão: "+ cliente1.getProfissao());

	}

}
