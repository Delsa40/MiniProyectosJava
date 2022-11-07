
public class TarjetaBaja {
	
	private double saldo = 0;
	private int viajesColectivo;
	private int viajesSubte;
	
	/**
     * post: saldo de la Tarjeta en saldoInicial.
     */
    public TarjetaBaja(double saldoInicial) {
    	if (saldoInicial < 0){
    		throw new Error ("El monto debe ser mayor a cero");
    	}
    	saldo = saldoInicial;
    }
    /**
     * post: devuelve el saldo actual de la Tarjeta
     */
    public double obtenerSaldo() {
    	return saldo;
    	
    } 
    /**
     * post: agrega el monto al saldo de la Tarjeta.
     */
    public void cargar(double monto) {
    	saldo += monto;
    	
    }
    /**
     * post: utiliza 21.50 del saldo para un viaje en colectivo.
     */
    public void pagarViajeEnColectivo() {
    	if (saldo < 21.50){
    		throw new Error("No tiene saldo suficiente");
    	}
    	saldo -= 21.50;
    	viajesColectivo ++;   		
    }
    /**
     * post: utiliza 19.50 del saldo para un viaje en subte. 
     */
    public void pagarViajeEnSubte() {
    	if (saldo < 19.50){
    		throw new Error("No tiene saldo suficiente");
    	}
    	saldo -= 19.50;
    	viajesSubte ++;
    }
    /**
     * post: devuelve la cantidad de viajes realizados.
     */
    public int contarViajes() {
    	return viajesColectivo + viajesSubte;
    }
    /**
     * post: devuelve la cantidad de viajes en colectivo.
     */
    public int contarViajesEnColectivo() {
    	return viajesColectivo;
    }
    /**
     * post: devuelve la cantidad de viajes en subte.
     */
    public int contarViajesEnSubte() {
    	return viajesSubte;
    }
}
