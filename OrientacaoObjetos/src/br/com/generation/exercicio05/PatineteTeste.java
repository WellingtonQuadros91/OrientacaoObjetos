package br.com.generation.exercicio05;

public class PatineteTeste {

	public static void main(String[] args) {
		
		Patinete patinete1 = new Patinete();
		
		patinete1.setCor("Preto com detalhes verde");
		patinete1.setTipo("El�trico");
		patinete1.setVelocidade(30);
		
		System.out.println("A cor do patinete comprado �: " + patinete1.getCor());
		System.out.println("O tipo do patinete �: " + patinete1.getTipo());
		System.out.println("A velocidade m�xima do patinete �: " + patinete1.getVelocidade() + " Km/h");
	}

}
