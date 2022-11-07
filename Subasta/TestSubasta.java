import org.junit.Assert;
import org.junit.Test;

public class TestSubasta {
	
	@Test
	public void verificarQueSeaElArticuloCorrecto(){
		
		Subasta subasta = new Subasta("auto",10);
		
		String verificacion = subasta.obtenerArticulo();
		
		Assert.assertEquals("auto", verificacion);
	}
	@Test
	public void verificarOferta(){
		
		Subasta subasta = new Subasta("reloj",20);
		
		subasta.ofertar(100);
		
		Assert.assertEquals(100,subasta.ofertaGanadora,0.1);
	}
	@Test
	public void verificarOferta2(){
		
		Subasta subasta = new Subasta("auto",100);
		
		subasta.ofertar(20);
		
		Assert.assertEquals(0.0,subasta.ofertaGanadora ,0.1);
	}
	@Test (expected = Error.class)
	public void verificarOferta3(){
		
		Subasta subasta = new Subasta("auto",100);
		subasta.subastaCerrada = true;
		
		subasta.ofertar(200);
		
		Assert.assertEquals(200, subasta.ofertaGanadora, 0.1);
	}
	@Test
	public void verificarSiLaSubastaEstaCerrada(){
		
		Subasta subasta = new Subasta("auto",100);
		
		subasta.cerrar();
		
		Assert.assertTrue(subasta.subastaCerrada);
	}
}