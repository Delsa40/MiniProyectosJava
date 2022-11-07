import org.junit.Assert;
import org.junit.Test;

public class TestEstacionamientoEjercicio {
	
	@Test
	public void verificarLugaresDisponiblesDelEstacionamiento() {
		EstacionamientoEjercicio estacionamiento = new EstacionamientoEjercicio(new int[] {1,2,3,4,5,6,7,8,9,10});
		
		int disponibles = estacionamiento.lugaresDisponibles();
		
		Assert.assertEquals(10, disponibles);
	}
	@Test
	public void lugar5EstaOcupadoEnElEstacionamiento() {
		EstacionamientoEjercicio estacionamiento = new EstacionamientoEjercicio(new int[] {1,2,3,4,5,6,7,8,9,10});
		
		estacionamiento.ocupar(5);
		
		Assert.assertEquals(-1, estacionamiento.lugares[4]);
	}
	@Test
	public void hayUnLugarOcupadoEnElEstacionamiento(){
		EstacionamientoEjercicio estacionamiento = new EstacionamientoEjercicio(new int[] {1,2,3,4,5,6,7,8,9,10});
		
		estacionamiento.ocupar(8);
				
		Assert.assertEquals(9, estacionamiento.lugaresDisponibles());
	}
	@Test
	public void hay5LugaresDisponiblesEnElEstacionamiento(){
		EstacionamientoEjercicio estacionamiento = new EstacionamientoEjercicio(new int[] {1,2,3,4,5,6,7,8,9,10});
		
		estacionamiento.ocupar(1);
		estacionamiento.ocupar(2);
		estacionamiento.ocupar(3);
		estacionamiento.ocupar(4);
		estacionamiento.ocupar(5);
		
		Assert.assertEquals(5, estacionamiento.lugaresDisponibles());
	}
}