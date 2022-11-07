
public class Subasta {

	String producto;
	double precio = 0.0;
	double ofertaGanadora = 0.0;
	boolean subastaCerrada = false;
	
	/**
	 * pre: el precioBase debe ser mayor a cero.
 	 * post: crea una Subasta para el art�culo indicado y
 	 *       con el precioBase indicado.
 	 */
	public Subasta(String articulo, double precioBase){
		producto = articulo;
		precio = precioBase;
	}
	/**
 	 * post: devuelve el art�culo que se subasta.
 	 */
	public String obtenerArticulo(){
		
		return producto;
	}
	/**
 	 * post: realiza una oferta por el art�culo. Si la oferta es mayor
 	 *       al precioBase y a la ofertaGanadora,
 	 *       esta pasa a ser la nueva ofertaGanadora.
 	 */
	public void ofertar(double oferta){
		
		if (subastaCerrada != true){
			if ((oferta > precio) && (oferta > ofertaGanadora)){
				ofertaGanadora = oferta;
			}
		} else throw new Error("La subasta ya cerr�");
	}
	/**
 	 * post: devuelve la m�xima oferta realizada sobre la Subasta.
 	 */
	public double obtenerOfertaGanadora(){
		
		return ofertaGanadora;
	}
	/**
 	 * post: cierra la Subasta, cualquier oferta realizada con posterioridad
 	 *       es ignorada.
 	 */
	public void cerrar(){
		
		subastaCerrada = true;
	}
}