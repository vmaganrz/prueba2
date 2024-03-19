package metodos;

public class Metodos {
	//Funciones
	
	//Se usa cuando devuelve algo
	public static int metodo1(int num1, int num2) {
		//int resultado = num1 * num2;
		//return resultado
		return (num1 * num2);
	}
	
	//Cuando no hace falta devolver algo
	public static void metodo2 (String dato) {
		System.out.println(dato + dato);
	}
	
	
	public static void main(String[] args) {
		int valor = metodo1(1,3);
		System.out.println(valor);
		metodo2("Hola");
	}
}
