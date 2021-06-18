import entities.Vetor;

public class Main {
	public static void main(String[] args) {
		
		double vet1[] = { 90, 88, 78, 76 };
		double vet2[] = { 865, 564, 43, 12 };
		
		Vetor vet = new Vetor();

		System.out.println("Média do vetor 1: " + vet.soma(vet1)/ 4);
		System.out.println("Média do vetor 2: " + vet.soma(vet2)/ 4);
	}

}

/* 5) Identifique e justifique as refatorações aplicadas.
 *  Foi criada a classe Vetor e criado o metodo para somar os valores do vetor*/
