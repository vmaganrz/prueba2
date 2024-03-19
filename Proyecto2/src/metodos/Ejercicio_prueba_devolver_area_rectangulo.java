package metodos;

public class Ejercicio_prueba_devolver_area_rectangulo {
	public static double areaRectangulo(double base, double altura) {
		double area;
		area = base * altura;
		return area;
	}
	
	
	public static void main(String[] args) {
		System.out.println(areaRectangulo(5, 3));
	}
}
