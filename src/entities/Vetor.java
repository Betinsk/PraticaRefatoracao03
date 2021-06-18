package entities;

public class Vetor {

	public double soma(double[] vetor) {
		double soma = 0;

		for (int i = 0; i < 4; i++) {
			soma = soma + vetor[i];
		}
		return soma;
	}

}
