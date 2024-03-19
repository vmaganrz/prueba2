package metodos;

public class ejemploFuncionArrays {
	public static double matriz(int[] numeros) {
		double media = 0;
		for (int i = 0; i < numeros.length; i++) {
			media += numeros[i];
		}
		System.out.println(media / numeros.length);
		return media;
	}
	
	public static void main(String[] args) {
		int [] numeros;
		numeros = new int[4];
		numeros[0] = 9;
		numeros[1] = 6;
		numeros[2] = 8;
		numeros[3] = 4;
		matriz(numeros);
	}
}
