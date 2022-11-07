
public class EstacionamientoEjercicio {
	
	int[] lugares;
	int disponibles;
	int ocupados = 0;
	
	/*
	 * pre: tamanio debe ser mayor a 0.
	 * post: crea un estacionamiento con la cantidad de lugares insertados. 
	 */
	public EstacionamientoEjercicio (int[] tamanio){
		
		this.lugares = tamanio;
		this.disponibles = lugares.length;
	}
	public int lugaresDisponibles() {
				
		return disponibles;
	}
	public void ocupar(int posicion) {
		
		if ((posicion > lugares.length) || (posicion < 1)){
			throw new Error("Esa posicion no existe");
		}
		if (lugares[posicion - 1] == -1){
			throw new Error("Esa posicion ya esta ocupada");
		}
		lugares[posicion - 1] = -1;
		disponibles--;
		ocupados++;
	}
	public void desocupar(int posicion) {
		
		if ((posicion > lugares.length) || (posicion < 1)){
			throw new Error("Esa posicion no existe");
		}
		if (lugares[posicion - 1] == 0){
			throw new Error("Esa posicion ya esta desocupada");
		}
		lugares[posicion - 1] = 0;
		disponibles++;
		ocupados--;
	}
	public double porcentajeDeOcupados() {
		double porcentaje = 0.0;
		
		porcentaje = (ocupados*100)/lugares.length;
		
		return porcentaje;
	}
}