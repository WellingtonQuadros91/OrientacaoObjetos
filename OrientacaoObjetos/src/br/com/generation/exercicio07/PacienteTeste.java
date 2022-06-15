package br.com.generation.exercicio07;

public class PacienteTeste {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		
		paciente1.setNome("Gabriel");
		paciente1.setCPF(112761155-04);
		paciente1.setIdade(26);
		paciente1.setGenero('M');
		
		System.out.println("O nome do paciente é: " + paciente1.getNome());
		System.out.println("CPF do paciente: " + paciente1.getCPF());
		System.out.println("Idade: " + paciente1.getIdade());
		System.out.println("Genero: " + paciente1.getGenero());

	}

}
