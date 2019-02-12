package entities;

public class Obubble {
	public Obubble() {
	}

	public String burble_sort(Integer arr[], int tam) {
		long tempoInicial = System.currentTimeMillis();
		double cont = 0;
		int i, j, aux;
		for (i = 0; i < tam; i++) {
			for (j = 0; j < tam - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					cont++;
					aux = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = aux;
				}
			}
		}
		double tempoFinal = (double) (System.currentTimeMillis() - tempoInicial) / 1000;
		/*for(i=0;i<tam;i++) {
			System.out.println(arr[i]);
		}*/ 
		//Se Quiser imprimir os dados
		return "--------------------------" + "\n" + "Tempo da Ordenação:" + String.format(" %.3fs", tempoFinal) + "\n"
				+ "--------------------------\nNumero de trocas:" + String.format("%.0f", cont) + "\n"
				+ "--------------------------";
	}
	
	
}
