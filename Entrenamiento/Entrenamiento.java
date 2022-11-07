
public class Entrenamiento {
	
	private double[] recorridos;
	
	/**
	 * pre: "cantidadDeDias" es mayor a 0.
	 * post: entrenamiento listo para registrar las distancias
	 * 	     recorridas en "cantidadDeDias"
	 * @param cantidadDeDias
	 */
	public Entrenamiento (int cantidadDeDias) {
		
		if (cantidadDeDias < 1) {
			throw new Error ("La cantidad de días debe ser mayor a 0");
		}		
		recorridos = new double[cantidadDeDias];
	}	
	/**
	 * pre: "distancia" es mayor o igual a 0.
	 * post: registra la distancia recorrida en el día indicado.
	 * 
	 * @param dia
	 * @param distancia
	 */
	public void registrarRecorrido (int dia, double distancia) {
		
		if (distancia < 0.0) {
			
			throw new Error("La distancia no puede ser menor a 0");
		}
		if ((dia < 1) || (dia > recorridos.length)) {
			
			throw new Error("Día invalido: " + dia);
		}		
		recorridos[dia - 1] = distancia;			
	}
	/**
	 * post: devuelve el promedio de las distancias recorridas [Km].
	 */
	public double calcularRecorridoPromedio() {
		
		double recorridoTotal = 0;
		
		for (int i = 0; i < recorridos.length; i++) {
			
			recorridoTotal += recorridos[i];
		}
		return ( recorridoTotal / recorridos.length);		
	}
	/**
	 * post: devuelve la distancia máxima de los recorridos registrados.
	 */
	public double buscarRecorridoMaximo() {
		
		double maximo = recorridos[0];
		
		for (int i = 1; i < recorridos.length; i++) {
			
			if (recorridos[i] > maximo) {
				maximo = recorridos[i];
			}
		}		
		return maximo;
	}
}