
public class CalculadoraDeDistancias {
	
	Modo tipo;
	
	public CalculadoraDeDistancias (Modo modo) {
		this.tipo = modo;
	}	
	public double calcularDistancia(double x1, double y1, double x2, double y2) {
		
		double distancia = 0.0;
		
		if (this.tipo == Modo.Manhattan){
			
			if (x1 < x2){
				distancia += x2 - x1;				
			} else {
				distancia += x1 - x2;			
			}
			if (y1 < y2){
				distancia += y2 - y1;			
			} else {
				distancia += y1 - y2;				
			}			
		} else {		
			double distanciaX = 0.0;
			double distanciaY = 0.0;
			
			if (x1 < x2){
				distanciaX += x2 - x1;
			} else {
				distanciaX += x1 - x2;
			}
			if (y1 < y2){
				distanciaY += y2 - y1;
			} else {
				distanciaY += y1 - y2;
			}
			distancia = Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
		}
		return distancia;
	}
	
	public void cambiarModo (Modo modo) {
		this.tipo = modo;
	}
	
enum Modo {
	Euler, Manhattan
}
}