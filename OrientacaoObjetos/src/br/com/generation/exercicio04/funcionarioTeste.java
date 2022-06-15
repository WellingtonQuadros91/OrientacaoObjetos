package br.com.generation.exercicio04;

public class funcionarioTeste {

	public static void main(String[] args) {

		Funcionario funicionario1 = new Funcionario();

		funicionario1.setNome("Alanis");
		funicionario1.setSetor("Recursos Humanos");
		funicionario1.setSalario(5000);

		System.out.println("Nome: " + funicionario1.getNome());
		System.out.println("Setor: " + funicionario1.getSetor());
		System.out.println("Salário: R$ " + funicionario1.getSalario());
	}

}
