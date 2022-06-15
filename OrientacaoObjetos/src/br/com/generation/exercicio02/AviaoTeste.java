package br.com.generation.exercicio02;

public class AviaoTeste {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		aviao1.setCompanhia("Latam");
		aviao1.setLocalSaida("Brasil");
		aviao1.setDestino("Barcelona");
		aviao1.setNumeroDePassageiros(50);
		
		System.out.println("Companhia: " + aviao1.getCompanhia());
		System.out.println("Saída: " + aviao1.getLocalSaida());
		System.out.println("Destino: " + aviao1.getDestino());
		System.out.println("Números de passageiros: " + aviao1.getNumeroDePassageiros());
	}

}
