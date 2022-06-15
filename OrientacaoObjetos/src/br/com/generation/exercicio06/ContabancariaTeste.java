package br.com.generation.exercicio06;

public class ContabancariaTeste {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.setNome("Wellington Quadros");
		conta1.setNumeroDaConta(15578-7);
		conta1.setSaldo(4000);
		
		System.out.println("Dono da conta: " + conta1.getNome());
		System.out.println("Número da conta: " + conta1.getNumeroDaConta());
		System.out.println("Saldo: R$ " + conta1.getSaldo());

	}

}
